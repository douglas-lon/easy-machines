package com.doug.easymachines.item;

import com.doug.easymachines.EasyMachines;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.doug.easymachines.item.custom.ESMaterials.MATERIALS;
import static com.doug.easymachines.item.custom.ESRefinedMaterials.REFINED_MATERIALS;


public class ESItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EasyMachines.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        MATERIALS.register(eventBus);
        REFINED_MATERIALS.register(eventBus);
    }
}
