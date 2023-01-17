package org.localmc.tools.prp.forge;

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;
import org.localmc.tools.prp.PatchouliResPatchMod;
import net.minecraftforge.fml.common.Mod;

@Mod(PatchouliResPatchMod.MODID)
public class PatchouliResPatchModForge {
    public PatchouliResPatchModForge() {
        FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
        PatchouliResPatchMod.init();
    }
}
