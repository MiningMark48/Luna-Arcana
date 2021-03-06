package com.miningmark48.lunaarcana.renderer;

import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.model.ModelSpellFactoryTier1;
import com.miningmark48.lunaarcana.reference.Reference;
import com.miningmark48.lunaarcana.tileentity.TileEntitySpellFactoryTier1;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class RenderSpellFactoryTier1 extends TileEntitySpecialRenderer{

    private final ModelSpellFactoryTier1 model;

    ItemStack stack = new ItemStack(ModItems.elixirIngot, 1, 0);
    EntityItem entItem = new EntityItem(Minecraft.getMinecraft().theWorld, 0D, 0D, 0D, stack);

    public RenderSpellFactoryTier1(){

        this.model = new ModelSpellFactoryTier1();
    }

    private void adjustRotatePivotViaMeta(World world, int x, int y, int z){
        int meta = world.getBlockMetadata(x, y, z);
        GL11.glPushMatrix();
        GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":textures/model/spellFactoryTier1.png");
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();

        GL11.glPushMatrix();
        this.entItem.hoverStart = 0.0F;
        RenderItem.renderInFrame = true;
        GL11.glTranslatef((float)x + 0.5F, (float)y + 0.4F, (float)z + 0.3F);
        GL11.glRotatef(180, 0, 1, 1);
        RenderManager.instance.renderEntityWithPosYaw(this.entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
        RenderItem.renderInFrame = false;
        GL11.glPopMatrix();
    }
    private void adjustLightFixture(World world, int i, int j, int k, Block block){
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightValue(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 35536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) modulousModifier, divModifier);
    }

}
