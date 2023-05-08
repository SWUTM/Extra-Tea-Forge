package net.swutm.extratea.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BLACK_TEA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 5000, 1), 0.3F).meat().build();
    public static final FoodProperties GREEN_TEA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 200, 4), 0.3F).meat().build();
    public static final FoodProperties KARKADE_TEA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 0.3F).meat().build();
    public static final FoodProperties MINT_TEA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 5000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.JUMP, 5000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 5000, 1), 1.0F).effect(new MobEffectInstance(MobEffects.LUCK, 5000, 1), 1.0F).build();
    public static final FoodProperties CHAMOMILE_TEA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5000, 1), 0.3F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 5000, 1), 1.0F).meat().build();

}
