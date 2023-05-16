package net.distantdig.digs_dnd_origins.client;

import net.distantdig.digs_dnd_origins.item.custom.HornsHelmetItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HornsHelmetRenderer extends GeoArmorRenderer<HornsHelmetItem> {
    public HornsHelmetRenderer() {
        super(new HornsHelmetModel());

        this.headBone = "armorHead";
        this.bodyBone = "unused";
        this.rightArmBone = "unused";
        this.leftArmBone = "unused";
        this.rightLegBone = "unused";
        this.leftLegBone = "unused";
        this.rightBootBone = "unused";
        this.leftBootBone = "unused";
    }
}