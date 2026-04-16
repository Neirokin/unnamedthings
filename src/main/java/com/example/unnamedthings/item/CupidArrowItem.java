package com.example.unnamedthings.item;

import com.example.unnamedthings.entity.projectile.CupidArrow;
import net.minecraft.core.Position;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class CupidArrowItem extends ArrowItem {
    public CupidArrowItem(Item.Properties properties) {
        super(properties);
    }

    public AbstractArrow createArrow(Level level, ItemStack ammo, LivingEntity shooter, @Nullable ItemStack weapon) {
        return new CupidArrow(level, shooter, ammo.copyWithCount(1), weapon);
    }

    public Projectile asProjectile(Level level, Position pos, ItemStack stack, Direction direction) {
        CupidArrow cupidArrow = new CupidArrow(level, pos.x(), pos.y(), pos.z(), stack.copyWithCount(1), null);
        cupidArrow.pickup = AbstractArrow.Pickup.ALLOWED;

        return cupidArrow;
    }
}
