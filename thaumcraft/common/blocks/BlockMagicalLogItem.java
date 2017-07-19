/*    */ package thaumcraft.common.blocks;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class BlockMagicalLogItem
/*    */   extends ItemBlock
/*    */ {
/*    */   public BlockMagicalLogItem(Block par1)
/*    */   {
/* 12 */     super(par1);
/* 13 */     func_77656_e(0);
/* 14 */     func_77627_a(true);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int func_77647_b(int par1)
/*    */   {
/* 23 */     return par1;
/*    */   }
/*    */   
/*    */ 
/*    */   public String func_77667_c(ItemStack par1ItemStack)
/*    */   {
/* 29 */     int var2 = par1ItemStack.func_77960_j();
/*    */     
/* 31 */     if ((var2 < 0) || (var2 >= BlockMagicalLog.woodType.length))
/*    */     {
/* 33 */       var2 = 0;
/*    */     }
/*    */     
/* 36 */     return super.func_77658_a() + "." + BlockMagicalLog.woodType[var2];
/*    */   }
/*    */ }


/* Location:              /Users/shannon/Desktop/Thaumcraft-1.7.10-4.2.3.5.jar!/thaumcraft/common/blocks/BlockMagicalLogItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */