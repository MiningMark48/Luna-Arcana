package com.miningmark48.lunaarcana.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelWandTier5 extends ModelBase {
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    public ModelRenderer Shape6;
    public ModelRenderer Shape7;
    public ModelRenderer Shape8;
    public ModelRenderer Shape9;

    public ModelWandTier5() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape8 = new ModelRenderer(this, 31, 0);
        this.Shape8.setRotationPoint(0.30000001192092896F, 20.350000381469727F, -6.0F);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape9 = new ModelRenderer(this, 31, 0);
        this.Shape9.setRotationPoint(-0.30000001192092896F, 20.399999618530273F, -6.0F);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.setRotationPoint(0.0F, 20.366666793823242F, -8.0F);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.Shape4 = new ModelRenderer(this, 43, 0);
        this.Shape4.setRotationPoint(-1.0F, 19.5F, 0.0F);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
        this.Shape3 = new ModelRenderer(this, 36, 0);
        this.Shape3.setRotationPoint(-0.5F, 19.899999618530273F, 3.0F);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.Shape7 = new ModelRenderer(this, 31, 0);
        this.Shape7.setRotationPoint(0.0F, 20.600000381469727F, -6.0F);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape2 = new ModelRenderer(this, 52, 0);
        this.Shape2.setRotationPoint(-0.5F, 19.866666793823242F, 6.0F);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.Shape6 = new ModelRenderer(this, 31, 0);
        this.Shape6.setRotationPoint(0.0F, 20.100000381469727F, -6.0F);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Shape5 = new ModelRenderer(this, 56, 4);
        this.Shape5.setRotationPoint(-0.5F, 19.899999618530273F, -2.5F);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Shape8.render(f5);
        this.Shape9.render(f5);
        this.Shape1.render(f5);
        this.Shape4.render(f5);
        this.Shape3.render(f5);
        this.Shape7.render(f5);
        this.Shape2.render(f5);
        this.Shape6.render(f5);
        this.Shape5.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
