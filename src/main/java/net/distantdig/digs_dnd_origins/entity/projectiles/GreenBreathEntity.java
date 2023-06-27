package net.distantdig.digs_dnd_origins.entity.projectiles;

import net.distantdig.digs_dnd_origins.particle.ModParticles;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class GreenBreathEntity extends BreathEntity{
    public GreenBreathEntity(EntityType<? extends ProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ENTITY_PLAYER_HURT_ON_FIRE;
    }
    @Override
    public float getVolume() {
        return 2F;
    }
    @Override
    public float getPitch() {
        return 1F;
    }
    @Override
    public void createParticle() {
        this.getWorld().addParticle(ModParticles.GREEN_BREATH_PARTICLE,
                (Math.random() - 0.5) + this.getX(), Math.random() + this.getY(), (Math.random() - 0.5) + this.getZ(),
                (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.2);
    }
}
