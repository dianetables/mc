package net.daine.tutorialmod.entity.client;

import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.custom.ChomperEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
public class ChomperModel extends AnimatedGeoModel<ChomperEntity> {
    @Override
    public ResourceLocation getModelResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/entity.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/entity.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChomperEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/entity.animation.json");
    }
}
