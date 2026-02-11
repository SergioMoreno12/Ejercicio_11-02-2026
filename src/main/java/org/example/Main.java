package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear algunos productos
        Producto p1 = new Producto("Teclado Mecánico", 150000);
        Producto p2 = new Producto("Mouse Gamer", 85000);
        Producto p3 = new Producto("Monitor 24 pulg", 650000);
        Producto p4 = new Producto("Cable HDMI", 25000);

        // Crear un Pedido
        List<Producto> listvacia1 = new ArrayList<>();
        System.out.println("--- Creando Pedido 1 ---");
        Pedido pedido1 = new Pedido(1, listvacia1 );

        // Agregar productos al pedido
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);
        pedido1.agregarProducto(p4);

        // Mostrar detalles
        pedido1.mostrarDetalles();

        // Crear un segundo pedido independiente
        List<Producto> listvacia2 = new ArrayList<>();
        System.out.println("--- Creando Pedido 2 ---");
        Pedido pedido2 = new Pedido(2, listvacia2);
        pedido2.agregarProducto(p3);
        pedido2.mostrarDetalles();
    }
}
