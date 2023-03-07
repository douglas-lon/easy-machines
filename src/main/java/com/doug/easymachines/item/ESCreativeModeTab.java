package com.doug.easymachines.item;


import com.doug.easymachines.EasyMachines;
import com.doug.easymachines.item.custom.ESMaterials;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= EasyMachines.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ESCreativeModeTab {

    public static CreativeModeTab EASY_MACHINES_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        EASY_MACHINES_TAB = event.registerCreativeModeTab(new ResourceLocation(EasyMachines.MODID, "easymachines_tab"),
                builder -> builder.icon(() -> new ItemStack(ESMaterials.COPPER_INGOT.get())).title(Component.translatable("creativemodetab.easymachines_tab")));
    }
}
