package com.morecraftables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "morecraftables", name = "MoreCraftables", version = "0.0.0")
public class MoreCraftables {

	@Instance(value = "morecraftables")
	public static MoreCraftables instance;

	@SidedProxy(clientSide = "theepikminer.morecraftables.client.ClientProxy", serverSide = "theepikminer.morecraftables.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		CraftingManager.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
