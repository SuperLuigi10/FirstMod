package com.superluigi10.firstmod;


import com.superluigi10.firstmod.proxy.IProxy;
import com.superluigi10.firstmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class FirstMod {

    @Mod.Instance(Reference.MOD_ID)
    public static FirstMod instance;

    @SidedProxy(clientSide = "com.superluigi10.firstmod.proxy.ClientProxy", serverSide = "com.superluigi10.firstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }

}
