
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.extratea.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.swutm.extratea.item.custom.ModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ExtraTeaModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
        if (event.getType() == VillagerProfession.CLERIC) {
            trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

                    new ItemStack(Blocks.OXEYE_DAISY, 5), 10, 5, 0.05f));
            trades.get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

                    new ItemStack(ModItems.BLACK_TEA_LEAF.get(), 5), 10, 5, 0.05f));
            trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

                    new ItemStack(ModItems.GREEN_TEA_LEAF.get(), 5), 10, 5, 0.05f));
            trades.get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

                    new ItemStack(ModItems.RED_TEA_LEAF.get(), 5), 10, 5, 0.05f));
            trades.get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

                    new ItemStack(ModItems.MINT.get(), 5), 10, 5, 0.05f));
        }
    }
}
