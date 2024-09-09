/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTXT;

import Models.Cliente;
import Models.Genero;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class CCliente {

    static String nameTxt = "Clientes.txt";

    public void addTxt(ArrayList<Cliente> listClien) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(nameTxt);
            BufferedWriter buff = new BufferedWriter(fw);
            for (Cliente cli : listClien) {
                buff.write(cli.getRol()+","+cli.getNombre() + "," + cli.getApellido1() + "," + cli.getApellido2() + ","
                        + cli.getNombreUsuario() + "," + cli.getCorreo() + "," + cli.getPassword() + "," + cli.getSex() +"\n");
            }
            buff.close();
            System.out.println("Cliente guardado con exito");
        } catch (Exception e) {
            System.out.println("Error al guardar cliente");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public ArrayList getClienTxt() {
        File file = new File(nameTxt);
        ArrayList<Cliente> ListaCleinte = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimiter = new Scanner(linea);
                Cliente c = new Cliente();
                c.setRol(2);
                delimiter.useDelimiter("\\s*,\\s*");
                c.setNombre(String.valueOf(delimiter.next()));
                c.setApellido1(String.valueOf(delimiter.next()));
                c.setApellido2(String.valueOf(delimiter.next()));
                c.setNombreUsuario(String.valueOf(delimiter.next()));
                c.setCorreo(String.valueOf(delimiter.next()));
                c.setPassword(String.valueOf(delimiter.next()));
                c.setSex(Genero.valueOf(delimiter.next()));
                ListaCleinte.add(c);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al traer clientes");
        }
        return ListaCleinte;
    }
}
