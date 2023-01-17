package org.localmc.tools.prp.forge;

import org.localmc.tools.prp.PRPExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class PRPExpectPlatformImpl {
    /**
     * This is our actual method to {@link PRPExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
