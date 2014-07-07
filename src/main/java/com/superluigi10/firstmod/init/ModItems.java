package com.superluigi10.firstmod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import item.GeneralItem;
import item.ItemMapleLeaf;

public class ModItems {

    public static final GeneralItem mapleLeaf = new ItemMapleLeaf();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
