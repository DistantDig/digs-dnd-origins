package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ToyFrogRenderer extends GeoEntityRenderer<ToyFrogEntity> {
    public ToyFrogRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ToyFrogModel());
    }

    @Override
    public Identifier getTexture(ToyFrogEntity animatable) {
        return new Identifier(DndOrigins.MOD_ID, "textures/entity/toy_frog.png");
    }

    @Override
    public void render(ToyFrogEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {

        poseStack.scale(0.5f, 0.5f, 0.5f);

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
