package com.example.unnamedthings;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class UnnamedThingsModelProvider extends ModelProvider {
    public UnnamedThingsModelProvider(PackOutput output) {
        super(output, UnnamedThings.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(UnnamedThings.EXAMPLE_BLOCK.get());

        itemModels.generateFlatItem(UnnamedThings.CUPID_ARROW_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(UnnamedThings.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);
    }
}
