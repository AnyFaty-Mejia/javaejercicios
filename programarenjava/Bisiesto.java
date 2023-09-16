import java.util.Scanner;
public class Bisiesto {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);


        try{

            System.out.println("SABER SI UN AÑO ES BISIESTO");
            System.out.println("Introduzca el año: ");

            int ano = lector.nextInt();
            if ((ano % 4 ==0) && (ano %100 !=0 || ano %400==0)){
                System.out.println("El año "+ano+" es bisiesto");
            }else {
                System.out.println("El año "+ano+" no es bisiesto");
            }
        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lector.close();
        }
    }
}
