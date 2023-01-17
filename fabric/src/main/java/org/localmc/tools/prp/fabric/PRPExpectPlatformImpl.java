package org.localmc.tools.prp.fabric;

import org.localmc.tools.prp.PRPExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PRPExpectPlatformImpl {
    /**
     * This is our actual method to {@link PRPExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
