package net.distantdig.digs_dnd_origins.mixins;

import io.github.apace100.apoli.component.PowerHolderComponent;
import net.distantdig.digs_dnd_origins.power.ReputationPower;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(VillagerEntity.class)
public abstract class VillagerMixin {

    //increase villager reputation for player having the reputation power
    @Inject(method = "getReputation", at = @At(value = "RETURN"), cancellable = true)
    private void increaseReputation(PlayerEntity player, CallbackInfoReturnable<Integer> cir) {
        if (PowerHolderComponent.getPowers(player, ReputationPower.class).stream().anyMatch(ReputationPower::shouldApply)) {

            Optional<Integer> repModifier = PowerHolderComponent.KEY.get(player).getPowers(ReputationPower.class)
                    .stream().filter(ReputationPower::isActive).map(ReputationPower::getReputationModifier).max(Integer::compareTo);

            cir.setReturnValue(repModifier.map(aInt -> Math.addExact(aInt, cir.getReturnValue())).orElse(cir.getReturnValue()));
        }
    }
}