/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author carlo
 */
public class Empleado extends Usuario {
    private String id_Empleado;

    public Empleado(String id_Empleado, String nombre, String Apellido1, String Apellido2, String nombreUsuario, String correo, String password, Genero sex) {
        super(nombre, Apellido1, Apellido2, nombreUsuario, correo, password, sex);
        this.id_Empleado = id_Empleado;
    }
    
    public Empleado(){
        id_Empleado = "";
    }

    public String getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }
    
    
}
