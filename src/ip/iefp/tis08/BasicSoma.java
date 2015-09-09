package ip.iefp.tis08;

import java.util.Scanner;

public class BasicSoma {
    //private static int x;
    //private static int y;
    
    public static int soma(int x, int y){
        return x + y;
        
    }
    
    public static void main(String[] args) {
        System.out.println("Aplicação Soma");
        Scanner in = new Scanner (System.in);
        
        System.out.println("x=");
        int x = in.nextInt();
        
        System.out.println("y=");
        int y = in.nextInt();
        
        System.out.println("X + Y= " + soma(x , y));
        
    }
}
