package net.distantdig.digs_dnd_origins.entity;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<ToyFrogEntity> TOY_FROG = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(DndOrigins.MOD_ID, "toy_frog"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ToyFrogEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
}