package net.daine.tutorialmod.entity.client;

import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.custom.ChomperEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChomperModel extends AnimatedGeoModel<ChomperEntity> {//can hover <T> and click implement methods
    //points to the files for the entity
    //change name of files
    @Override
    public ResourceLocation getModelResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MODID, "geo/chomper.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MODID, "textures/entity/chomper_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChomperEntity animatable) {
        return new ResourceLocation(TutorialMod.MODID, "animations/chomper.animation.json");
    }
}
