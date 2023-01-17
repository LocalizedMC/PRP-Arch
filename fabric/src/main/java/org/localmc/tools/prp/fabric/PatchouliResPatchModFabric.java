package org.localmc.tools.prp.fabric;

import org.localmc.tools.prp.PatchouliResPatchMod;
import net.fabricmc.api.ModInitializer;

public class PatchouliResPatchModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PatchouliResPatchMod.init();
    }
}
