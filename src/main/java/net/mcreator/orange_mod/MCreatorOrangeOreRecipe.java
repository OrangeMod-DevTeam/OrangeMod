package net.mcreator.orange_mod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeOreRecipe extends Elementsorange_mod.ModElement {
	public MCreatorOrangeOreRecipe(Elementsorange_mod instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorOrangeOre.block, (int) (1)), new ItemStack(MCreatorOrangeIngot.block, (int) (1)), 1F);
	}
}
