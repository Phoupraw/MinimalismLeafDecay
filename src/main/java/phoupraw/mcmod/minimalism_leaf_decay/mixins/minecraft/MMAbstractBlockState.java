package phoupraw.mcmod.minimalism_leaf_decay.mixins.minecraft;

import lombok.experimental.UtilityClass;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import phoupraw.mcmod.minimalism_leaf_decay.constant.MLDBlockTags;

@UtilityClass
public class MMAbstractBlockState {
    public static void scheduleRandom(BlockState self, ServerWorld world, BlockPos pos, Random random) {
        if (self.isIn(MLDBlockTags.SCHEDULE_RANDOM) && !self.isIn(MLDBlockTags.SCHEDULE_RANDOM_BLACKLIST)) {
            BlockState newState = world.getBlockState(pos);
            if (newState.isOf(self.getBlock())) {
                newState.randomTick(world, pos, random);
            }
        }
    }
}