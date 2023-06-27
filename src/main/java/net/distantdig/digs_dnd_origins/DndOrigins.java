package net.distantdig.digs_dnd_origins;

import net.distantdig.digs_dnd_origins.effect.ModEffects;
import net.distantdig.digs_dnd_origins.entity.ModEntities;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.distantdig.digs_dnd_origins.item.ModItemGroup;
import net.distantdig.digs_dnd_origins.item.ModItems;
import net.distantdig.digs_dnd_origins.particle.ModParticles;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DndOrigins implements ModInitializer {
    public static final String MOD_ID = "digs_dnd_origins";
    public static final Logger LOGGER = LoggerFactory.getLogger("digs_dnd_origins");

    @Override
    public void onInitialize() {

        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();

        ModParticles.registerGreenParticles();
        ModParticles.registerRedParticles();
        ModParticles.registerBlueParticles();

        ModEffects.registerEffects();

        FabricDefaultAttributeRegistry.register(ModEntities.TOY_FROG, ToyFrogEntity.setAttributes());


        LOGGER.info("Roll initiative...");
    }
}