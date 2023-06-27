package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.entity.projectiles.BreathEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.LlamaSpitEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BreathEntityRenderer extends EntityRenderer<BreathEntity> {
    private final LlamaSpitEntityModel<BreathEntity> model;
    public BreathEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new LlamaSpitEntityModel(context.getPart(EntityModelLayers.LLAMA_SPIT));
    }
    public void render(BreathEntity breathEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

    }
    @Override
    public Identifier getTexture(BreathEntity entity) {
        return null;
    }
}
