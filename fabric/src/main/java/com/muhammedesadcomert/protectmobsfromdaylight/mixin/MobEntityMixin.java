package com.muhammedesadcomert.protectmobsfromdaylight.mixin;

import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = MobEntity.class)
public class MobEntityMixin {
    @Inject(method = "isAffectedByDaylight", at = @At("HEAD"), cancellable = true)
    private void protectMobsFromDayLight(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}