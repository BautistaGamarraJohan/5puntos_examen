/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase que representa un Lenguaje de Programación
 * Esta clase actúa como el Modelo en el patrón MVC
 */
public class LenguajeProgramacion {
    // Atributos de la clase
    private int anioCreacion;           // Año en que se creó el lenguaje
    private String caracteristicaPrincipal; // Característica más destacada del lenguaje
    private String nombre;              // Nombre del lenguaje de programación
    private String utilizacion;         // Principal uso o aplicación del lenguaje
    
    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param anioCreacion Año de creación del lenguaje
     * @param caracteristicaPrincipal Característica principal del lenguaje
     * @param nombre Nombre del lenguaje
     * @param utilizacion Uso principal del lenguaje
     */
    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, 
                               String nombre, String utilizacion) {
        this.anioCreacion = anioCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }
    
    // Métodos getter - Permiten obtener los valores de los atributos
    public int getAnioCreacion() {
        return anioCreacion;
    }
    
    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getUtilizacion() {
        return utilizacion;
    }
    
    // Métodos setter - Permiten modificar los valores de los atributos
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    
    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }
    
    /**
     * Método que devuelve una representación en String del objeto
     * @return String con todos los datos del lenguaje de programación
     */
    @Override
    public String toString() {
        return "Lenguaje: " + nombre + 
               "\nAño de creacion: " + anioCreacion +
               "\nCaracterística principal: " + caracteristicaPrincipal +
               "\nUtilizacion: " + utilizacion;
    }
}
