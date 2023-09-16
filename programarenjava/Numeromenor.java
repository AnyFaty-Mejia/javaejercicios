import java.util.Scanner;

public class Numeromenor{

    public static void main(String[] args) {

         Scanner lector = new Scanner (System.in);


        double a, b, c;

        try{
                System.out.println("Ingrese el primer numero: ");
                a = lector.nextDouble();

                System.out.println("Ingrese el segundo numero: ");
                b = lector.nextDouble();

                System.out.println("Ingrese el tercer numero: ");
                c = lector.nextDouble();

                if (a<b && a<c){
                    System.out.println("El numero menor es: " +a);

                }else if (b<a && b<c){
                    System.out.println("El numero menor es: " +b);

                }else if (c<a && c<b){
                    System.out.println("El numero menor es: " +c);

                }else {
                    System.out.println("Todos los numeros son iguales");
               }


            } catch (Exception err){
                System.out.println("Hubo un error");
            } finally{
                lector.close();
            }

    }
       
        

            
    


}
            