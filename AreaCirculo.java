import java.util.Scanner;

public class AreaCirculo{
   public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    
    final double PI=3.1416
    double radio, area;

        System.out.println("Radio del circulo:");
        radio = sc.nextDouble();

        area = PI*(radio*radio);
        System.out.println("El area del circulo es: " + area);

    }
    }