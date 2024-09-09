/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTXT;

import Models.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class CEmpleado {

    static String nameTxt = "Empleado.txt";

    public void addTxt(ArrayList<Empleado> listE) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(nameTxt);
            BufferedWriter buff = new BufferedWriter(fw);
            for (Empleado emp : listE) {
                buff.write(emp.getRol() + "," + emp.getId_Empleado() + "," + emp.getNombre() + "," + emp.getApellido1() + "," + emp.getApellido2()
                        + "," + emp.getNombreUsuario() + "," + emp.getCorreo() + "," + emp.getPassword() + "," + emp.getSex() + "\n");
            }
            buff.close();
            System.out.println("Empleado agregado correctamente");
        } catch (Exception e) {
            System.out.println("Error al guardar empleado");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrai");
                }
            }
        }
    }

    public ArrayList getDataTxt() {
        File file = new File(nameTxt);
        ArrayList<Empleado> listEm = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimiter = new Scanner(linea);
                delimiter.useDelimiter("\\s*,\\s*");
                Empleado e = new Empleado();
                e.setRol(1);
                e.setId_Empleado(String.valueOf(delimiter.next()));
                e.setNombre(String.valueOf(delimiter.next()));
                e.setApellido1(String.valueOf(delimiter.next()));
                e.setApellido2(String.valueOf(delimiter.next()));
                e.setNombreUsuario(String.valueOf(delimiter.next()));
                e.setCorreo(String.valueOf(delimiter.next()));
                e.setPassword(String.valueOf(delimiter.next()));
                e.setSex(Genero.valueOf(delimiter.next()));

                listEm.add(e);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al traer empleados");
        }
        return listEm;
    }
}
