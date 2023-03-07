package com.doug.easymachines.datagen;

import com.doug.easymachines.EasyMachines;
import com.doug.easymachines.block.ESBlocks;
import com.doug.easymachines.block.ESOres;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ESBlockStateProvider extends BlockStateProvider {


    public ESBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EasyMachines.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ESBlocks.COPPER_BLOCK);
        blockWithItem(ESBlocks.TIN_BLOCK);
        blockWithItem(ESBlocks.SILVER_BLOCK);
        blockWithItem(ESBlocks.LEAD_BLOCK);
        blockWithItem(ESBlocks.INVAR_BLOCK);
        blockWithItem(ESBlocks.FERROUS_BLOCK);
        blockWithItem(ESBlocks.ELECTRUM_BLOCK);

        blockWithItem(ESOres.COPPER_ORE);
        blockWithItem(ESOres.TIN_ORE);
        blockWithItem(ESOres.SILVER_ORE);
        blockWithItem(ESOres.LEAD_ORE);
        blockWithItem(ESOres.FERROUS_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
