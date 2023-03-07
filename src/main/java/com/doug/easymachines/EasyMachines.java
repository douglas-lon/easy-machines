package com.doug.easymachines;

import com.doug.easymachines.block.ESBlocks;
import com.doug.easymachines.block.ESOres;
import com.doug.easymachines.item.ESCreativeModeTab;
import com.doug.easymachines.item.ESItems;
import com.doug.easymachines.item.custom.ESMaterials;
import com.doug.easymachines.item.custom.ESRefinedMaterials;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EasyMachines.MODID)
public class EasyMachines
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "easymachines";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public EasyMachines()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ESItems.register(modEventBus);
        ESBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ESCreativeModeTab.EASY_MACHINES_TAB) {
            event.accept(ESMaterials.COPPER_INGOT);
            event.accept(ESMaterials.TIN_INGOT);
            event.accept(ESMaterials.SILVER_INGOT);
            event.accept(ESMaterials.LEAD_INGOT);
            event.accept(ESMaterials.INVAR_INGOT);
            event.accept(ESMaterials.FERROUS_INGOT);
            event.accept(ESMaterials.ELECTRUM_INGOT);

            event.accept(ESRefinedMaterials.CRUSHED_COPPER);
            event.accept(ESRefinedMaterials.CRUSHED_TIN);
            event.accept(ESRefinedMaterials.CRUSHED_SILVER);
            event.accept(ESRefinedMaterials.CRUSHED_LEAD);
            event.accept(ESRefinedMaterials.CRUSHED_INVAR);
            event.accept(ESRefinedMaterials.CRUSHED_FERROUS);
            event.accept(ESRefinedMaterials.CRUSHED_ELECTRUM);

            event.accept(ESRefinedMaterials.COPPER_NUGGET);
            event.accept(ESRefinedMaterials.TIN_NUGGET);
            event.accept(ESRefinedMaterials.SILVER_NUGGET);
            event.accept(ESRefinedMaterials.LEAD_NUGGET);
            event.accept(ESRefinedMaterials.INVAR_NUGGET);
            event.accept(ESRefinedMaterials.FERROUS_NUGGET);
            event.accept(ESRefinedMaterials.ELECTRUM_NUGGET);




            event.accept(ESBlocks.COPPER_BLOCK);
            event.accept(ESBlocks.TIN_BLOCK);
            event.accept(ESBlocks.SILVER_BLOCK);
            event.accept(ESBlocks.LEAD_BLOCK);
            event.accept(ESBlocks.INVAR_BLOCK);
            event.accept(ESBlocks.FERROUS_BLOCK);
            event.accept(ESBlocks.ELECTRUM_BLOCK);

            event.accept(ESOres.COPPER_ORE);
            event.accept(ESOres.TIN_ORE);
            event.accept(ESOres.SILVER_ORE);
            event.accept(ESOres.LEAD_ORE);
            event.accept(ESOres.FERROUS_ORE);

        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
