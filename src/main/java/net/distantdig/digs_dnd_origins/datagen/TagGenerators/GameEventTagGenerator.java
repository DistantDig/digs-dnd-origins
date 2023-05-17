package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.event.GameEvent;

import java.util.concurrent.CompletableFuture;

public class GameEventTagGenerator extends FabricTagProvider {
    public GameEventTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.GAME_EVENT, registriesFuture);
    }
    private static final TagKey<GameEvent> SLEIGHT_OF_HAND_SKILL = TagKey.of(Registries.GAME_EVENT.getKey(), new Identifier("digs_dnd_origins", "sleight_of_hand_skill"));
    private static final TagKey<GameEvent> STEALTH_SKILL = TagKey.of(Registries.GAME_EVENT.getKey(), new Identifier("digs_dnd_origins", "stealth_skill"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SLEIGHT_OF_HAND_SKILL)
                .add(GameEvent.BLOCK_CHANGE)
                .add(GameEvent.PROJECTILE_SHOOT)
                .add(GameEvent.EAT)
                .add(GameEvent.EQUIP)
                .add(GameEvent.BLOCK_CLOSE)
                .add(GameEvent.BLOCK_DETACH)
                .add(GameEvent.BLOCK_OPEN)
                .add(GameEvent.BLOCK_PLACE)
                .add(GameEvent.CONTAINER_CLOSE)
                .add(GameEvent.CONTAINER_OPEN);

        getOrCreateTagBuilder(STEALTH_SKILL)
                .add(GameEvent.STEP)
                .add(GameEvent.SWIM)
                .add(GameEvent.HIT_GROUND);
    }
}
