package com.example.unnamedthings;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class UnnamedThingsLanguageProvider extends LanguageProvider {

    public UnnamedThingsLanguageProvider(PackOutput output) {
        super(output, UnnamedThings.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.unnamedthings", "Unnamed Things");

        this.addItem(UnnamedThings.EXAMPLE_ITEM, "Example Item");
        this.addItem(UnnamedThings.CUPID_ARROW_ITEM, "Cupid Arrow");

        this.addBlock(UnnamedThings.EXAMPLE_BLOCK, "Example Block");

        this.addEntityType(UnnamedThings.CUPID_ARROW, "Cupid Arrow");
    }
}
