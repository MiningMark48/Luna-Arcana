package com.miningmark48.lunaarcana.renderer;

import com.miningmark48.lunaarcana.model.ModelWandTier5;
import com.miningmark48.lunaarcana.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderItemWandTier5 implements IItemRenderer{

    protected ModelWandTier5 model;

    public RenderItemWandTier5(){

        model = new ModelWandTier5();

    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch(type){
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch(type){
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/model/wandTier5.png"));

                GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);

                GL11.glTranslatef(1.0F, -2.0F, 1.0F);

                GL11.glScalef(1.5F, 1.5F, 1.5F);

                model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

                GL11.glPopMatrix();
            default:
                break;

        }

    }

}
