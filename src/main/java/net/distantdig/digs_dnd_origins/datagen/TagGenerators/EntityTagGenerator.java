package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityTagGenerator extends FabricTagProvider {
    public EntityTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ENTITY_TYPE);
    }
    private static final TagKey<EntityType<?>> HALFLING_NIMBLENESS_ENTITIES = TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier("digs_dnd_origins", "halfling_nimbleness_entities"));
    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(HALFLING_NIMBLENESS_ENTITIES)
                .add(EntityType.PLAYER)
                .add(EntityType.BLAZE)
                .add(EntityType.COW)
                .add(EntityType.CREEPER)
                .add(EntityType.DROWNED)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.ENDERMAN)
                .add(EntityType.EVOKER)
                .add(EntityType.GHAST)
                .add(EntityType.GIANT)
                .add(EntityType.GOAT)
                .add(EntityType.GUARDIAN)
                .add(EntityType.HOGLIN)
                .add(EntityType.HORSE)
                .add(EntityType.HUSK)
                .add(EntityType.ILLUSIONER)
                .add(EntityType.IRON_GOLEM)
                .add(EntityType.LLAMA)
                .add(EntityType.MAGMA_CUBE)
                .add(EntityType.MOOSHROOM)
                .add(EntityType.MULE)
                .add(EntityType.PANDA)
                .add(EntityType.PHANTOM)
                .add(EntityType.PIG)
                .add(EntityType.PIGLIN)
                .add(EntityType.PIGLIN_BRUTE)
                .add(EntityType.PILLAGER)
                .add(EntityType.POLAR_BEAR)
                .add(EntityType.RAVAGER)
                .add(EntityType.SHEEP)
                .add(EntityType.SKELETON)
                .add(EntityType.SKELETON_HORSE)
                .add(EntityType.SLIME)
                .add(EntityType.SNOW_GOLEM)
                .add(EntityType.SPIDER)
                .add(EntityType.SQUID)
                .add(EntityType.STRAY)
                .add(EntityType.STRIDER)
                .add(EntityType.TRADER_LLAMA)
                .add(EntityType.TURTLE)
                .add(EntityType.VEX)
                .add(EntityType.VILLAGER)
                .add(EntityType.VINDICATOR)
                .add(EntityType.WANDERING_TRADER)
                .add(EntityType.WARDEN)
                .add(EntityType.WITCH)
                .add(EntityType.WITHER)
                .add(EntityType.WITHER_SKELETON)
                .add(EntityType.ZOGLIN)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.ZOMBIE_VILLAGER)
                .add(EntityType.ZOMBIFIED_PIGLIN);
    }
}
