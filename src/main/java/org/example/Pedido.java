package org.example;
import java.util.List;

public class Pedido {
    private int idPedido;
    private List<Producto> productos;

    public Pedido() {

    }

    public Pedido(int idPedido, List<Producto> productos) {
        this.idPedido = idPedido;
        this.productos = productos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", productos=" + productos +
                '}';
    }

    // Agregar producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // calcular precio
    private double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    // Mostrar detalles del pedido
    public void mostrarDetalles() {
        System.out.println("--------------------------------");
        System.out.println(" DETALLES DEL PEDIDO #" + idPedido);
        System.out.println("--------------------------------");

        if (productos.isEmpty()) {
            System.out.println("El pedido está vacío.");
        } else {
            System.out.println("PRODUCTO       |       PRECIO");
            for (Producto p : productos) {
                System.out.println("- " + p.getNombre() + ": $ " + p.getPrecio());
            }
        }

        System.out.println("--------------------------------");
        System.out.println("TOTAL A PAGAR:      $ " + this.calcularTotal());
        System.out.println("--------------------------------");
    }

}
