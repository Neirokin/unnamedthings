package com.example.unnamedthings.entity.projectile;

import com.example.unnamedthings.UnnamedThings;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class CupidArrow extends AbstractArrow {

    public CupidArrow(EntityType<? extends CupidArrow> entityType, Level level) {
        super(entityType, level);
    }

    public CupidArrow(Level level, LivingEntity owner, ItemStack pickupItemStack, @Nullable ItemStack firedFromWeapon) {
        super(UnnamedThings.CUPID_ARROW.get(), owner, level, pickupItemStack, firedFromWeapon);
    }

    public CupidArrow(Level level, double x, double y, double z, ItemStack pickupItemStack, @Nullable ItemStack firedFromWeapon) {
        super(UnnamedThings.CUPID_ARROW.get(), x, y, z, level, pickupItemStack, firedFromWeapon);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(UnnamedThings.CUPID_ARROW_ITEM.get());
    }
}
