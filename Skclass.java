class math{
    // int a;
    // int b;
    public int add(int a, int b) {
    return a + b ;
    }

    public int add(int a, int b, int c){
    return a + b + c;
    }
    public int add(int a, int b, int c , int d){
    return a + b + c + d;
    }
}


public class Skclass {
    public static void main(String[] args) {
        math obj = new math();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(5,7,6));
        System.out.println(obj.add(5, 6, 9, 3));
    }
    
}

