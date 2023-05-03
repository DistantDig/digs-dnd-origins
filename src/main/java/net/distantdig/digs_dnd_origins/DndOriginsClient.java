package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.client.ToyFrogRenderer;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class DndOriginsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TOY_FROG, ToyFrogRenderer::new);
        EntityRendererRegistry.register(DndOrigins.RedSpitEntityType, (context) ->
                new FlyingItemEntityRenderer(context));
    }

}
