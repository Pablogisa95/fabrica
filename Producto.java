package fabrica;
import java.util.*;

public class Producto 
{
    private String nombre;
    private int serie;
    private double precio;
    
    Producto()
    {
        nombre = "nombre";
        serie = generar();
        precio = 1;
    }
    
    Producto(String nombre, int serie, double precio)
    {
        setNombre(nombre);
        if(serie < 0 || serie > 100000) this.serie = generar();
        setPrecio(precio);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getSerie()
    {
        return serie;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    private static int generar()
    {
         
        return (int) (Math.random() * 100000 + 1); //0 <= random() < 1
    }
    
    public void setNombre(String name)
    {
        if(!name.isEmpty()) nombre = name;
        else nombre = pedirNombre();

    }
    
    public void setPrecio(double price)
    {
        if(price>0.0) precio = price;
        else precio = pedirPrecio();

    }
    
    public static String pedirNombre()
    {
        String name;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Introduce el nombre del producto");
            name = scan.nextLine();
        }
        while (name.isEmpty() );
        return name;
    }
    
    public static double pedirPrecio()
    {
        double price;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Introduce el precio del producto");
            price = scan.nextDouble();
        }
        while(price <= 0); 
        return price;
    }
    
    public void resumen()
    {
        System.out.print("INFORME DE PRODUCTO \n ------------------------------\n");
        System.out.println("<" + nombre + ">");
        System.out.println("<" + serie + ">");
        System.err.println("<" + precio + ">");
    }
    
    public boolean iguales(Producto p)
    {
        return nombre.equals(p.getNombre() ) && serie == p.getSerie();
    }
}
