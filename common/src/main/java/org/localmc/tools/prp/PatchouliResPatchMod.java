package org.localmc.tools.prp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatchouliResPatchMod {
    public static final String MODID = "archprp";
    public static final Logger LOGGER = LogManager.getLogger("ArchPRP");
    
    public static void init() {
        System.out.println(PRPExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}