package kaiaparks.Anachrona.common.core;

import kaiaparks.Anachrona.common.item.ModItems;
import net.minecraft.item.ItemGroup;

import kaiaparks.Anachrona.common.lib.LibMisc;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {

    public static final ModItemGroup INSTANCE = new ModItemGroup();

    public ModItemGroup() {
        super(LibMisc.MOD_ID);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.antikythera);
    }
}
