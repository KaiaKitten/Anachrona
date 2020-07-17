package kaiaparks.Anachrona.common.item;


import kaiaparks.Anachrona.common.core.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import kaiaparks.Anachrona.common.lib.LibItemNames;
import static kaiaparks.Anachrona.common.lib.LibFunc.register;

public final class ModItems {

    public static final Item antikythera = new ItemAntikythera(defaultBuilder());

    public static void registerItems(RegistryEvent.Register<Item> evt) {
        IForgeRegistry<Item> r = evt.getRegistry();

        register(r, LibItemNames.ANTIKYTHERA,antikythera);
    }

    public static Item.Properties defaultBuilder() {
        return new Item.Properties().group(ModItemGroup.INSTANCE);
    }
}
