import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        try{
            System.out.println("GENERADOR DE NUMEROS FIBONACCI");
            System.out.println("Numero de posiciones deseadas en la serie");

            int cantidadNumeros = lector.nextInt();

            int tmp1=0;
            int tmp2=1;
            int tmp3;
            if (cantidadNumeros>=1){
                System.out.println(tmp1);
            }if (cantidadNumeros>=2){
                    System.out.println(tmp2);
            }for (int i=3; i<= cantidadNumeros; i++){
                tmp3=tmp1+tmp2;
                System.out.println(tmp3);
                tmp1=tmp2;
                tmp2=tmp3;

            }

        }catch (Exception err){
            System.out.println("Hubo un error");

        }finally{
            lector.close();
        }

    }
    
}


