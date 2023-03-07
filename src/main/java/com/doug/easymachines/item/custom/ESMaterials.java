package com.doug.easymachines.item.custom;

import com.doug.easymachines.EasyMachines;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ESMaterials {

    public static final DeferredRegister<Item> MATERIALS = DeferredRegister.create(ForgeRegistries.ITEMS, EasyMachines.MODID);

    public static final RegistryObject<Item> COPPER_INGOT = MATERIALS.register("copper_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = MATERIALS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = MATERIALS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = MATERIALS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_INGOT = MATERIALS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FERROUS_INGOT = MATERIALS.register("ferrous_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = MATERIALS.register("electrum_ingot", () -> new Item(new Item.Properties()));

}
