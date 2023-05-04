package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.client.ToyFrogRenderer;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.particle.ModParticles;
import net.distantdig.digs_dnd_origins.particle.breath.GreenBreathParticle;
import net.distantdig.digs_dnd_origins.particle.breath.RedBreathParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class DndOriginsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TOY_FROG, ToyFrogRenderer::new);
        EntityRendererRegistry.register(DndOrigins.RedBreathEntityType, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(DndOrigins.GreenBreathEntityType, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(DndOrigins.WhiteBreathEntityType, FlyingItemEntityRenderer::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_BREATH_PARTICLE, GreenBreathParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_BREATH_PARTICLE, RedBreathParticle.Factory::new);
    }

}