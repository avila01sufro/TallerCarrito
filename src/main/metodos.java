package main;

import java.util.Random;

public class metodos {
    public static void main(String[] args){
        crearArray();
    }

    public static void crearArray() {
        Random rand = new Random();
        int longArreglo;
        do {
            longArreglo = rand.nextInt(19);
        }while (longArreglo == 0);

        int[] productos = new int[longArreglo];
        int[] cantidad = new int[longArreglo];

        crearProductos(productos, cantidad);
    }

    public static void crearProductos(int[] productos, int[] cantidad) {

        for (int i = 0; i < productos.length; i++){

            int multip = ((i)*150);
            productos[i] = (500+multip);
        }

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

        Random rand2 = new Random();

        for (int i = 0; i < cantidad.length; i++){
            cantidad[i] = rand2.nextInt(15);
        }

        cantidadProductos(cantidad);
        costoTotal(productos);
    }

    public static void cantidadProductos(int[] cantidad) {
        int productTotal = 0;

        for (int i = 0; i < cantidad.length; i++){
            productTotal = productTotal+cantidad[i];
        }

        System.out.println("El carrito contiene "+productTotal+" productos");
    }

    public static void costoTotal(int[] productos){
        int costoTotal = 0;

        for (int i = 0; i < productos.length; i++){
            costoTotal = costoTotal+productos[i];
        }
        System.out.println("El costo total es de $" +costoTotal);
    }
}
