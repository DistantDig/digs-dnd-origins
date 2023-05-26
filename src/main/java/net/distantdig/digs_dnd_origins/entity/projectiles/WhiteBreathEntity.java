package net.distantdig.digs_dnd_origins.entity.projectiles;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.EndGatewayBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WhiteBreathEntity extends ThrownItemEntity {
    public WhiteBreathEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public WhiteBreathEntity(EntityType<? extends ThrownItemEntity> entityType, double d, double e, double f, World world) {
        super(DndOrigins.WhiteBreathEntityType, d, e, f, world);
    }

    public WhiteBreathEntity(EntityType<? extends ThrownItemEntity> entityType, LivingEntity livingEntity, World world) {
        super(DndOrigins.WhiteBreathEntityType, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    int t = 0;
    @Override
    public void tick(){
        float h;
        super.tick();
        HitResult hitResult = ProjectileUtil.getCollision(this, this::canHit);
        boolean bl = false;
        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockPos = ((BlockHitResult)hitResult).getBlockPos();
            BlockState blockState = this.world.getBlockState(blockPos);
            if (blockState.isOf(Blocks.NETHER_PORTAL)) {
                this.setInNetherPortal(blockPos);
                bl = true;
            } else if (blockState.isOf(Blocks.END_GATEWAY)) {
                BlockEntity blockEntity = this.world.getBlockEntity(blockPos);
                if (blockEntity instanceof EndGatewayBlockEntity && EndGatewayBlockEntity.canTeleport(this)) {
                    EndGatewayBlockEntity.tryTeleportingEntity(this.world, blockPos, blockState, this, (EndGatewayBlockEntity)blockEntity);
                }
                bl = true;
            }
        }
        if (hitResult.getType() != HitResult.Type.MISS && !bl) {
            this.onCollision(hitResult);
        }
        this.checkBlockCollision();
        Vec3d vec3d = this.getVelocity();
        double d = this.getX() + vec3d.x;
        double e = this.getY() + vec3d.y;
        double f = this.getZ() + vec3d.z;
        this.updateRotation();
        if (this.isTouchingWater()) {
            for (int i = 0; i < 4; ++i) {
                float g = 0.25f;
                this.world.addParticle(ParticleTypes.BUBBLE, d - vec3d.x * 0.25, e - vec3d.y * 0.25, f - vec3d.z * 0.25, vec3d.x, vec3d.y, vec3d.z);
            }
            h = 0.8f;
        } else {
            h = 0.99f;
        }
        this.setVelocity(vec3d.multiply(h));
        if (!this.hasNoGravity()) {
            Vec3d vec3d2 = this.getVelocity();
            this.setVelocity(vec3d2.x, vec3d2.y - (double)this.getGravity(), vec3d2.z);
        }
        this.setPosition(d, e, f);

        this.world.addParticle(this.getParticleType(), d, e + 0.5, f,
                (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2); //movement of the particle from projectile

        if (t >= 20) { //the amount of ticks the projectile will stay alive
            if (!this.world.isClient) { // checks if the world is client
                this.world.sendEntityStatus(this, (byte)3); // particle?
                this.kill(); // kills the projectile
            }
        } else {
            t++;
        }
    }
    protected float getGravity() {
        return 0.0f;
    }
    protected ParticleEffect getParticleType() {
        return ParticleTypes.CLOUD; //particle type
    }
    protected void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)
        int i = 0; // the amount of damage to deal
        entity.damage(world.getDamageSources().thrown(this, this.getOwner()), (float)i); // deals damage

        if (entity instanceof LivingEntity livingEntity) { // checks if entity is an instance of LivingEntity (meaning it is not a boat or minecart)
            livingEntity.playSound(SoundEvents.ENTITY_PLAYER_HURT_FREEZE, 2F, 1F); // plays a sound for the entity hit only
        }
    }
    protected void onCollision(HitResult hitResult) { // called on collision with a block
        super.onCollision(hitResult);
        if (!this.world.isClient) { // checks if the world is client
            this.world.sendEntityStatus(this, (byte)3); // particle?
            this.kill(); // kills the projectile
        }

    }
}