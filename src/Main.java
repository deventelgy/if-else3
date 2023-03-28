import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args)
    {

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();

        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (numero%2==0){
            System.out.println("El numero "+numero+" es divisible entre 2\n");
            System.out.println("Residuo es: "+(numero%2));

        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
            System.out.println("Residuo es: "+(numero%2));
        }
        * */

        String texto=JOptionPane.showInputDialog("Introduce un numero");
        //Pasamos el String a int
        int numero=Integer.parseInt(texto);

        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (numero%2==0){
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
}