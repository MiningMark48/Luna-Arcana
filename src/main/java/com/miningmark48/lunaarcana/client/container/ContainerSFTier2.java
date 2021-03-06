package com.miningmark48.lunaarcana.client.container;

import com.miningmark48.lunaarcana.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class ContainerSFTier2 extends Container{

    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;

    public ContainerSFTier2(InventoryPlayer player, World world, int x, int y, int z){
        craftMatrix = new InventoryCrafting(this, 9, 9);
        craftResult = new InventoryCraftResult();
        worldObj = world;
        this.posX = x;
        this.posY = y;
        this.posZ = z;

        this.addSlotToContainer(new SlotCrafting(player.player, craftMatrix, craftResult, 0, 186, 35));

        this.addSlotToContainer(new Slot(craftMatrix, 1, 34, 35));
        this.addSlotToContainer(new Slot(craftMatrix, 2, 62, 17));
        this.addSlotToContainer(new Slot(craftMatrix, 3, 80, 17));
        this.addSlotToContainer(new Slot(craftMatrix, 4, 98, 17));
        this.addSlotToContainer(new Slot(craftMatrix, 5, 62, 35));
        this.addSlotToContainer(new Slot(craftMatrix, 6, 80, 35));
        this.addSlotToContainer(new Slot(craftMatrix, 7, 98, 35));
        this.addSlotToContainer(new Slot(craftMatrix, 8, 62, 53));
        this.addSlotToContainer(new Slot(craftMatrix, 9, 80, 53));
        this.addSlotToContainer(new Slot(craftMatrix, 10, 98, 53));
        this.addSlotToContainer(new Slot(craftMatrix, 11, 129, 35));

        for (int i = 0; i < 3; i++){
            for (int k = 0; k < 9; k++){
                this.addSlotToContainer(new Slot(player, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++){
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }

        this.onCraftMatrixChanged(this.craftMatrix);
    }

    public void onCraftMatrixChanged(IInventory player)
    {
        this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
    }

    @Override
    public boolean canInteractWith(EntityPlayer player){
        if (worldObj.getBlock(posX, posY, posZ) != ModBlocks.spellFactoryTier2){
            return false;
        }else{
            return player.getDistanceSq((double)posX + 0.5D, (double)posY + 0.5D, (double)posZ + 0.5D) <= 64.0D;
        }
    }

    public void onContainerClosed(EntityPlayer player)
    {
        super.onContainerClosed(player);

        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                    player.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }

    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ >= 10 && p_82846_2_ < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (p_82846_2_ >= 37 && p_82846_2_ < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }

}
