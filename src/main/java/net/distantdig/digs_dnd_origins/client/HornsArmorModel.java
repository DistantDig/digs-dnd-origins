package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.item.custom.HornsItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HornsArmorModel extends GeoModel<HornsItem> {
    @Override
    public Identifier getModelResource(HornsItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "geo/horns.geo.json");
    }

    @Override
    public Identifier getTextureResource(HornsItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "textures/armor/horns.png");
    }

    @Override
    public Identifier getAnimationResource(HornsItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "animations/horns_helmet.animation.json");
    }
}
