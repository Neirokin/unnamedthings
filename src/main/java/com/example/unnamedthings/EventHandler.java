package com.example.unnamedthings;

import com.example.unnamedthings.client.renderer.entity.state.CupidArrowRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = UnnamedThings.MODID)
public class EventHandler {

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(UnnamedThings.CUPID_ARROW.get(), CupidArrowRenderer::new);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(UnnamedThingsItemTagsProvider::new);
        event.createProvider(UnnamedThingsModelProvider::new);
        event.createProvider(UnnamedThingsLanguageProvider::new);
    }
}
