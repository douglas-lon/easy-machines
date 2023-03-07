package com.doug.easymachines.datagen;

import com.doug.easymachines.block.ESBlocks;
import com.doug.easymachines.block.ESOres;
import com.google.common.collect.Iterables;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ESBlockLootTables extends BlockLootSubProvider {
    protected ESBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

       this.dropSelf(ESOres.COPPER_ORE.get());
       this.dropSelf(ESOres.TIN_ORE.get());
       this.dropSelf(ESOres.SILVER_ORE.get());
       this.dropSelf(ESOres.LEAD_ORE.get());
       this.dropSelf(ESOres.FERROUS_ORE.get());

        this.dropSelf(ESBlocks.COPPER_BLOCK.get());
        this.dropSelf(ESBlocks.TIN_BLOCK.get());
        this.dropSelf(ESBlocks.SILVER_BLOCK.get());
        this.dropSelf(ESBlocks.LEAD_BLOCK.get());
        this.dropSelf(ESBlocks.INVAR_BLOCK.get());
        this.dropSelf(ESBlocks.FERROUS_BLOCK.get());
        this.dropSelf(ESBlocks.ELECTRUM_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {

        Iterable<Block> firstWrapper = Iterables.concat(ESBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator, ESOres.ORES.getEntries().stream().map(RegistryObject::get)::iterator);
        return firstWrapper;
    }
}
