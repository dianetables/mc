package net.daine.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.custom.ChomperEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChomperRenderer extends GeoEntityRenderer<ChomperEntity>{
    public ChomperRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChomperModel());
        this.shadowRadius=0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ChomperEntity instance) {
        return new ResourceLocation((TutorialMod.MODID), "textures/entity/chomper_texture.png");
    }

    @Override
    public RenderType getRenderType(ChomperEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder,
                                    int packedLightIn, ResourceLocation textureLocation) {
        //can add stuff here to change how the entity looks and w/e
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}
