package net.selocious.thekennanmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.selocious.thekennanmod.TheKennanMod;

public class ModItems {
    public static final Item BATTERY = registerItem("battery",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TheKennanMod.MOD_ID,"battery")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheKennanMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheKennanMod.LOGGER.info("Registering Mod Items for " + TheKennanMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BATTERY);
        });
    }
}
