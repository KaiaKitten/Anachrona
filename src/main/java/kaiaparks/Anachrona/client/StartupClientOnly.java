package kaiaparks.Anachrona.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static kaiaparks.Anachrona.common.block.ModBlocks.catcher;

public class StartupClientOnly {

    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(catcher, RenderType.getCutout());
    }
}

