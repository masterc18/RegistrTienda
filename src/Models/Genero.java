/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Models;

/**
 *
 * @author carlo
 */
public enum Genero {
    Masculino, Femenino;

    public static Genero getMasculino() {
        return Masculino;
    }


    public static Genero getFemenino() {
        return Femenino;
    }

    public static Object valueOf(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
