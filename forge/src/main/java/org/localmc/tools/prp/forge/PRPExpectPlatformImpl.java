package org.localmc.tools.prp.forge;

import net.minecraftforge.fml.ModList;

public class PRPExpectPlatformImpl {
    public static boolean getModLoaded() {
        return ModList.get().isLoaded("patchouli");
    }
}
