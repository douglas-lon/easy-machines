package com.doug.easymachines.datagen;

import com.doug.easymachines.EasyMachines;
import com.doug.easymachines.block.ESBlocks;
import com.doug.easymachines.block.ESOres;
import com.doug.easymachines.item.custom.ESMaterials;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ESReciperProvider extends RecipeProvider{
    public ESReciperProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, List.of(ESOres.COPPER_ORE.get()), RecipeCategory.MISC,
                ESMaterials.COPPER_INGOT.get(), 0.7f, 200, "cooper_ingot");
        oreSmelting(pWriter, List.of(ESOres.TIN_ORE.get()), RecipeCategory.MISC,
                ESMaterials.TIN_INGOT.get(), 0.7f, 200, "tin_ingot");
        oreSmelting(pWriter, List.of(ESOres.SILVER_ORE.get()), RecipeCategory.MISC,
                ESMaterials.SILVER_INGOT.get(), 0.7f, 200, "silver_ingot");
        oreSmelting(pWriter, List.of(ESOres.LEAD_ORE.get()), RecipeCategory.MISC,
                ESMaterials.LEAD_INGOT.get(), 0.7f, 200, "lead_ingot");
        oreSmelting(pWriter, List.of(ESOres.FERROUS_ORE.get()), RecipeCategory.MISC,
                ESMaterials.FERROUS_INGOT.get(), 0.7f, 200, "ferrous_ingot");

        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.COPPER_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.COPPER_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.TIN_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.TIN_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.SILVER_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.SILVER_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.LEAD_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.LEAD_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.INVAR_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.INVAR_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.FERROUS_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.FERROUS_BLOCK.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, ESMaterials.ELECTRUM_INGOT.get(), RecipeCategory.MISC,
                ESBlocks.ELECTRUM_BLOCK.get());


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer,
                            new ResourceLocation(EasyMachines.MODID, getItemName(pResult)) + pRecipeName + "_" + getItemName(itemlike));
        }

    }


    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pUnpackedCategory, ItemLike pUnpacked, RecipeCategory pPackedCategory, ItemLike pPacked) {
        nineBlockStorageRecipes(pFinishedRecipeConsumer, pUnpackedCategory, pUnpacked, pPackedCategory, pPacked, getSimpleRecipeName(pPacked), (String)null, getSimpleRecipeName(pUnpacked), (String)null);
    }
    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pUnpackedCategory, ItemLike pUnpacked, RecipeCategory pPackedCategory, ItemLike pPacked, String pPackedName, @Nullable String pPackedGroup, String pUnpackedName, @Nullable String pUnpackedGroup) {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9).requires(pPacked).group(pUnpackedGroup).unlockedBy(getHasName(pPacked), has(pPacked))
                .save(pFinishedRecipeConsumer, new ResourceLocation(EasyMachines.MODID, pUnpackedName));
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked).pattern("###").pattern("###").pattern("###").group(pPackedGroup).unlockedBy(getHasName(pUnpacked), has(pUnpacked))
                .save(pFinishedRecipeConsumer, new ResourceLocation(EasyMachines.MODID, pPackedName));
    }
}
