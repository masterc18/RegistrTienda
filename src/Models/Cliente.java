/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author carlo
 */
public class Cliente extends Usuario {

    private String NumeroTarjeta;
    private String PinTarjeta;

    public Cliente(String NumeroTarjeta, String PinTarjeta, String nombre, String Apellido1, String Apellido2, String nombreUsuario, String correo, String password, Genero sex) {
        super(nombre, Apellido1, Apellido2, nombreUsuario, correo, password, sex);
        this.NumeroTarjeta = NumeroTarjeta;
        this.PinTarjeta = PinTarjeta;
    }

    public Cliente() {
        NumeroTarjeta = "";
        PinTarjeta = "";

    }

    public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }

    public String getPinTarjeta() {
        return PinTarjeta;
    }

    public void setPinTarjeta(String PinTarjeta) {
        this.PinTarjeta = PinTarjeta;
    }

}
