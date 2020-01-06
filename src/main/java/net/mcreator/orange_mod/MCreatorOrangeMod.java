package net.mcreator.orange_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeMod extends Elementsorange_mod.ModElement {
	public MCreatorOrangeMod(Elementsorange_mod instance) {
		super(instance, 2);
	}
	public static CreativeTabs tab = new CreativeTabs("taborangemod") {
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorOrangeOre.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
