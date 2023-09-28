import java.util.Scanner;

public class Calculador_MarcosJimenez {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, sum, opcion;
        float result;
        result = 0;
        while (true) {
            System.out.println("Calculadora");
            System.out.println("Eliga la operacion que quiere hacer:");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("3.MULTIPLICACION");
            System.out.println("4.DIVICION");
            System.out.println("0.SALIR");
            opcion = sc.nextInt();
            if (opcion == 1) {
                if (result > 0 || result < 0){
                    n1 = sc.nextInt();
                    result = result + n1;
                    System.out.println("["+result+"]");
                } else {
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    result = n1 + n2;
                    System.out.println("[" + result + "]");
                }
            } else if (opcion == 2) {
                if (result > 0 || result < 0){
                    n1 = sc.nextInt();
                    result = result - n1;
                    System.out.println("["+result+"]");
                } else {
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    result = n1 - n2;
                }
            } else if (opcion == 3){
                if (result > 0 || result < 0){
                    n1 = sc.nextInt();
                    result = result * n1;
                    System.out.println("["+result+"]");
                } else {
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    result = n1 * n2;
                }
            } else if (opcion == 4) {
                if (result > 0 || result < 0){
                    n1 = sc.nextInt();
                    if (n1 == 0){
                        System.out.println("ERROR");
                    } else{
                        result = result / n1;
                        System.out.println("["+result+"]");
                    }

                } else {
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    if (n1 == 0 || n2 == 0){
                        System.out.println("ERROR");
                    } else {
                        result = n1 / n2;
                        System.out.println("["+result+"]");
                    }
                }
            } else if (opcion == 0){
                break;

            }


        }
    System.out.println("El resultado final es: ["+result+"]");
    }

}
