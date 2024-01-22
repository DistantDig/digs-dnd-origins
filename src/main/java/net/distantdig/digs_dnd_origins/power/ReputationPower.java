package net.distantdig.digs_dnd_origins.power;

import io.github.apace100.apoli.Apoli;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.entity.LivingEntity;

public class ReputationPower extends Power {
    private final boolean apply;
    private final int amount;

    public ReputationPower(PowerType<?> type, LivingEntity entity, boolean apply, int amount) {
        super(type, entity);
        this.apply = apply;
        this.amount = amount;
    }

    public int getReputationModifier() {return amount;}
    public boolean shouldApply() {return apply;}

    public static PowerFactory createFactory() {

        return new PowerFactory<>(Apoli.identifier("reputation"),
                new SerializableData()
                        .add("should-apply", SerializableDataTypes.BOOLEAN)
                        .add("amount", SerializableDataTypes.INT),
                data ->
                        (type, player) -> new ReputationPower(type, player, data.getBoolean("should-apply"),  data.getInt("amount")))
                .allowCondition();
    }
}
