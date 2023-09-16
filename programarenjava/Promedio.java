import javax.swing.JOptionPane;

public class Promedio {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("NUMERO 1: ");
        String n2 = JOptionPane.showInputDialog("NUMERO 2: ");
        String n3 = JOptionPane.showInputDialog("NUMERO 3: ");
        String n4 = JOptionPane.showInputDialog("NUMERO 4: ");
        String n5 = JOptionPane.showInputDialog("NUMERO 5: ");

        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        double num3 = Double.parseDouble(n3);
        double num4 = Double.parseDouble(n4);
        double num5 = Double.parseDouble(n5);

        double listado[] =new double[5];
        listado[0]=num1;
        listado[1]=num2;
        listado[2]=num3;
        listado[3]=num4;
        listado[4]=num5;

        double suma=0;
        double prom=0;

        for (int i= 0; i <listado.length; i++){
            suma+=listado[i];

        }

        prom=suma/ listado.length;
        JOptionPane.showMessageDialog(null, "Resultados: \n"
                +"La suma del arreglo es: "+suma+"\n"
                    +"El promedio es: "+prom+"\n"
        );
    }
    
}
