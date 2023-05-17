package net.distantdig.digs_dnd_origins.datagen;

import net.distantdig.digs_dnd_origins.datagen.TagGenerators.BlockTagGenerator;
import net.distantdig.digs_dnd_origins.datagen.TagGenerators.EntityTagGenerator;
import net.distantdig.digs_dnd_origins.datagen.TagGenerators.GameEventTagGenerator;
import net.distantdig.digs_dnd_origins.datagen.TagGenerators.ItemTagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ItemTagGenerator::new);
        pack.addProvider(BlockTagGenerator::new);
        pack.addProvider(EntityTagGenerator::new);
        pack.addProvider(GameEventTagGenerator::new);
    }
}