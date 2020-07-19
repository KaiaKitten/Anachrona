package kaiaparks.Anachrona.common;

import kaiaparks.Anachrona.client.StartupClientOnly;
import kaiaparks.Anachrona.common.block.ModBlocks;
import kaiaparks.Anachrona.common.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

import kaiaparks.Anachrona.common.lib.LibMisc;

@Mod(LibMisc.MOD_ID)
public class Anachrona {

    public static IEventBus MOD_EVENT_BUS;
    private static final Logger LOGGER = LogManager.getLogger();

    public Anachrona() {
        LOGGER.debug("Hello from Anachrona!");

        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_EVENT_BUS.addGenericListener(Item.class, ModItems::registerItems);
        MOD_EVENT_BUS.addGenericListener(Block.class, ModBlocks::registerBlocks);
        MOD_EVENT_BUS.addGenericListener(Item.class, ModBlocks::registerItemBlocks);

        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> Anachrona::registerClientOnlyEvents);
    }


    public static void registerClientOnlyEvents(){
        MOD_EVENT_BUS.register(StartupClientOnly.class);
    }

}
