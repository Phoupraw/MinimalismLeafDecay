package phoupraw.mcmod.minimalism_leaf_decay.constant;

import lombok.SneakyThrows;

import java.lang.invoke.MethodHandles;

public final class MLDConstants implements MLDBlockTags, MLDIDs {
    private MLDConstants() {
    }
    @SneakyThrows
    public static void loadClasses() {
        for (Class<?> i : MLDConstants.class.getInterfaces()) {
            MethodHandles.lookup().ensureInitialized(i);
        }
    }
}
