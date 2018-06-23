package com.viking2481.projectmod.Entity.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;



/**
 * ModelMoa - Viking 2481
 * Created using Tabula 7.0.0
 */
public class ModelMoa extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer LeftWing;
    public ModelRenderer RightWing;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer RightLowerLeg;
    public ModelRenderer RightHeel;
    public ModelRenderer RightFoot_LeftToe;
    public ModelRenderer Rightfoot_RightToe;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer LeftLowerLeg;
    public ModelRenderer LeftHeel;
    public ModelRenderer LeftFoot_RightToe;
    public ModelRenderer LeftFoot_LeftToe;
    public ModelRenderer Neck;
    public ModelRenderer HeadBase;
    public ModelRenderer TopBeak;
    public ModelRenderer BottomBeak;
    public ModelRenderer Mohawk;
    public ModelRenderer LeftEye;
    public ModelRenderer RightEye;

    public ModelMoa() {
        this.textureWidth = 96;
        this.textureHeight = 32;
        this.TopBeak = new ModelRenderer(this, 58, 9);
        this.TopBeak.setRotationPoint(0.0F, -1.78F, -4.64F);
        this.TopBeak.addBox(-1.5F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(TopBeak, 0.17453292519943295F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 9);
        this.Body.setRotationPoint(-6.5F, 5.0F, -8.0F);
        this.Body.addBox(2.0F, 0.0F, 0.5F, 9, 8, 14, 0.0F);
        this.RightFoot_LeftToe = new ModelRenderer(this, 88, 28);
        this.RightFoot_LeftToe.setRotationPoint(5.7F, 10.4F, -5.2F);
        this.RightFoot_LeftToe.addBox(0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(RightFoot_LeftToe, -0.2617993877991494F, 0.0F, 0.0F);
        this.LeftLowerLeg = new ModelRenderer(this, 90, 7);
        this.LeftLowerLeg.setRotationPoint(-3.6F, 4.2F, 0.7F);
        this.LeftLowerLeg.addBox(-0.1F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(LeftLowerLeg, -0.5235987755982988F, 0.0F, 0.0F);
        this.LeftFoot_LeftToe = new ModelRenderer(this, 88, 28);
        this.LeftFoot_LeftToe.setRotationPoint(-2.6F, 10.4F, -5.2F);
        this.LeftFoot_LeftToe.addBox(-1.2F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(LeftFoot_LeftToe, -0.2617993877991494F, 0.0F, 0.0F);
        this.RightUpperLeg = new ModelRenderer(this, 86, 0);
        this.RightUpperLeg.setRotationPoint(-3.5F, 12.75F, -1.7F);
        this.RightUpperLeg.addBox(-0.1F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(RightUpperLeg, 0.2617993877991494F, 0.0F, 0.0F);
        this.LeftHeel = new ModelRenderer(this, 88, 29);
        this.LeftHeel.setRotationPoint(-3.21F, 10.8F, -3.0F);
        this.LeftHeel.addBox(-0.5F, -1.0F, -0.4F, 2, 1, 2, 0.0F);
        this.setRotateAngle(LeftHeel, 0.2617993877991494F, 0.0F, 0.0F);
        this.LeftEye = new ModelRenderer(this, 0, 0);
        this.LeftEye.setRotationPoint(0.4F, -1.5F, 1.0F);
        this.LeftEye.addBox(-2.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftEye, 0.08726646259971647F, 0.0F, 0.0F);
        this.Rightfoot_RightToe = new ModelRenderer(this, 88, 28);
        this.Rightfoot_RightToe.setRotationPoint(4.5F, 10.4F, -5.2F);
        this.Rightfoot_RightToe.addBox(0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rightfoot_RightToe, -0.2617993877991494F, 0.0F, 0.0F);
        this.LeftFoot_RightToe = new ModelRenderer(this, 88, 28);
        this.LeftFoot_RightToe.setRotationPoint(-2.6F, 10.4F, -5.2F);
        this.LeftFoot_RightToe.addBox(0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(LeftFoot_RightToe, -0.2617993877991494F, 0.0F, 0.0F);
        this.BottomBeak = new ModelRenderer(this, 58, 4);
        this.BottomBeak.setRotationPoint(0.0F, 0.2F, -4.5F);
        this.BottomBeak.addBox(-1.5F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(BottomBeak, 0.17453292519943295F, 0.0F, 0.0F);
        this.RightLowerLeg = new ModelRenderer(this, 90, 7);
        this.RightLowerLeg.setRotationPoint(4.7F, 4.2F, 0.7F);
        this.RightLowerLeg.addBox(-0.1F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(RightLowerLeg, -0.5235987755982988F, 0.0F, 0.0F);
        this.RightWing = new ModelRenderer(this, 32, 11);
        this.RightWing.setRotationPoint(-5.5F, 5.0F, -3.0F);
        this.RightWing.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
        this.RightHeel = new ModelRenderer(this, 88, 29);
        this.RightHeel.setRotationPoint(5.11F, 10.8F, -3.0F);
        this.RightHeel.addBox(-0.5F, -1.0F, -0.4F, 2, 1, 2, 0.0F);
        this.LeftWing = new ModelRenderer(this, 32, 11);
        this.LeftWing.setRotationPoint(4.5F, 5.0F, -3.0F);
        this.LeftWing.addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
        this.LeftUpperLeg = new ModelRenderer(this, 86, 0);
        this.LeftUpperLeg.setRotationPoint(0.65F, 12.75F, -1.7F);
        this.LeftUpperLeg.addBox(0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(LeftUpperLeg, 0.2617993877991494F, 0.0F, 0.0F);
        this.HeadBase = new ModelRenderer(this, 46, 25);
        this.HeadBase.mirror = true;
        this.HeadBase.setRotationPoint(0.0F, -3.4F, -0.8F);
        this.HeadBase.addBox(-1.5F, 0.9F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(HeadBase, 0.08726646259971647F, 0.0F, 0.0F);
        this.RightEye = new ModelRenderer(this, 0, 0);
        this.RightEye.setRotationPoint(-0.4F, -1.5F, 1.0F);
        this.RightEye.addBox(2.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightEye, 0.08726646259971647F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 74, 0);
        this.Neck.setRotationPoint(-0.5F, -5.7F, -5.8F);
        this.Neck.addBox(-1.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.setRotateAngle(Neck, -0.08726646259971647F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 14, 3);
        this.Tail.setRotationPoint(0.0F, 8.0F, 5.5F);
        this.Tail.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F);
        this.setRotateAngle(Tail, 0.4363323129985824F, 0.0F, 0.0F);
        this.Mohawk = new ModelRenderer(this, 24, 1);
        this.Mohawk.setRotationPoint(0.0F, -3.5F, -4.2F);
        this.Mohawk.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(Mohawk, 0.17453292519943295F, 0.0F, 0.0F);
        this.Neck.addChild(this.TopBeak);
        this.RightUpperLeg.addChild(this.RightFoot_LeftToe);
        this.LeftUpperLeg.addChild(this.LeftLowerLeg);
        this.LeftUpperLeg.addChild(this.LeftFoot_LeftToe);
        this.LeftUpperLeg.addChild(this.LeftHeel);
        this.Neck.addChild(this.LeftEye);
        this.RightUpperLeg.addChild(this.Rightfoot_RightToe);
        this.LeftUpperLeg.addChild(this.LeftFoot_RightToe);
        this.Neck.addChild(this.BottomBeak);
        this.RightUpperLeg.addChild(this.RightLowerLeg);
        this.RightUpperLeg.addChild(this.RightHeel);
        this.Neck.addChild(this.HeadBase);
        this.Neck.addChild(this.RightEye);
        this.Neck.addChild(this.Mohawk);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
        this.RightUpperLeg.render(f5);
        this.RightWing.render(f5);
        this.LeftWing.render(f5);
        this.LeftUpperLeg.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Neck.offsetX, this.Neck.offsetY, this.Neck.offsetZ);
        GlStateManager.translate(this.Neck.rotationPointX * f5, this.Neck.rotationPointY * f5, this.Neck.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 1.3D);
        GlStateManager.translate(-this.Neck.offsetX, -this.Neck.offsetY, -this.Neck.offsetZ);
        GlStateManager.translate(-this.Neck.rotationPointX * f5, -this.Neck.rotationPointY * f5, -this.Neck.rotationPointZ * f5);
        this.Neck.render(f5);
        GlStateManager.popMatrix();
        this.Tail.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.RightUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Neck.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Neck.rotateAngleX = headPitch * 0.017453292F;
    	
    	this.LeftWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
    	this.RightWing.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
    }
}
