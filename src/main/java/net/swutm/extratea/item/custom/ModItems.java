package net.swutm.extratea.item.custom;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.extratea.extratea;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, extratea.MOD_ID);

    public static final RegistryObject<Item> BLACK_TEA_LEAF = ITEMS.register("black_tea_leaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GREEN_TEA_LEAF = ITEMS.register("green_tea_leaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RED_TEA_LEAF = ITEMS.register("red_tea_leaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CUP = ITEMS.register("cup",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BLACK_TEA = ITEMS.register("black_tea",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.BLACK_TEA)));

    public static final RegistryObject<Item> GREEN_TEA = ITEMS.register("green_tea",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.GREEN_TEA)));

    public static final RegistryObject<Item> KARKADE_TEA = ITEMS.register("karkade_tea",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.KARKADE_TEA)));

    public static final RegistryObject<Item> MINT_TEA = ITEMS.register("mint_tea",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.MINT_TEA)));

    public static final RegistryObject<Item> CHAMOMILE_TEA = ITEMS.register("chamomile_tea",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.CHAMOMILE_TEA)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
