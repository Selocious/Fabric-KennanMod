package net.selocious.thekennanmod;

import net.fabricmc.api.ModInitializer;

import net.selocious.thekennanmod.block.ModBlocks;
import net.selocious.thekennanmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheKennanMod implements ModInitializer {
	public static final String MOD_ID = "thekennanmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}