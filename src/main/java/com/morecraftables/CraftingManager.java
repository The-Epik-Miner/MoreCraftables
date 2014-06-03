package com.morecraftables;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	/**
	 * Initialise all crafting recipes. 
	 */
	
	public static void init() {

		GameRegistry.addShapedRecipe(new ItemStack(Blocks.coal_ore), "SSS",
		"SCS", "SSS", 'S', Blocks.stone, 'C', Items.coal);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.emerald_ore), "SSS",
				"SES", "SSS", 'S', Blocks.stone, 'E', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(Items.blaze_rod), "   ",
				"P  ", "P  ", 'P', Items.blaze_powder);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone), "GGG", "GDG",
				"GGG", 'G', Blocks.gravel, 'D', Blocks.dirt);
		GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), "   ", "LLL",
				"L L", 'L', Items.leather);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.mycelium, 3), "BRB",
				"RBR", "DDD", 'D', Blocks.dirt, 'B', Blocks.brown_mushroom,
				'R', Blocks.red_mushroom);
	}
	

}
