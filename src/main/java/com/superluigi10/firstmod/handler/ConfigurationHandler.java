package com.superluigi10.firstmod.handler;


import com.superluigi10.firstmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;




public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init (File configFile) {

        if (configuration == null) {

            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync configs
        }
    }
    private static void loadConfiguration() {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration.");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
