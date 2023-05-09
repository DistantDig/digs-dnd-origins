package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.item.custom.HornsHelmetItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HornsHelmetRenderer extends GeoArmorRenderer<HornsHelmetItem> {
    public HornsHelmetRenderer() {
        super(new HornsHelmetModel());
    }
}
