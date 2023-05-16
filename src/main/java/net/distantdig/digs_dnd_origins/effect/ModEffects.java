package net.distantdig.digs_dnd_origins.effect;

import net.distantdig.digs_dnd_origins.DndOrigins;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect FREEZE;
    public static StatusEffect STUN;
    public static StatusEffect registerFreezeEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(DndOrigins.MOD_ID, name),
                new FreezeEffect(StatusEffectCategory.HARMFUL, 3124678));
    }
    public static StatusEffect registerStunEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(DndOrigins.MOD_ID, name),
                new StunEffect(StatusEffectCategory.HARMFUL, 3124678)
                        .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160891",
                                -1.0, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    }
    public static void registerEffects() {
        FREEZE = registerFreezeEffect("freeze");
        STUN = registerStunEffect("stun");
    }
}
