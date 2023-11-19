package net.distantdig.digs_dnd_origins.mixins;

import io.github.apace100.apoli.component.PowerHolderComponent;
import net.distantdig.digs_dnd_origins.item.ModItems;
import net.distantdig.digs_dnd_origins.item.custom.HornsItem;
import net.distantdig.digs_dnd_origins.power.HornsPower;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

@Mixin(ArmorFeatureRenderer.class)
public abstract class HornsFeatureRendererMixin extends FeatureRenderer<LivingEntity, BipedEntityModel<LivingEntity>> {

    @Shadow protected abstract void setVisible(BipedEntityModel<LivingEntity> bipedModel, EquipmentSlot slot);

    @Shadow protected abstract boolean usesInnerModel(EquipmentSlot slot);

    @Shadow protected abstract void renderArmorParts(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, ArmorItem item, BipedEntityModel<LivingEntity> model, boolean secondTextureLayer, float red, float green, float blue, @Nullable String overlay);

    @Unique
    private LivingEntity entity;

    public HornsFeatureRendererMixin(FeatureRendererContext<LivingEntity, BipedEntityModel<LivingEntity>> context) {
        super(context);
    }

    //renders horns despite whats equipped
    @Inject(method = "renderArmor", at = @At("HEAD"), cancellable = true)
    private void renderHorns(MatrixStack matrices, VertexConsumerProvider vertexConsumers, LivingEntity entity, EquipmentSlot armorSlot, int light, BipedEntityModel<LivingEntity> model, CallbackInfo ci) {
        if (PowerHolderComponent.getPowers(entity, HornsPower.class).stream().anyMatch(HornsPower::shouldRenderHorns) && !entity.isInvisible() && armorSlot == EquipmentSlot.HEAD) {
            ItemStack stack = entity.getEquippedStack(armorSlot);
            Item var9 = ModItems.HORNS;
            if (var9 instanceof ArmorItem) {
                ArmorItem armorItem = (ArmorItem)var9;
                if (armorItem.getSlotType() == armorSlot) {
                    this.getContextModel().copyBipedStateTo(model);
                    this.setVisible(model, armorSlot);
                    boolean bool = this.usesInnerModel(armorSlot);

                    GeoArmorRenderer renderer = (GeoArmorRenderer<HornsItem>) RenderProvider.of(var9).getGenericArmorModel(entity, stack, armorSlot, model);
                    if (renderer != null) {
                        renderer.render(matrices, null, light, 0, 0f, 0f, 0f, 0f);
                    } else {
                        this.renderArmorParts(matrices, vertexConsumers, light, armorItem, model, bool, 1.0F, 1.0F, 1.0F, (String)null);
                    }
                }
            }
        }
    }
}