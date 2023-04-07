package net.daine.tutorialmod.entity;

import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.custom.ChomperEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;

//register entity
//don't forget to add to contructor in our main TutorialMod class
public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,TutorialMod.MODID);
    public static final RegistryObject<EntityType<ChomperEntity>>
 CHOMPER = ENTITY_TYPES.register("chomper",
            () -> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
                    .sized(0.4f, 1.5f) //hitbox of entity (w,h)
                    .build(new ResourceLocation(TutorialMod.MODID, "chomper").toString()));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }


}
