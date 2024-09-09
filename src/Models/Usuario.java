/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author carlo
 */
public abstract class Usuario {

    protected String nombre;
    protected String Apellido1;
    protected String Apellido2;
    protected String nombreUsuario;
    protected String correo;
    protected String password;
    protected Genero sex;
    protected int rol;

    public Usuario(String nombre, String Apellido1, String Apellido2, String nombreUsuario, String correo, String password, Genero sex, int rol) {
        this.nombre = nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.password = password;
        this.sex = sex;
        this.rol = rol;
    }

    public Usuario() {
        nombre = "";
        Apellido1 = "";
        Apellido2 = "";
        nombreUsuario = "";
        correo = "";
        password = "";
        sex = null;
        rol = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Genero getSex() {
        return sex;
    }

    public void setSex(Genero sex) {
        this.sex = sex;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

}
