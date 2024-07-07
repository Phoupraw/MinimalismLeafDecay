package phoupraw.mcmod.minimalism_leaf_decay.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public final class MinimalismLeafDecayDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator g) {
        var pack = g.createPack();
        pack.addProvider(BlockTagGen::new);
        pack.addProvider(ChineseGen::new);
        pack.addProvider(EnglishGen::new);
    }
}
