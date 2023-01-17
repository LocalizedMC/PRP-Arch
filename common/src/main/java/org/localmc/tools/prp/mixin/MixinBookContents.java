package org.localmc.tools.prp.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import org.localmc.tools.prp.PatchouliResPatchMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vazkii.patchouli.client.book.BookContents;

import java.io.IOException;
import java.io.InputStream;


@Mixin(BookContents.class)
public class MixinBookContents {
    @Inject(at = @At("HEAD"), method = "loadJson", cancellable = true, remap = false)
    private void loadJson(Identifier resloc, Identifier fallback, CallbackInfoReturnable<InputStream> callback) {
        PatchouliResPatchMod.LOGGER.debug("loading json from {}.", resloc);
        try {
            callback.setReturnValue(MinecraftClient.getInstance().getResourceManager().getResource(resloc).getInputStream());
        } catch (IOException ignore) {
        }
    }
}
