package phoupraw.mcmod.minimalism_leaf_decay.constant;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public sealed interface MLDBlockTags permits MLDConstants {
    TagKey<Block> SCHEDULE_RANDOM = of("schedule_random");
    private static TagKey<Block> of(Identifier id) {
        return TagKey.of(RegistryKeys.BLOCK, id);
    }
    private static TagKey<Block> of(String path) {
        return of(MLDIDs.of(path));
    }
}
