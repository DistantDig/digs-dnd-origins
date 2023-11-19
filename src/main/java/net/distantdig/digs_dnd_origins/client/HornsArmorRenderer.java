package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.item.ModItems;
import net.distantdig.digs_dnd_origins.item.custom.HornsItem;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HornsArmorRenderer extends GeoArmorRenderer<HornsItem> {
    public HornsArmorRenderer() {
        super(new HornsArmorModel());
    }

    @Override
    public void prepForRender(@Nullable Entity entity, ItemStack stack, @Nullable EquipmentSlot slot, @Nullable BipedEntityModel<?> baseModel) {
        if (entity == null || baseModel == null)
        return;

        this.baseModel = baseModel;
        this.currentEntity = entity;
        this.currentStack = stack;
        this.animatable = (HornsItem) ModItems.HORNS;
        this.currentSlot = slot;
    }
}
