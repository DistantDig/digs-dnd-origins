package net.distantdig.digs_dnd_origins.item;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup DND_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(DndOrigins.MOD_ID, "dnd_item_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.dndOrigins"))
                    .icon(() -> new ItemStack(ModItems.BLACK_SCALE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLACK_SCALE);
                        entries.add(ModItems.BLUE_SCALE);
                        entries.add(ModItems.BRASS_SCALE);
                        entries.add(ModItems.GREEN_SCALE);
                        entries.add(ModItems.RED_SCALE);
                        entries.add(ModItems.WHITE_SCALE);
                        entries.add(ModItems.HORNS);
                        entries.add(ModItems.TOY_FROG_SPAWN_EGG);
                    }).build());
    public static void registerItemGroups() {
    }
}
