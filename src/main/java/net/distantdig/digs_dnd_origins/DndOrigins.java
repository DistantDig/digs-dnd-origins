package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.effect.ModEffects;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.BlueBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.GreenBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.RedBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.WhiteBreathEntity;
import net.distantdig.digs_dnd_origins.item.ModItemGroup;
import net.distantdig.digs_dnd_origins.item.ModItems;
import net.distantdig.digs_dnd_origins.particle.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DndOrigins implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "digs_dnd_origins";
    public static final Logger LOGGER = LoggerFactory.getLogger("digs_dnd_origins");
    public static final EntityType<RedBreathEntity> RedBreathEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "red_breath"),
            FabricEntityTypeBuilder.<RedBreathEntity>create(SpawnGroup.MISC, RedBreathEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10).build()
    );
    public static final EntityType<GreenBreathEntity> GreenBreathEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "green_breath"),
            FabricEntityTypeBuilder.<GreenBreathEntity>create(SpawnGroup.MISC, GreenBreathEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10).build()
    );
    public static final EntityType<WhiteBreathEntity> WhiteBreathEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "white_breath"),
            FabricEntityTypeBuilder.<WhiteBreathEntity>create(SpawnGroup.MISC, WhiteBreathEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10).build()
    );
    public static final EntityType<BlueBreathEntity> BlueBreathEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "blue_breath"),
            FabricEntityTypeBuilder.<BlueBreathEntity>create(SpawnGroup.MISC, BlueBreathEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10).build()
    );
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();

        ModParticles.registerGreenParticles();
        ModParticles.registerRedParticles();
        ModParticles.registerBlueParticles();

        ModEffects.registerEffects();

        FabricDefaultAttributeRegistry.register(ModEntities.TOY_FROG, ToyFrogEntity.setAttributes());


        LOGGER.info("Hello Fabric world!");
    }
}