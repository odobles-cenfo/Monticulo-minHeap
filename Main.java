package Monticulo_MinHeap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Monticulo m = new Monticulo();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar raíz");
            System.out.println("3. Mostrar raíz");
            System.out.println("4. Heapify!");
            System.out.println("5. Mostrar montículo");
            System.out.println("6. Limpiar montículo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el valor a insertar: ");
                        m.insert(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Elemento eliminado: " + m.eliminarMin());
                        break;
                    case 3:
                        System.out.println("El mínimo actual es: " + m.peek());
                        break;
                    case 4:
                        System.out.println("Añadiendo 50, 10, 30, 5, 1...");
                        System.out.println("ATENCIÓN: El hapify eliminará los elementos previamente insterdos manualmente");
                        int[] datos = {50, 10, 30, 5, 1};
                        m.cargarDatos(datos);
                        break;
                    case 5:
                        m.mostrar();
                        break;
                    case 6:
                        System.out.println("Montículo limpiado");
                        m.limpiar();
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // Limpiar el buffer
            }
        } while (opcion != 7);
        sc.close();
    }
}


