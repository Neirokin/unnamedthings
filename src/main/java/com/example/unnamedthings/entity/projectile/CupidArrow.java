package com.example.unnamedthings.entity.projectile;

import com.example.unnamedthings.UnnamedThings;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SpellParticleOption;
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

    public void tick() {
        super.tick();

        if(this.level().isClientSide() && !this.isInGround()) {
            this.level().addParticle(ParticleTypes.HEART, this.getX(), this.getY(), this.getZ(), 0f, 0f, 0f);
        }
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(UnnamedThings.CUPID_ARROW_ITEM.get());
    }
}
