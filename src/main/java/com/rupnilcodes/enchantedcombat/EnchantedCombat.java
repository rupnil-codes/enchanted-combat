package com.rupnilcodes.enchantedcombat;

import com.rupnilcodes.enchantedcombat.enchantment.ModEnchantmentEffects;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantedCombat implements ModInitializer {
    public static final String MOD_ID = "enchantedcombat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModEnchantmentEffects.registerModEnchantmentEffects();
        LOGGER.info("Enchanted Combat initialized!");
    }
}
