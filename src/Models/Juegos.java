/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author carlo
 */
public class Juegos {

    private int id_Juego;
    private String nombreG;
    private Double precio;
    private int stock;
    private String consolasDisponibles;
    private int Status; //1. Disponible. 2.Proximamente

    public Juegos(int id_Juego, String nombreG, Double precio, int stock, String consolasDisponibles, int Status) {
        this.id_Juego = id_Juego;
        this.nombreG = nombreG;
        this.precio = precio;
        this.stock = stock;
        this.consolasDisponibles = consolasDisponibles;
        this.Status = Status;
    }

    public Juegos() {
        id_Juego = 0;
        nombreG = "";
        precio = 0.0;
        stock = 0;
        consolasDisponibles = "";
        Status = 0;
    }

    public int getId_Juego() {
        return id_Juego;
    }

    public void setId_Juego(int id_Juego) {
        this.id_Juego = id_Juego;
    }

    public String getNombreG() {
        return nombreG;
    }

    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getConsolasDisponibles() {
        return consolasDisponibles;
    }

    public void setConsolasDisponibles(String consolasDisponibles) {
        this.consolasDisponibles = consolasDisponibles;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

}
