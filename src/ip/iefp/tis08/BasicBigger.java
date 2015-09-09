package ip.iefp.tis08;

import java.util.Scanner;

public class BasicBigger {

    public static enum CODIGO {

        IGUAL, MAIOR, MENOR, ERRO
    };

    public static CODIGO bigger(int x, int y) {
        if (x == y) {
            return CODIGO.IGUAL;
        }
        if (x > y) {
            return CODIGO.MAIOR;
        }
        if (x < y) {
            return CODIGO.MENOR;
        }
        return CODIGO.ERRO;
    }

    public static void main(String[] args) {
        System.out.println("Aplicação Maior");
        Scanner in = new Scanner(System.in);

        System.out.println("A=");
        int x = in.nextInt();

        System.out.println("B=");
        int y = in.nextInt();

        switch (bigger(x, y)) {
            case IGUAL:
                System.out.println("A é igual a B!");
                break;
            case MAIOR:
                System.out.println("A é maior a B!");
                break;
            case MENOR:
                System.out.println("A é menor a B!");
                break;
            default:
                System.out.println("Erro na comparação!");
                break;
        }
    }
}
