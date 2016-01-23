package com.miningmark48.lunaarcana.renderer;

import com.miningmark48.lunaarcana.model.ModelSpellFactoryTier3;
import com.miningmark48.lunaarcana.tileentity.TileEntitySpellFactoryTier3;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderItemSpellFactoryTier3 implements IItemRenderer{

    private final ModelSpellFactoryTier3 model;

    public RenderItemSpellFactoryTier3(){
        model = new ModelSpellFactoryTier3();
    }

    @Override
    public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {

        if (type != type.ENTITY && type != type.EQUIPPED) {
            GL11.glPushMatrix();
            GL11.glScalef(1.0f, 1.0f, 1.0f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySpellFactoryTier3(), 0.0D, -0.15D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        } else if (type == type.ENTITY && !(item.getItem() instanceof ItemBlock)) {
            GL11.glPushMatrix();
            GL11.glScalef(1.5f, 1.5f, 1.5f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySpellFactoryTier3(), 0.0D, -0.15D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        } else if (type == type.ENTITY && item.getItem() instanceof ItemBlock) {
            GL11.glPushMatrix();
            GL11.glScalef(3.0f, 3.0f, 3.0f);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySpellFactoryTier3(), 0.0D, 0.0D, 0.0D, 0.0F);
            GL11.glPopMatrix();
        } else if (type == type.EQUIPPED) {
            GL11.glPushMatrix();
            GL11.glScalef(1.1f, 1.1f, 1.1f);
            GL11.glRotatef(45, -1, 0, 0);
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntitySpellFactoryTier3(), 0.2D, -0.3D, 0.35D, 0.0F);
            GL11.glRotatef(45, -1, 0, 0);
            GL11.glPopMatrix();
        }
    }

}
