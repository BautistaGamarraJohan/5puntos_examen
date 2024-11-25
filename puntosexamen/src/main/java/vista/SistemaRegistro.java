/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.GestionLenguaje;
import java.util.Scanner;
import modelo.LenguajeProgramacion;

/**
 * Clase que maneja la interacción con el usuario
 * Esta clase actúa como la Vista en el patrón MVC
 */
public class SistemaRegistro {
    private static final GestionLenguaje gestor = new GestionLenguaje(); // Instancia del controlador
    private static final Scanner scanner = new Scanner(System.in);       // Scanner para leer entrada del usuario
    
    /**
     * Método principal que inicia el programa
     * @param args
     */
    public static void main(String[] args) {
        menu();
    }
    
    /**
     * Método que muestra y gestiona el menú principal
     */
    private static void menu() {
        int opcion;
        do {
            // Mostrar opciones del menú
            System.out.println("\n=== SISTEMA DE REGISTRO DE LENGUAJES DE PROGRAMACION ===");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Mostrar todos los lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            
            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            // Procesar la opción seleccionada
            switch (opcion) {
                case 1 -> agregarLenguaje();
                case 2 -> buscarLenguaje();
                case 3 -> eliminarLenguaje();
                case 4 -> gestor.imprimirLenguajes();
                case 5 -> System.out.println("¡Gracias por usar el sistema!");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
    
    /**
     * Método que maneja la entrada de datos para agregar un nuevo lenguaje
     */
    private static void agregarLenguaje() {
        System.out.println("\n=== AGREGAR NUEVO LENGUAJE ===");
        
        // Solicitar datos al usuario
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Año de creación: ");
        int anioCreacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.print("Característica principal: ");
        String caracteristicaPrincipal = scanner.nextLine();
        
        System.out.print("Utilización: ");
        String utilizacion = scanner.nextLine();
        
        // Agregar el lenguaje usando el controlador
        gestor.agregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        System.out.println("Lenguaje agregado exitosamente");
    }
    
    /**
     * Método que maneja la búsqueda de un lenguaje
     */
    private static void buscarLenguaje() {
        System.out.print("\nIngrese el nombre del lenguaje a buscar: ");
        String nombre = scanner.nextLine();
        
        // Buscar el lenguaje usando el controlador
        LenguajeProgramacion lenguaje = gestor.buscarLenguaje(nombre);
        if (lenguaje != null) {
            System.out.println("\nLenguaje encontrado:");
            System.out.println(lenguaje);
        } else {
            System.out.println("Lenguaje no encontrado");
        }
    }
    
    /**
     * Método que maneja la eliminación de un lenguaje
     */
    private static void eliminarLenguaje() {
        System.out.print("\nIngrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();
        
        // Eliminar el lenguaje usando el controlador
        if (gestor.eliminarLenguaje(nombre)) {
            System.out.println("Lenguaje eliminado exitosamente");
        } else {
            System.out.println("Lenguaje no encontrado");
        }
    }
}