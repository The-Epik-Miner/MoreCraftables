package theepikminer.morecraftables;

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

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
