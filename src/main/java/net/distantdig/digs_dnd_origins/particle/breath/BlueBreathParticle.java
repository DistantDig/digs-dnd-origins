package net.distantdig.digs_dnd_origins.particle.breath;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class BlueBreathParticle extends SpriteBillboardParticle {
    private final SpriteProvider sprites;
    protected BlueBreathParticle(ClientWorld world, double x, double y, double z,
                                 SpriteProvider spriteSet, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z, 0.0, 0.0, 0.0);

        this.velocityMultiplier = 0.96f;
        this.sprites = spriteSet;
        this.velocityX *= (double)0.1f;
        this.velocityY *= (double)0.1f;
        this.velocityZ *= (double)0.1f;
        this.velocityX += velocityX;
        this.velocityY += velocityY;
        this.velocityZ += velocityZ;
        this.scale = 0.25f;
        int i = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.maxAge = (int)Math.max((float)i * 1.0f, 1.0f);
        this.setSpriteForAge(spriteSet);

        this.red = 0.3f;
        this.green = 0.4f;
        this.blue = 1.0f;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
    @Override
    public float getSize(float tickDelta) {
        return this.scale * MathHelper.clamp(((float)this.age + tickDelta) / (float)this.maxAge * 32.0f, 0.0f, 1.0f);
    }
    @Override
    public void tick() {
        super.tick();
        if (!this.dead) {
            double d;
            this.setSpriteForAge(this.sprites);
            PlayerEntity playerEntity = this.world.getClosestPlayer(this.x, this.y, this.z, 2.0, false);
            if (playerEntity != null && this.y > (d = playerEntity.getY())) {
                this.y += (d - this.y) * 0.2;
                this.velocityY += (playerEntity.getVelocity().y - this.velocityY) * 0.2;
                this.setPos(this.x, this.y, this.z);
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;
        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(DefaultParticleType particleType, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new BlueBreathParticle(world, x, y, z, this.sprites, velocityX, velocityY, velocityZ);
        }
    }
}
