package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends FabricTagProvider<Item> {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }
    private static final TagKey<Item> DROW_MELEE_WEAPONS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "drow_melee_weapons"));
    private static final TagKey<Item> DROW_RANGED_WEAPONS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "drow_ranged_weapons"));
    private static final TagKey<Item> DWARF_MELEE_WEAPONS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "dwarven_combat_training_weapons"));
    private static final TagKey<Item> ELF_MELEE_WEAPONS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "elf_melee_weapons"));
    private static final TagKey<Item> ELF_RANGED_WEAPONS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "elf_ranged_weapons"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(DROW_MELEE_WEAPONS)
                .addOptionalTag(new Identifier("c", "swords"))

                .add(Items.WOODEN_SWORD)
                .add(Items.STONE_SWORD)
                .add(Items.GOLDEN_SWORD)
                .add(Items.IRON_SWORD)
                .add(Items.DIAMOND_SWORD)
                .add(Items.NETHERITE_SWORD);

        getOrCreateTagBuilder(DROW_RANGED_WEAPONS)
                .addOptionalTag(new Identifier("c", "crossbows"))

                .add(Items.CROSSBOW);

        getOrCreateTagBuilder(DWARF_MELEE_WEAPONS)
                .addOptionalTag(new Identifier("c", "axes"))

                .add(Items.WOODEN_AXE)
                .add(Items.STONE_AXE)
                .add(Items.GOLDEN_AXE)
                .add(Items.IRON_AXE)
                .add(Items.DIAMOND_AXE)
                .add(Items.NETHERITE_AXE);

        getOrCreateTagBuilder(ELF_MELEE_WEAPONS)
                .addOptionalTag(new Identifier("c", "swords"))

                .add(Items.WOODEN_SWORD)
                .add(Items.STONE_SWORD)
                .add(Items.GOLDEN_SWORD)
                .add(Items.IRON_SWORD)
                .add(Items.DIAMOND_SWORD)
                .add(Items.NETHERITE_SWORD);

        getOrCreateTagBuilder(ELF_RANGED_WEAPONS)
                .addOptionalTag(new Identifier("c", "bows"))

                .add(Items.BOW);
    }
}
