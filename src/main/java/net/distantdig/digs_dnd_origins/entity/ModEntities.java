package net.distantdig.digs_dnd_origins.entity;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.entity.custom.ToyFrogEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.BlueBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.GreenBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.RedBreathEntity;
import net.distantdig.digs_dnd_origins.entity.projectiles.WhiteBreathEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.distantdig.digs_dnd_origins.DndOrigins.MOD_ID;

public class ModEntities {
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
    public static final EntityType<ToyFrogEntity> TOY_FROG = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(MOD_ID, "toy_frog"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ToyFrogEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
}