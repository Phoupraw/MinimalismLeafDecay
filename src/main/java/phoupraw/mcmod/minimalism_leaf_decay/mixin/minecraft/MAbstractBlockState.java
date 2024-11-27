package phoupraw.mcmod.minimalism_leaf_decay.mixin.minecraft;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import phoupraw.mcmod.minimalism_leaf_decay.constant.MLDBlockTags;

@Mixin(AbstractBlock.AbstractBlockState.class)
abstract class MAbstractBlockState {
    @Shadow
    public abstract void randomTick(ServerWorld world, BlockPos pos, Random random);
    @Shadow
    public abstract boolean isIn(TagKey<Block> tag);
    @Shadow
    public abstract Block getBlock();
    @Inject(method = "scheduledTick", at = @At("RETURN"))
    private void scheduleRandom(ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if (isIn(MLDBlockTags.SCHEDULE_RANDOM)) {
            BlockState newState = world.getBlockState(pos);
            if (newState.isOf(getBlock())) {
                newState.randomTick(world, pos, random);
            }
        }
    }
}
