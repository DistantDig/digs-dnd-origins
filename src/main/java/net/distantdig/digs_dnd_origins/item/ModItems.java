package net.distantdig.digs_dnd_origins.item;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_SCALE = registerItem("red_scale", new Item((new FabricItemSettings())));
    public static final Item BLUE_SCALE = registerItem("blue_scale", new Item((new FabricItemSettings())));
    public static final Item GREEN_SCALE = registerItem("green_scale", new Item((new FabricItemSettings())));
    public static final Item WHITE_SCALE = registerItem("white_scale", new Item((new FabricItemSettings())));
    public static final Item BLACK_SCALE = registerItem("black_scale", new Item((new FabricItemSettings())));
    public static final Item HORNS = registerItem("horns", new Item((new FabricItemSettings().maxCount(1))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DndOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DndOrigins.LOGGER.debug("Registering Mod Items for "+DndOrigins.MOD_ID);
    }
}