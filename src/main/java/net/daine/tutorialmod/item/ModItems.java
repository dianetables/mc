package net.daine.tutorialmod.item;

import net.daine.tutorialmod.TutorialMod;
import net.daine.tutorialmod.entity.ModEntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
    public static final RegistryObject<Item> RAW_ACMIUM = ITEMS.register("raw_acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));


    //tools below
    public static final RegistryObject<Item> EXAMPLE_SWORD = ITEMS.register("example_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, 4f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 4, 5f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe",
            () -> new AxeItem(Tiers.DIAMOND, 8, 3f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 3, 5f,
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

    //armor below
    public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_CHESTPIECE = ITEMS.register("example_chestpiece",
            () -> new ArmorItem(ArmorMaterials.DIAMOND,EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings",
            () -> new ArmorItem(ArmorMaterials.DIAMOND,EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("example_boots",
            () -> new ArmorItem(ArmorMaterials.DIAMOND,EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    //entity below
    public static final RegistryObject<Item> CHOMPER_SPAWN_EGG = ITEMS.register("chomper_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHOMPER, 0x00c5ff, 0x9600ff, //https://color-hex.org/
                    new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    //added a new function edit later i guess
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
