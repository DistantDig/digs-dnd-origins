package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.client.BreathEntityRenderer;
import net.distantdig.digs_dnd_origins.client.ToyFrogRenderer;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.particle.ModParticles;
import net.distantdig.digs_dnd_origins.particle.breath.BlueBreathParticle;
import net.distantdig.digs_dnd_origins.particle.breath.GreenBreathParticle;
import net.distantdig.digs_dnd_origins.particle.breath.RedBreathParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class DndOriginsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TOY_FROG, ToyFrogRenderer::new);
        EntityRendererRegistry.register(ModEntities.BlueBreathEntityType, BreathEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.GreenBreathEntityType, BreathEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.RedBreathEntityType, BreathEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.WhiteBreathEntityType, BreathEntityRenderer::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_BREATH_PARTICLE, BlueBreathParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_BREATH_PARTICLE, GreenBreathParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_BREATH_PARTICLE, RedBreathParticle.Factory::new);
    }
}