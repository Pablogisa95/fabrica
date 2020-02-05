package fabrica;

public class Main 
{
    public static void main(String[] args)
    {
        Pedido pedido = new Pedido();
        pedido.pedirProducto(1);
        pedido.pedirProducto(2);
        pedido.pedirProducto(3);
        if(pedido.getP1().iguales(pedido.getP2() ) && pedido.getP1().iguales(pedido.getP3() ) );
        pedido.mostrarPedido();
    }
}
