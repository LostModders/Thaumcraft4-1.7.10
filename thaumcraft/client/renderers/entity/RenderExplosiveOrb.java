/*    */ package thaumcraft.client.renderers.entity;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.minecraft.client.entity.AbstractClientPlayer;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.entity.Render;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import thaumcraft.client.fx.ParticleEngine;
/*    */ import thaumcraft.client.lib.UtilsFX;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RenderExplosiveOrb
/*    */   extends Render
/*    */ {
/*    */   public RenderExplosiveOrb()
/*    */   {
/* 28 */     this.field_76989_e = 0.0F;
/*    */   }
/*    */   
/* 31 */   private Random random = new Random();
/*    */   
/*    */   public void renderEntityAt(Entity entity, double x, double y, double z, float fq, float pticks)
/*    */   {
/* 35 */     Tessellator tessellator = Tessellator.field_78398_a;
/*    */     
/* 37 */     GL11.glPushMatrix();
/* 38 */     GL11.glTranslated(x, y, z);
/* 39 */     GL11.glEnable(3042);
/* 40 */     GL11.glBlendFunc(770, 771);
/*    */     
/* 42 */     UtilsFX.bindTexture(ParticleEngine.particleTexture2);
/*    */     
/* 44 */     float f2 = entity.field_70173_aa % 4 / 16.0F;
/* 45 */     float f3 = f2 + 0.0625F;
/* 46 */     float f4 = 0.8125F;
/* 47 */     float f5 = f4 + 0.0625F;
/*    */     
/* 49 */     float f6 = 1.0F;
/* 50 */     float f7 = 0.5F;
/* 51 */     float f8 = 0.5F;
/*    */     
/* 53 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.8F);
/* 54 */     GL11.glRotatef(180.0F - this.field_76990_c.field_78735_i, 0.0F, 1.0F, 0.0F);
/* 55 */     GL11.glRotatef(-this.field_76990_c.field_78732_j, 1.0F, 0.0F, 0.0F);
/* 56 */     GL11.glScalef(0.7F, 0.7F, 0.7F);
/* 57 */     tessellator.func_78382_b();
/* 58 */     tessellator.func_78380_c(220);
/* 59 */     tessellator.func_78375_b(0.0F, 1.0F, 0.0F);
/* 60 */     tessellator.func_78374_a(-f7, -f8, 0.0D, f2, f5);
/* 61 */     tessellator.func_78374_a(f6 - f7, -f8, 0.0D, f3, f5);
/* 62 */     tessellator.func_78374_a(f6 - f7, 1.0F - f8, 0.0D, f3, f4);
/* 63 */     tessellator.func_78374_a(-f7, 1.0F - f8, 0.0D, f2, f4);
/* 64 */     tessellator.func_78381_a();
/* 65 */     GL11.glDisable(3042);
/* 66 */     GL11.glDisable(32826);
/*    */     
/*    */ 
/*    */ 
/* 70 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void func_76986_a(Entity entity, double d, double d1, double d2, float f, float f1)
/*    */   {
/* 77 */     renderEntityAt(entity, d, d1, d2, f, f1);
/*    */   }
/*    */   
/*    */ 
/*    */   protected ResourceLocation func_110775_a(Entity entity)
/*    */   {
/* 83 */     return AbstractClientPlayer.field_110314_b;
/*    */   }
/*    */ }


/* Location:              /Users/shannon/Desktop/Thaumcraft-1.7.10-4.2.3.5.jar!/thaumcraft/client/renderers/entity/RenderExplosiveOrb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */