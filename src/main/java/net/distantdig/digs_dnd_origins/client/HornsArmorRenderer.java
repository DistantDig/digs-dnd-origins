package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.item.custom.HornsItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HornsArmorRenderer extends GeoArmorRenderer<HornsItem> {
    public HornsArmorRenderer() {
        super(new HornsArmorModel());
    }
}
