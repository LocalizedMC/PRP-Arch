package org.localmc.tools.prp;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class PRPExpectPlatform {
    @ExpectPlatform
    public static boolean getModLoaded() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
