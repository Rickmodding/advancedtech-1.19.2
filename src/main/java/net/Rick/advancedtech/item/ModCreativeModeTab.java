package net.Rick.advancedtech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab resourcestab = new CreativeModeTab("resources") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.aluminiumingot.get());
        }
    };
    public static final CreativeModeTab test = new CreativeModeTab("test") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.aluminiumingot.get());
        }
    };
}
