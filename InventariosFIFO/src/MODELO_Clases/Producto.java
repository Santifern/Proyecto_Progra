package MODELO_Clases;
import java.util.ArrayList;

public class Producto {
    //Atributos
    private String nombre;
    private ArrayList<Lote> lote;
    //Builder
    public Producto(String nombre){
        this.nombre = nombre;
        lote = new ArrayList<>();
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Vender un Producto
    private void venderProducto(int cantidad){

    }

    
    //Comprar un Producto
    private void comprarProducto(int precio, int cantidad){

    }
}
