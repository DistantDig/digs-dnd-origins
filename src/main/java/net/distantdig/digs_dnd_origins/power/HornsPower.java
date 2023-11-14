package net.distantdig.digs_dnd_origins.power;

import io.github.apace100.apoli.Apoli;
import io.github.apace100.apoli.component.PowerHolderComponent;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class HornsPower extends Power {
    private final boolean renderHorns;
    private final Identifier textureLocation;

    public HornsPower(PowerType<?> type, LivingEntity entity, boolean renderHorns, Identifier textureLocation) {
        super(type, entity);
        this.renderHorns = renderHorns;
        this.textureLocation = textureLocation;
    }

    public boolean shouldRenderHorns() {return renderHorns;}
    public Identifier getTextureLocation() {return textureLocation;}

    public static PowerFactory createFactory() {
        EntityElytraEvents.CUSTOM.register((livingEntity, b) ->
                PowerHolderComponent.hasPower(livingEntity, HornsPower.class));

        return new PowerFactory<>(Apoli.identifier("horns"),
                new SerializableData()
                        .add("render-horns", SerializableDataTypes.BOOLEAN)
                        .add("texture-location", SerializableDataTypes.IDENTIFIER, null),
                data ->
                        (type, player) -> new HornsPower(type, player, data.getBoolean("render-horns"), data.getId("texture-location")))
                .allowCondition();
    }
}
