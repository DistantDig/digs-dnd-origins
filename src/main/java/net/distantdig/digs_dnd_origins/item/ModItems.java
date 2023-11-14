package net.distantdig.digs_dnd_origins.item;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.item.custom.HornsHelmetItem;
import net.distantdig.digs_dnd_origins.item.custom.HornsItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_SCALE = registerItem("red_scale", new Item((new FabricItemSettings())));
    public static final Item BLUE_SCALE = registerItem("blue_scale", new Item((new FabricItemSettings())));
    public static final Item GREEN_SCALE = registerItem("green_scale", new Item((new FabricItemSettings())));
    public static final Item WHITE_SCALE = registerItem("white_scale", new Item((new FabricItemSettings())));
    public static final Item BLACK_SCALE = registerItem("black_scale", new Item((new FabricItemSettings())));
    public static final Item BRASS_SCALE = registerItem("brass_scale", new Item((new FabricItemSettings())));
    public static final Item HORNS = registerItem("horns", new HornsItem(ArmorMaterials.TURTLE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEATHER_HORNS_HELMET = registerItem("leather_horns_helmet", new HornsHelmetItem(ModArmorMaterials.LEATHER_HORNS,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_HORNS_HELMET = registerItem("iron_horns_helmet", new HornsHelmetItem(ModArmorMaterials.IRON_HORNS,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_HORNS_HELMET = registerItem("golden_horns_helmet", new HornsHelmetItem(ModArmorMaterials.GOLDEN_HORNS,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_HORNS_HELMET = registerItem("diamond_horns_helmet", new HornsHelmetItem(ModArmorMaterials.DIAMOND_HORNS,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NETHERITE_HORNS_HELMET = registerItem("netherite_horns_helmet", new HornsHelmetItem(ModArmorMaterials.NETHERITE_HORNS,
            ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TOY_FROG_SPAWN_EGG = registerItem("toy_frog_spawn_egg",
            new SpawnEggItem(ModEntities.TOY_FROG, 0xD57E36, 0x1D0D00, new  FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DndOrigins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DndOrigins.LOGGER.debug("Registering Mod Items for "+DndOrigins.MOD_ID);
    }
}