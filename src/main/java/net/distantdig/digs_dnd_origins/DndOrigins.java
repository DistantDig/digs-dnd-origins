package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.distantdig.digs_dnd_origins.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DndOrigins implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "digs_dnd_origins";
    public static final Logger LOGGER = LoggerFactory.getLogger("digs_dnd_origins");
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItems.registerModItems();
        FabricDefaultAttributeRegistry.register(ModEntities.TOY_FROG, ToyFrogEntity.setAttributes());

        LOGGER.info("Hello Fabric world!");
    }
}