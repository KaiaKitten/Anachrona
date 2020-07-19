package kaiaparks.Anachrona.common.block;

import kaiaparks.Anachrona.common.core.ModItemGroup;
import kaiaparks.Anachrona.common.item.ModItems;
import kaiaparks.Anachrona.common.lib.LibBlockNames;
import kaiaparks.Anachrona.common.lib.LibItemNames;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import static kaiaparks.Anachrona.common.lib.LibFunc.register;

public class ModBlocks {

    public static Block catcher = new BlockModGlass(Block.Properties.from(Blocks.GLASS).hardnessAndResistance(0.5F).sound(SoundType.WOOD));

    public static void registerBlocks(RegistryEvent.Register<Block> evt) {
        IForgeRegistry<Block> r = evt.getRegistry();
        register(r, LibBlockNames.CATCHER, catcher);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();
        Item.Properties props = ModItems.defaultBuilder();
        register(r, Registry.BLOCK.getKey(catcher), new BlockItem(catcher, props));
    }
}
