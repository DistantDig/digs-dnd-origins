package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemTagGenerator extends FabricTagProvider {
    public ItemTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }
    private static final TagKey<Item> DROW_MELEE_WEAPONS = TagKey.of(Registry.ITEM_KEY, new Identifier("digs_dnd_origins", "drow_melee_weapons"));
    private static final TagKey<Item> DROW_RANGED_WEAPONS = TagKey.of(Registry.ITEM_KEY, new Identifier("digs_dnd_origins", "drow_ranged_weapons"));
    private static final TagKey<Item> DWARF_MELEE_WEAPONS = TagKey.of(Registry.ITEM_KEY, new Identifier("digs_dnd_origins", "dwarven_combat_training_weapons"));
    private static final TagKey<Item> ELF_MELEE_WEAPONS = TagKey.of(Registry.ITEM_KEY, new Identifier("digs_dnd_origins", "elf_melee_weapons"));
    private static final TagKey<Item> ELF_RANGED_WEAPONS = TagKey.of(Registry.ITEM_KEY, new Identifier("digs_dnd_origins", "elf_ranged_weapons"));

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(DROW_MELEE_WEAPONS)
                .add(Items.WOODEN_SWORD)
                .add(Items.STONE_SWORD)
                .add(Items.GOLDEN_SWORD)
                .add(Items.IRON_SWORD)
                .add(Items.DIAMOND_SWORD)
                .add(Items.NETHERITE_SWORD);

        getOrCreateTagBuilder(DROW_RANGED_WEAPONS)
                .add(Items.CROSSBOW);

        getOrCreateTagBuilder(DWARF_MELEE_WEAPONS)
                .add(Items.WOODEN_AXE)
                .add(Items.STONE_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.IRON_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE);

        getOrCreateTagBuilder(ELF_MELEE_WEAPONS)
                .add(Items.WOODEN_SWORD)
                .add(Items.STONE_SWORD)
                .add(Items.GOLDEN_SWORD)
                .add(Items.IRON_SWORD)
                .add(Items.DIAMOND_SWORD)
                .add(Items.NETHERITE_SWORD);

        getOrCreateTagBuilder(ELF_RANGED_WEAPONS)
                .add(Items.BOW);
    }
}
