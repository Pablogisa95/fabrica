package fabrica;
import java.util.*;

public class Pedido 
{
    private Producto p1;
    private Producto p2;
    private Producto p3;
    
    Pedido()
    {
        p1 = new Producto();
        p2 = new Producto();
        p3 = new Producto();
    }
    
    Producto getP1()
    {
        return p1;
    }
    
    Producto getP2()
    {
        return p2;
    }
    
    Producto getP3()
    {
        return p3;
    }
    
    public void pedirProducto(int num_p)
    {
        Scanner scan = new Scanner(System.in);
        switch(num_p)
        {
            case 1:
                p1.setNombre(Producto.pedirNombre());
                p1.setPrecio(Producto.pedirPrecio());
                break;
            case 2:
                p2.setNombre(Producto.pedirNombre());
                p2.setPrecio(Producto.pedirPrecio());
                break;
            case 3: 
                p3.setNombre(Producto.pedirNombre());
                p3.setPrecio(Producto.pedirPrecio());
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
    
    public double total()
    {
        return p1.getPrecio() + p2.getPrecio() + p3.getPrecio();
    }
    
    public void mostrarPedido()
    {
        p1.resumen();
        p2.resumen();
        p3.resumen();
        System.out.println(total() );
    }
}
