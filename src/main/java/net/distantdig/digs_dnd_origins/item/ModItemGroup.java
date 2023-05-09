package net.distantdig.digs_dnd_origins.item;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup DND_ITEM_GROUP;
    public static void registerItemGroups() {
        DND_ITEM_GROUP = FabricItemGroup.builder(new Identifier(DndOrigins.MOD_ID, "dnd_item_group"))
                .displayName(Text.translatable("itemGroup.dndOrigins"))
                .icon(() -> new ItemStack(ModItems.BLACK_SCALE)).build();
    }
}
