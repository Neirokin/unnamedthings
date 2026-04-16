package com.example.unnamedthings;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class UnnamedThingsItemTagsProvider extends ItemTagsProvider {

    public UnnamedThingsItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, UnnamedThings.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        this.tag(ItemTags.ARROWS)
                .add(UnnamedThings.CUPID_ARROW_ITEM.get());
    }
}
