package phoupraw.mcmod.minimalism_leaf_decay.constant;

import net.minecraft.util.Identifier;
import phoupraw.mcmod.minimalism_leaf_decay.MinimalismLeafDecay;

public sealed interface MLDIDs permits MLDConstants {
    Identifier MINIMALISM_LEAF_DECAY = of(MinimalismLeafDecay.ID);
    static Identifier of(String path) {
        return Identifier.of(MinimalismLeafDecay.ID, path);
    }
}
