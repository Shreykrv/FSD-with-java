class math{
   public int addi(int a, int b){
    return a+b;
   } 
   public int multi(int a , int b){
    return a*b;}
}

public class Classes1 {
    public static void main(String[] args) {
        math a1 = new math();
        int x = 4;
        int y = 6;
    //    int z =  a1.addi(8 , 9);
       int z =  a1.multi(8 , 9);
       System.out.println(z);
       int x1 = 3;
       int y1 = 5;

       int z1 = a1.addi(7 , 4);
       System.out.println(z1);

       }
    
}
