package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class EntityTagGenerator extends FabricTagProvider.EntityTypeTagProvider {
    public EntityTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    private static final TagKey<EntityType<?>> HALFLING_NIMBLENESS_ENTITIES = TagKey.of(Registries.ENTITY_TYPE.getKey(), new Identifier("digs_dnd_origins", "halfling_nimbleness_entities"));
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
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
