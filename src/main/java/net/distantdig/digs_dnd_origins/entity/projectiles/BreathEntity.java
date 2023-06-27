package net.distantdig.digs_dnd_origins.entity.projectiles;

import net.minecraft.block.AbstractBlock;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BreathEntity extends ProjectileEntity {

    public BreathEntity(EntityType<? extends ProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    int t;
    public void tick() {
        super.tick();
        Vec3d vec3d = this.getVelocity();
        HitResult hitResult = ProjectileUtil.getCollision(this, this::canHit);
        this.onCollision(hitResult);
        double d = this.getX() + vec3d.x;
        double e = this.getY() + vec3d.y;
        double f = this.getZ() + vec3d.z;
        this.updateRotation();
        float g = 0.99F;
        float h = 0.06F;
        if (this.getWorld().getStatesInBox(this.getBoundingBox()).noneMatch(AbstractBlock.AbstractBlockState::isAir)) {
            this.discard();
        } else if (this.isInsideWaterOrBubbleColumn()) {
            this.discard();
        } else {
            this.setVelocity(vec3d.multiply(0.9900000095367432));
            this.setPosition(d, e, f);
        }

        this.createParticle();

        //how long in ticks the entity will exist
        if (t >= 20) {
            if (!this.getWorld().isClient) {
                this.getWorld().sendEntityStatus(this, (byte)3);
                this.kill();
            }
        } else {
            t++;
        }
    }
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity var3 = this.getOwner();
        if (var3 instanceof LivingEntity livingEntity) {
            entityHitResult.getEntity().damage(this.getDamageSources().mobProjectile(this, livingEntity), 0.0F);
            livingEntity.playSound(this.getSoundEvent(), this.getVolume(), this.getPitch());
        }
    }
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (!this.getWorld().isClient) {
            this.discard();
        }
    }
    @Override
    protected void initDataTracker() {
    }

    //To Override in each breath element
    public SoundEvent getSoundEvent() {
        return null;
    }
    public float getVolume() {
        return 0.0f;
    }
    public float getPitch() {
        return 0.0f;
    }
    public void createParticle() {
        this.getWorld().addParticle(ParticleTypes.SPIT, this.getX(), this.getY(), this.getZ(),
                (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2); //movement of the particle from projectile
    }
}
