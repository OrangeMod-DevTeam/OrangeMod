package net.mcreator.orange_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsorange_mod.ModElement.Tag
public class MCreatorOrangeArmor extends Elementsorange_mod.ModElement {
	@GameRegistry.ObjectHolder("orange_mod:orangearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("orange_mod:orangearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("orange_mod:orangearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("orange_mod:orangearmorboots")
	public static final Item boots = null;

	public MCreatorOrangeArmor(Elementsorange_mod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ORANGEARMOR", "orange_mod:orange armor", 25, new int[]{2, 5, 6, 2}, 9, null, 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("orangearmorhelmet")
				.setRegistryName("orangearmorhelmet").setCreativeTab(MCreatorOrangeMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("orangearmorbody")
				.setRegistryName("orangearmorbody").setCreativeTab(MCreatorOrangeMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("orangearmorlegs")
				.setRegistryName("orangearmorlegs").setCreativeTab(MCreatorOrangeMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("orangearmorboots")
				.setRegistryName("orangearmorboots").setCreativeTab(MCreatorOrangeMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("orange_mod:orangearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("orange_mod:orangearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("orange_mod:orangearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("orange_mod:orangearmorboots", "inventory"));
	}
}
