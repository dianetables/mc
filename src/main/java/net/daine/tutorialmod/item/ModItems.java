package net.daine.tutorialmod.item;

import net.daine.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.core.particles.ParticleTypes.ITEM; //idk

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);
    //create more items by using the same format but change the name
    //update en_us.json
    //add respective json files
    //add image texture
    public static final RegistryObject<Item> ACMIUM = //change DeferredRegister to RegistryObject
            ITEMS.register("acmium", () -> new Item(new   //() -> supplier add items in correct order
                    Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    /*public static final RegistryObject<Item> ACM_BLOCK =
            ITEMS.register("acm_block", () -> new Item(new
                    Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
*/
    //added a new function edit later i guess
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
