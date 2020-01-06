package net.mcreator.orange_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeLeaves extends Elementsorange_mod.ModElement {
	@GameRegistry.ObjectHolder("orange_mod:orangeleaves")
	public static final Block block = null;

	public MCreatorOrangeLeaves(Elementsorange_mod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader
				.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("orange_mod:orangeleaves", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.LEAVES);
			setRegistryName("orangeleaves");
			setUnlocalizedName("orangeleaves");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorOrangeMod.tab);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
