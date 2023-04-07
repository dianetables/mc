package net.daine.tutorialmod.event;

import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.ModEntityTypes;
import net.daine.tutorialmod.entity.custom.ChomperEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = TutorialMod.MODID)
    public static class ForgeEvents {


    }
    //moved outside ForgeEvents
    @Mod.EventBusSubscriber(modid = TutorialMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.CHOMPER.get(), ChomperEntity.setAttributes());
        }
    }
}
