import.java.util.Scanner;

public class Descuento{
   public static void main (String [] args){
    Scanner sc = new scanner(System.in);
    final double DESCUENTO = .90;

    double precio1, precio2, precio3, precio4, precio5, resultado, totalDesc;

    System.out.printl("Producto 1");
    precio1 = sc.nextDouble();

    System.out.printl("Producto 2");
    precio2 = sc.nextDouble();

    System.out.printl("Producto 3");
    precio3 = sc.nextDouble();

    System.out.printl("Producto 4");
    precio4 = sc.nextDouble();

    System.out.printl("Producto 5");
    precio5 = sc.nextDouble();

    resultado = precio1+precio2+precio3+precio4+precio5;
    totalDesc = resultado*DESCUENTO;
    System.out.printl("El total con descuento es " + totalDesc);
   } 
}