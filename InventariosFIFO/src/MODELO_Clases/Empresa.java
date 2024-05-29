package MODELO_Clases;
import java.util.ArrayList;


public class Empresa {
    // Atributos
    private String nombre;
    private ArrayList<Producto> inventario;
    
    //Builder
    public Empresa(String nombre){
        this.nombre = nombre;
        inventario = new ArrayList<>();
    }
    
    //Getter
    public String getNombre() {
        return nombre;
    }
    
    //Comprar Producto para el inventario
    public void comprarProducto(String nombre){
        
    }
    //Buscar producto en inventario
    public boolean buscarProducto(String nombre){
    boolean existe = false;
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                existe = true; // El producto existe 
                break;
            }
        }
        return existe;         
    }     

    //Borrar producto
    public void borrarProducto(Producto producto) {
        boolean eliminado = inventario.remove(producto);
        if (eliminado) {
            System.out.println("Producto eliminado del inventario.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

}
