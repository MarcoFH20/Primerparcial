/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.primerparcialprogra3;

/**
 *
 * @author Marcos
 */
abstract class Persona implements Consultable {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Persona(int id, String nombre, String apellido, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void ConsultarPersona();
}
