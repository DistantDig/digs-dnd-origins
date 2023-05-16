package net.distantdig.digs_dnd_origins.item;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DND_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(DndOrigins.MOD_ID, "dnd_item_group"), () -> new ItemStack(ModItems.BLACK_SCALE));
}