package phoupraw.mcmod.minimalism_leaf_decay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import phoupraw.mcmod.minimalism_leaf_decay.MinimalismLeafDecay;
import phoupraw.mcmod.minimalism_leaf_decay.constant.MLDBlockTags;

import java.util.concurrent.CompletableFuture;

import static phoupraw.mcmod.minimalism_leaf_decay.MinimalismLeafDecay.ID;

final class EnglishGen extends FabricLanguageProvider {
    EnglishGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder b) {
        String modName = "Minimalism Leaf Decay";
        b.add(MinimalismLeafDecay.NAME_KEY, modName);
        String summary = "Make leaves immediately decay!";
        b.add("modmenu.summaryTranslation." + ID, summary);
        b.add("modmenu.descriptionTranslation." + ID, """
          %s
          
          Blocks in block tag %s and not in %s will execute random tick after executing schedule tick, defaultly contains all leaves.
          """.formatted(summary, MLDBlockTags.SCHEDULE_RANDOM.id(), MLDBlockTags.SCHEDULE_RANDOM_BLACKLIST.id()));
        b.add(MLDBlockTags.SCHEDULE_RANDOM, "Execute random tick after executing schedule tick");
        b.add(MLDBlockTags.SCHEDULE_RANDOM_BLACKLIST, "Blacklist of Execute random tick after executing schedule tick");
    }
}
