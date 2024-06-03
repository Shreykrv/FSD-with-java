class India{
    public String buyPC(int cost) {
    if(cost >= 50000){
        return ("buy new PC");
    } else {
        return("less money");
        }
        // return ("Buy PC");
    }
}
public class Sclass {
    public static void main(String[] args) {
       India x = new India();
    //    x.buyPC();
        System.out.println(x.buyPC(500000));
       
    }
    
}
