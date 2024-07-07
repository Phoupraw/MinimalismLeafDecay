package phoupraw.mcmod.minimalism_leaf_decay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import phoupraw.mcmod.minimalism_leaf_decay.MinimalismLeafDecay;
import phoupraw.mcmod.minimalism_leaf_decay.constant.MLDBlockTags;

import java.util.concurrent.CompletableFuture;

import static phoupraw.mcmod.minimalism_leaf_decay.MinimalismLeafDecay.ID;

final class ChineseGen extends FabricLanguageProvider {
    ChineseGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder b) {
        String modName = "极简快速落叶";
        b.add(MinimalismLeafDecay.NAME_KEY, modName);
        String summary = "使树叶立刻腐烂";
        b.add("modmenu.summaryTranslation." + ID, summary);
        b.add("modmenu.descriptionTranslation." + ID, """
          %s
          
          添加了一个方块标签%s，其中的方块会在执行计划刻后执行随机刻，默认包含所有树叶。
          """.formatted(summary, MLDBlockTags.SCHEDULE_RANDOM.id()));
        b.add(MLDBlockTags.SCHEDULE_RANDOM, "执行计划刻后执行随机刻");
    }
}
