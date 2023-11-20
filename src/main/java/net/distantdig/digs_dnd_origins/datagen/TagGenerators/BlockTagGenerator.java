package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> MASK_OF_THE_WILD_BLOCKS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("digs_dnd_origins", "mask_of_the_wild_blocks"));
    private static final TagKey<Block> STONE_CAMOUFLAGE_BLOCKS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("digs_dnd_origins", "stone_camouflage_blocks"));
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(MASK_OF_THE_WILD_BLOCKS)

                .addOptionalTag(new Identifier("c", "bushes"))
                .addOptionalTag(new Identifier("c", "crop_like"))
                .addOptionalTag(new Identifier("c", "flowers"))
                .addOptionalTag(new Identifier("c", "grass"))
                .addOptionalTag(new Identifier("c", "grass_like"))
                .addOptionalTag(new Identifier("c", "leaves"))
                .addOptionalTag(new Identifier("c", "saplings"))

                .forceAddTag(BlockTags.BEE_GROWABLES)
                .forceAddTag(BlockTags.CROPS)
                .forceAddTag(BlockTags.FLOWERS)
                .forceAddTag(BlockTags.LEAVES)
                .forceAddTag(BlockTags.SAPLINGS)

                .add(Blocks.GRASS)
                .add(Blocks.TALL_GRASS)
                .add(Blocks.FERN)
                .add(Blocks.LARGE_FERN)
                .add(Blocks.VINE)

                .add(Blocks.SUGAR_CANE)
                .add(Blocks.SMALL_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF_STEM)
                .add(Blocks.BAMBOO);

        getOrCreateTagBuilder(STONE_CAMOUFLAGE_BLOCKS)
                .add(Blocks.STONE)
                .add(Blocks.DRIPSTONE_BLOCK)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.REDSTONE_ORE)
                .add(Blocks.DEEPSLATE_REDSTONE_ORE)
                .add(Blocks.COAL_ORE)
                .add(Blocks.DEEPSLATE_COAL_ORE)
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.COPPER_ORE)
                .add(Blocks.DEEPSLATE_COPPER_ORE)
                .add(Blocks.GOLD_ORE)
                .add(Blocks.DEEPSLATE_GOLD_ORE)
                .add(Blocks.EMERALD_ORE)
                .add(Blocks.DEEPSLATE_EMERALD_ORE)
                .add(Blocks.LAPIS_ORE)
                .add(Blocks.DEEPSLATE_LAPIS_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.NETHER_GOLD_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE)
                .add(Blocks.STONE_SLAB)
                .add(Blocks.SMOOTH_STONE_SLAB)
                .add(Blocks.COBBLESTONE_SLAB)
                .add(Blocks.STONE_BRICK_SLAB)
                .add(Blocks.SMOOTH_STONE)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.COBBLESTONE_STAIRS)
                .add(Blocks.INFESTED_STONE)
                .add(Blocks.INFESTED_COBBLESTONE)
                .add(Blocks.INFESTED_CHISELED_STONE_BRICKS)
                .add(Blocks.INFESTED_DEEPSLATE)
                .add(Blocks.INFESTED_CRACKED_STONE_BRICKS)
                .add(Blocks.INFESTED_MOSSY_STONE_BRICKS)
                .add(Blocks.INFESTED_STONE_BRICKS)
                .add(Blocks.STONE_BRICKS)
                .add(Blocks.MOSSY_STONE_BRICKS)
                .add(Blocks.CRACKED_STONE_BRICKS)
                .add(Blocks.CHISELED_STONE_BRICKS)
                .add(Blocks.STONE_BRICK_STAIRS)
                .add(Blocks.END_STONE)
                .add(Blocks.END_STONE_BRICKS)
                .add(Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
                .add(Blocks.MOSSY_STONE_BRICK_STAIRS)
                .add(Blocks.MOSSY_COBBLESTONE_STAIRS)
                .add(Blocks.END_STONE_BRICK_STAIRS)
                .add(Blocks.STONE_STAIRS)
                .add(Blocks.MOSSY_STONE_BRICK_SLAB)
                .add(Blocks.MOSSY_COBBLESTONE_SLAB)
                .add(Blocks.END_STONE_BRICK_SLAB)
                .add(Blocks.LODESTONE)
                .add(Blocks.BLACKSTONE)
                .add(Blocks.BLACKSTONE_SLAB)
                .add(Blocks.BLACKSTONE_STAIRS)
                .add(Blocks.GILDED_BLACKSTONE)
                .add(Blocks.POLISHED_BLACKSTONE)
                .add(Blocks.POLISHED_BLACKSTONE_SLAB)
                .add(Blocks.POLISHED_BLACKSTONE_STAIRS)
                .add(Blocks.CHISELED_POLISHED_BLACKSTONE)
                .add(Blocks.POLISHED_BLACKSTONE_BRICKS)
                .add(Blocks.COBBLESTONE_WALL)
                .add(Blocks.MOSSY_COBBLESTONE_WALL)
                .add(Blocks.MOSSY_STONE_BRICK_WALL)
                .add(Blocks.STONE_BRICK_WALL)
                .add(Blocks.END_STONE_BRICK_WALL)
                .add(Blocks.POLISHED_BLACKSTONE_WALL)
                .add(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
                .add(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
                .add(Blocks.POLISHED_BLACKSTONE_BRICKS)
                .add(Blocks.POINTED_DRIPSTONE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.NETHERRACK)
                .add(Blocks.BLACKSTONE)
                .add(Blocks.BASALT);
    }
}
