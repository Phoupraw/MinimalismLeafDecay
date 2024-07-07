package phoupraw.mcmod.minimalism_leaf_decay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import phoupraw.mcmod.minimalism_leaf_decay.constant.MLDBlockTags;

import java.util.concurrent.CompletableFuture;

final class BlockTagGen extends FabricTagProvider.BlockTagProvider {
    public BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(MLDBlockTags.SCHEDULE_RANDOM).addOptionalTag(BlockTags.LEAVES);
    }
}
