package com.superluigi10.firstmod.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init (File configFile) {

        //Create configuration object
        Configuration configuration = new Configuration(configFile);

        try {
            //Load configuration file
            configuration.load();

            //Read in properties from configuration file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example configuration").getBoolean(true);
        }

        catch (Exception e) {
            //Log the exception

        }

        finally {

            //Save the configuration file
            configuration.save();

        }
    }
}
