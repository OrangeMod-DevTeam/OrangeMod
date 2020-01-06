package net.mcreator.orange_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeHoe extends Elementsorange_mod.ModElement {
	@GameRegistry.ObjectHolder("orange_mod:orangehoe")
	public static final Item block = null;

	public MCreatorOrangeHoe(Elementsorange_mod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("ORANGEHOE", 1, 100, 4f, 5f, 2)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("orangehoe").setRegistryName("orangehoe").setCreativeTab(MCreatorOrangeMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("orange_mod:orangehoe", "inventory"));
	}
}
