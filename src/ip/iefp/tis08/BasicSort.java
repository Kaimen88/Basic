package ip.iefp.tis08;

import java.util.Scanner;

public class BasicSort {
    
    public static int[] BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
        return null;
} 

    public static void main(String[] args) {
        System.out.println("Aplicação Ordenar");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "º numero=");
            int x [i] = in.nextInt();
        }
        
        
        System.out.println(BubbleSort(x) + ", ");
    }

}
