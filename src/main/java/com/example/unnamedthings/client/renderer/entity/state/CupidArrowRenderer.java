package com.example.unnamedthings.client.renderer.entity.state;

import com.example.unnamedthings.entity.projectile.CupidArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ArrowRenderState;
import net.minecraft.resources.Identifier;

public class CupidArrowRenderer extends ArrowRenderer<CupidArrow, ArrowRenderState> {
    public static final Identifier CUPID_ARROW_LOCATION = Identifier.fromNamespaceAndPath("unnamedthings", "textures/entity/projectiles/cupid_arrow.png");

    public CupidArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    protected Identifier getTextureLocation(ArrowRenderState renderState) {
        return CUPID_ARROW_LOCATION;
    }

    @Override
    public ArrowRenderState createRenderState() {
        return new ArrowRenderState();
    }
}
