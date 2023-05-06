package net.distantdig.digs_dnd_origins.particle;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType GREEN_BREATH_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_BREATH_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType BLUE_BREATH_PARTICLE = FabricParticleTypes.simple();
    public static void registerGreenParticles() {
    Registry.register(Registries.PARTICLE_TYPE, new Identifier(DndOrigins.MOD_ID, "green_breath_particle"),
            GREEN_BREATH_PARTICLE);
    }
    public static void registerRedParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(DndOrigins.MOD_ID, "red_breath_particle"),
                RED_BREATH_PARTICLE);
    }
    public static void registerBlueParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(DndOrigins.MOD_ID, "blue_breath_particle"),
                BLUE_BREATH_PARTICLE);
    }
}
