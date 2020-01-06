package net.mcreator.orange_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeSword extends Elementsorange_mod.ModElement {
	@GameRegistry.ObjectHolder("orange_mod:orangesword")
	public static final Item block = null;

	public MCreatorOrangeSword(Elementsorange_mod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("ORANGESWORD", 1, 100, 4f, 5f, 2)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("orangesword").setRegistryName("orangesword").setCreativeTab(MCreatorOrangeMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("orange_mod:orangesword", "inventory"));
	}
}
