package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.item.custom.HornsHelmetItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HornsHelmetModel extends AnimatedGeoModel<HornsHelmetItem> {
    @Override
    public Identifier getModelResource(HornsHelmetItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "geo/horns_helmet.geo.json");
    }

    @Override
    public Identifier getTextureResource(HornsHelmetItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "textures/armor/horns_helmet.png");
    }

    @Override
    public Identifier getAnimationResource(HornsHelmetItem animatable) {
        return new Identifier(DndOrigins.MOD_ID, "animations/horns_helmet.animation.json");
    }
}