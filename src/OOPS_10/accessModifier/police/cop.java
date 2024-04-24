package src.OOPS_10.accessModifier.police;

public class cop {
   public int gun;

   public cop(int gun)
   {
       this.gun = gun;
   }

   protected void  canIShoot()
   {
       System.out.println(" ofcourse shoot");
   }

}
