package net.distantdig.digs_dnd_origins.mixins;

import io.github.apace100.apoli.component.PowerHolderComponent;
import net.distantdig.digs_dnd_origins.DndOrigins;
import net.distantdig.digs_dnd_origins.power.ReputationPower;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Optional;

@Mixin(VillagerEntity.class)
public abstract class VillagerMixin {

    //increase villager reputation for player having the reputation power
    @SuppressWarnings("InvalidInjectorMethodSignature")
    @ModifyVariable(method = "prepareOffersFor", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/entity/passive/VillagerEntity;getReputation(Lnet/minecraft/entity/player/PlayerEntity;)I"))
    private int increaseReputation(int i, PlayerEntity player) {
        if (PowerHolderComponent.getPowers(player, ReputationPower.class).stream().anyMatch(ReputationPower::shouldApply)) {

            Optional<Integer> repModifier = PowerHolderComponent.KEY.get(player).getPowers(ReputationPower.class).stream().filter(ReputationPower::isActive).map(ReputationPower::getReputationModifier).max(Integer::compareTo);
            int finalI = i;
            i = repModifier.map(aInt -> Math.addExact(aInt, finalI)).orElse(i);
        }
        DndOrigins.LOGGER.info(String.valueOf(i));
        return i;
    }
}