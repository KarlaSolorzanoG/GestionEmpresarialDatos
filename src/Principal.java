//Título: Gestor Empresarial
//Autor: Karla Sarahi Solórzano Galván
//Grupo 5A
//Fecha de creación 22 de febrero del 2024
//Ultima modificación: 22 de febrero del 2024

import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.datos.DatosEmpresariales;

import gestor.empresarial.datos.*;
import gestor.empresarial.contrato.*;
import gestor.interfaz.*;
import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args){
        //DatosEmpresariales ob2 = new DatosEmpresariales(2,"B","C","D");
        //Cargos ca1;
        JFrame frame = new JFrame("Inicio de sesion"); //crea una ventana nueva, con un titulo
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize(); //obtiene las dimensiones ancho y alto de un monitor
        int x = (pantalla.width)/2; //calculo el centro del largo del monitor
        int y = (pantalla.height) / 2; //calcula el centro del alto de monitor

        frame.setContentPane(new Login().getPanelMain()); //agrega el pane de login al frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.getSize(600,400); //Da el tañano de la ventana
        frame.setLocation(x,y);
        frame.setVisible(true);
    }
}


