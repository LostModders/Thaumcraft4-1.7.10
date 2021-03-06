/*    */ package thaumcraft.client.renderers.tile;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import thaumcraft.common.tiles.TilePedestal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ public class TilePedestalRenderer
/*    */   extends TileEntitySpecialRenderer
/*    */ {
/*    */   public void renderTileEntityAt(TilePedestal ped, double par2, double par4, double par6, float par8)
/*    */   {
/* 28 */     if ((ped != null) && (ped.func_145831_w() != null) && (ped.func_70301_a(0) != null)) {
/* 29 */       EntityItem entityitem = null;
/* 30 */       float ticks = Minecraft.func_71410_x().field_71451_h.field_70173_aa + par8;
/* 31 */       GL11.glPushMatrix();
/* 32 */       float h = MathHelper.func_76126_a(ticks % 32767.0F / 16.0F) * 0.05F;
/* 33 */       GL11.glTranslatef((float)par2 + 0.5F, (float)par4 + 1.15F + h, (float)par6 + 0.5F);
/* 34 */       GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
/* 35 */       if ((ped.func_70301_a(0).func_77973_b() instanceof ItemBlock)) {
/* 36 */         GL11.glScalef(2.0F, 2.0F, 2.0F);
/*    */       }
/*    */       else {
/* 39 */         GL11.glScalef(1.0F, 1.0F, 1.0F);
/*    */       }
/*    */       
/* 42 */       ItemStack is = ped.func_70301_a(0).func_77946_l();
/* 43 */       is.field_77994_a = 1;
/* 44 */       entityitem = new EntityItem(ped.func_145831_w(), 0.0D, 0.0D, 0.0D, is);
/* 45 */       entityitem.field_70290_d = 0.0F;
/*    */       
/* 47 */       RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 48 */       if (!Minecraft.func_71375_t()) {
/* 49 */         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 50 */         RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/*    */       }
/* 52 */       GL11.glPopMatrix();
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void func_147500_a(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
/*    */   {
/* 62 */     renderTileEntityAt((TilePedestal)par1TileEntity, par2, par4, par6, par8);
/*    */   }
/*    */ }


/* Location:              /Users/shannon/Desktop/Thaumcraft-1.7.10-4.2.3.5.jar!/thaumcraft/client/renderers/tile/TilePedestalRenderer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */