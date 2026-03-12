package com.rupnilcodes.enchantedcombat.enchantment;


import com.mojang.serialization.MapCodec;
import com.rupnilcodes.enchantedcombat.EnchantedCombat;
import com.rupnilcodes.enchantedcombat.enchantment.effect.LightningEnchantmentEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;

public class ModEnchantmentEffects {
    public static MapCodec<LightningEnchantmentEffect> LIGHTNING_EFFECT = register("lightning_effect", LightningEnchantmentEffect.CODEC);

    private static <T extends EnchantmentEntityEffect> MapCodec<T> register(String id, MapCodec<T> codec) {
        return Registry.register(BuiltInRegistries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.fromNamespaceAndPath(EnchantedCombat.MOD_ID, id), codec);
    }

    public static void registerModEnchantmentEffects() {
        EnchantedCombat.LOGGER.info("Registering EnchantmentEffects for" + EnchantedCombat.MOD_ID);
    }
}
