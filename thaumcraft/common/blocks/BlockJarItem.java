/*    */ package thaumcraft.common.blocks;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class BlockJarItem extends ItemBlock
/*    */ {
/*    */   public BlockJarItem(Block par1)
/*    */   {
/* 11 */     super(par1);
/* 12 */     func_77656_e(0);
/* 13 */     func_77627_a(true);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public int func_77647_b(int par1)
/*    */   {
/* 20 */     return par1;
/*    */   }
/*    */   
/*    */ 
/*    */   public String func_77667_c(ItemStack par1ItemStack)
/*    */   {
/* 26 */     return super.func_77658_a() + "." + par1ItemStack.func_77960_j();
/*    */   }
/*    */ }


/* Location:              /Users/shannon/Desktop/Thaumcraft-1.7.10-4.2.3.5.jar!/thaumcraft/common/blocks/BlockJarItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */