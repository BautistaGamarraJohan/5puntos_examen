/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.LenguajeProgramacion;

/**
 * Clase controladora que gestiona las operaciones con los lenguajes de programación
 * Esta clase actúa como el Controlador en el patrón MVC
 */
public class GestionLenguaje {
    // Atributos de la clase
    private LenguajeProgramacion[] arregloLenguajes;  // Array para almacenar los lenguajes
    private int contadorLenguajes;                    // Contador de lenguajes almacenados
    private static final int FACTOR_CRECIMIENTO = 2;  // Factor para aumentar el tamaño del array
    
    /**
     * Constructor que inicializa el array de lenguajes
     */
    public GestionLenguaje() {
        arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
        contadorLenguajes = 0;
    }
    
    /**
     * Método para agregar un nuevo lenguaje al array
     * Si el array está lleno, aumenta su tamaño automáticamente
     * @param anioCreacion
     * @param caracteristicaPrincipal
     * @param nombre
     * @param utilizacion
     */
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, 
                               String nombre, String utilizacion) {
        // Verificar si el array está lleno
        if (contadorLenguajes == arregloLenguajes.length) {
            // Crear un nuevo array más grande
            LenguajeProgramacion[] temp;
            temp = new LenguajeProgramacion[arregloLenguajes.length * FACTOR_CRECIMIENTO];
            // Copiar los elementos al nuevo array
            System.arraycopy(arregloLenguajes, 0, temp, 0, arregloLenguajes.length);
            arregloLenguajes = temp;
        }
        
        // Crear y agregar el nuevo lenguaje
        arregloLenguajes[contadorLenguajes] = new LenguajeProgramacion(anioCreacion, 
            caracteristicaPrincipal, nombre, utilizacion);
        contadorLenguajes++;
    }
    
    /**
     * Método para buscar un lenguaje por su nombre
     * @param nombre Nombre del lenguaje a buscar
     * @return El lenguaje encontrado o null si no existe
     */
    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }
    
    /**
     * Método para eliminar un lenguaje por su nombre
     * @param nombre Nombre del lenguaje a eliminar
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                // Mover todos los elementos una posición hacia atrás
                System.arraycopy(arregloLenguajes, i + 1, arregloLenguajes, i, 
                               contadorLenguajes - i - 1);
                contadorLenguajes--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Método que devuelve un array con todos los lenguajes almacenados
     * @return Array de lenguajes de programación
     */
    public LenguajeProgramacion[] getArregloLenguajes() {
        LenguajeProgramacion[] resultado = new LenguajeProgramacion[contadorLenguajes];
        System.arraycopy(arregloLenguajes, 0, resultado, 0, contadorLenguajes);
        return resultado;
    }
    
    /**
     * Método que imprime todos los lenguajes almacenados
     */
    public void imprimirLenguajes() {
        for (int i = 0; i < contadorLenguajes; i++) {
            System.out.println("\n=== Lenguaje " + (i + 1) + " ===");
            System.out.println(arregloLenguajes[i]);
        }
    }
}
