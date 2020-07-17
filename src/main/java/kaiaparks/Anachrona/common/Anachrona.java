package kaiaparks.Anachrona.common;

import kaiaparks.Anachrona.common.item.ModItems;
import net.minecraft.item.Item;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

import kaiaparks.Anachrona.common.lib.LibMisc;

@Mod(LibMisc.MOD_ID)
public class Anachrona {

    private static final Logger LOGGER = LogManager.getLogger();

    public Anachrona() {
        LOGGER.debug("Hello from Anachrona!");
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addGenericListener(Item.class, ModItems::registerItems);
    }

}
