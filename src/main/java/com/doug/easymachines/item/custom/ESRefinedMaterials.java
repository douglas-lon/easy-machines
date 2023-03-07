package com.doug.easymachines.item.custom;

import com.doug.easymachines.EasyMachines;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ESRefinedMaterials {

    public static final DeferredRegister<Item> REFINED_MATERIALS = DeferredRegister.create(ForgeRegistries.ITEMS, EasyMachines.MODID);

    public static final RegistryObject<Item> CRUSHED_COPPER = REFINED_MATERIALS.register("crushed_copper", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_TIN = REFINED_MATERIALS.register("crushed_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_SILVER = REFINED_MATERIALS.register("crushed_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_LEAD = REFINED_MATERIALS.register("crushed_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_INVAR = REFINED_MATERIALS.register("crushed_invar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_FERROUS = REFINED_MATERIALS.register("crushed_ferrous", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_ELECTRUM = REFINED_MATERIALS.register("crushed_electrum", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_NUGGET = REFINED_MATERIALS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = REFINED_MATERIALS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = REFINED_MATERIALS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = REFINED_MATERIALS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_NUGGET = REFINED_MATERIALS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FERROUS_NUGGET = REFINED_MATERIALS.register("ferrous_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = REFINED_MATERIALS.register("electrum_nugget", () -> new Item(new Item.Properties()));
}
