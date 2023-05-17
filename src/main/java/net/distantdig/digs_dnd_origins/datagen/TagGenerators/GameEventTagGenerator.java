package net.distantdig.digs_dnd_origins.datagen.TagGenerators;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.event.GameEvent;

public class GameEventTagGenerator extends FabricTagProvider {
    public GameEventTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.GAME_EVENT);
    }
    private static final TagKey<GameEvent> SLEIGHT_OF_HAND_SKILL = TagKey.of(Registry.GAME_EVENT_KEY, new Identifier("digs_dnd_origins", "sleight_of_hand_skill"));
    private static final TagKey<GameEvent> STEALTH_SKILL = TagKey.of(Registry.GAME_EVENT_KEY, new Identifier("digs_dnd_origins", "stealth_skill"));
    @Override
    protected void generateTags() {
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
