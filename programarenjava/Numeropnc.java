
import java.util.Scanner;

public class Numeropnc {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        try{

            int dijito;

            System.out.println("Introduzca un numero, por favor: ");
            dijito = lector.nextInt();

            if (dijito > 0){
                System.out.println("El numero es positivo");
            } else {
                if (dijito < 0){
                    System.out.println("El numero es negativo");
                }
            }
            if (dijito == 0){
                System.out.println("El numero es cero");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally {
            lector.close();
        }


    }
}
