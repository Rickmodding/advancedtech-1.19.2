package net.Rick.advancedtech.item;

import net.Rick.advancedtech.advancedtech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, advancedtech.MOD_ID);
//copy this until (hello copy this end) for more items
public static final RegistryObject<Item> aluminiumingot = ITEMS.register("aluminiumingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.resourcestab)));
//hello copy this end
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
