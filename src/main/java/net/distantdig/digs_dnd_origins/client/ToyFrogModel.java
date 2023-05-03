package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ToyFrogModel extends GeoModel<ToyFrogEntity> {
    @Override
    public Identifier getModelResource(ToyFrogEntity animatable) {
        return new Identifier(DndOrigins.MOD_ID, "geo/toy_frog.geo.json");
    }

    @Override
    public Identifier getTextureResource(ToyFrogEntity animatable) {
        return new Identifier(DndOrigins.MOD_ID, "textures/entity/toy_frog.png");
    }

    @Override
    public Identifier getAnimationResource(ToyFrogEntity animatable) {
        return new Identifier(DndOrigins.MOD_ID, "animations/toy_frog.animation.json");
    }
}
