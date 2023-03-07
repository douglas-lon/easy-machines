package com.doug.easymachines.datagen;

import com.doug.easymachines.EasyMachines;
import com.doug.easymachines.item.custom.ESMaterials;
import com.doug.easymachines.item.custom.ESRefinedMaterials;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ESItemModelProvider extends ItemModelProvider {
    public ESItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EasyMachines.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ESMaterials.COPPER_INGOT);
        simpleItem(ESMaterials.TIN_INGOT);
        simpleItem(ESMaterials.SILVER_INGOT);
        simpleItem(ESMaterials.LEAD_INGOT);
        simpleItem(ESMaterials.INVAR_INGOT);
        simpleItem(ESMaterials.FERROUS_INGOT);
        simpleItem(ESMaterials.ELECTRUM_INGOT);

        simpleItem(ESRefinedMaterials.CRUSHED_COPPER);
        simpleItem(ESRefinedMaterials.CRUSHED_TIN);
        simpleItem(ESRefinedMaterials.CRUSHED_SILVER);
        simpleItem(ESRefinedMaterials.CRUSHED_LEAD);
        simpleItem(ESRefinedMaterials.CRUSHED_INVAR);
        simpleItem(ESRefinedMaterials.CRUSHED_FERROUS);
        simpleItem(ESRefinedMaterials.CRUSHED_ELECTRUM);


        simpleItem(ESRefinedMaterials.COPPER_NUGGET);
        simpleItem(ESRefinedMaterials.TIN_NUGGET);
        simpleItem(ESRefinedMaterials.SILVER_NUGGET);
        simpleItem(ESRefinedMaterials.LEAD_NUGGET);
        simpleItem(ESRefinedMaterials.INVAR_NUGGET);
        simpleItem(ESRefinedMaterials.FERROUS_NUGGET);
        simpleItem(ESRefinedMaterials.ELECTRUM_NUGGET);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EasyMachines.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EasyMachines.MODID,"item/" + item.getId().getPath()));
    }
}
