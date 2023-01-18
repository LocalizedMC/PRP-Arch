package org.localmc.tools.prp.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class PRPExpectPlatformImpl {
    public static boolean getModLoaded() {
        return FabricLoader.getInstance().isModLoaded("patchouli");
    }
}
