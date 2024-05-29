
package Prueba;
import MODELO_Clases.*;
import java.util.Scanner;
public class MenuPrincipal {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empresa pepsi = new Empresa("Pepsi");
        System.out.println("Bienvenido al sistema ERP de la empresa "+ pepsi.getNombre());
        int b = 0;
        while(b == 0){
            System.out.println("1) Comprar producto ");
            System.out.println("2) Vender producto ");
            System.out.println("3) Buscar producto en inventario");
            System.out.println("4) Borrar producto del inventario");
            System.out.println("5) Imprimir inventario actual");
            System.out.println("6) Salir del sistema");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Introduzca el nombre del producto: ");
                    String producto = teclado.next();
                    
                    break;
                    
                case 2:
                    System.out.print("Introduzca el nombre del producto: ");
                    String producto2 = teclado.next();
                    
                    break;
                    
                case 3:
                    System.out.print("Introduzca el nombre del producto: ");
                    String producto3 = teclado.next();
                    
                    break;
                    
                case 4:
                    System.out.print("Introduzca el nombre del producto: ");
                    String producto4 = teclado.next();
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    System.out.println("Gracias por usar el sistema! ");
                    b = 1;
                    break;
            }
        }
        
        
    }
    
}
