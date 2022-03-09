import java.util.Scanner;

public class Diamante {

    public static void main( String[] args){
        int num, esp, aster;

        Scanner leia = new Scanner(System.in);

        System.out.print(" Digite um numero impar: ");
        num = leia.nextInt();


        if( num%2 != 0){

            aster = 1;
            esp = (num-1) / 2;

            for ( int li = 1; esp > 0; li++) {

                for( int cont = 1; cont <= esp; cont++){
                    System.out.print(" ");
                }

                for( int cont = 1; cont <= aster; cont++){
                    System.out.print("*");
                }
                esp--;
                aster += 2;
                System.out.println();
            }

            for ( int li = 1; aster > 0; li++){

                for( int cont = 1; cont <= esp; cont++){
                    System.out.print(" ");
                }

                for( int cont = 1; cont  <= aster; cont++){
                    System.out.print("*");
                }

                esp++;
                aster -= 2;
                System.out.println();
            }
        } else {
        System.out.println("Nao foi digitado um numero impar.");
        }



    }
}
