package gestor.interfaz;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {
    private JButton btnGuardar;
    private JPanel panel1;
    private JButton abrirButton;
    private JButton cancelarButton;
    private JButton reservarButton;

    public Login(){
        btnGuardar.addActionListener(this); //this en esa sentido es la clase
        abrirButton.addActionListener(this);
        cancelarButton.addActionListener(this);
        reservarButton.addActionListener(this);
    }

    @Override
    public void ActionPerformed(ActionEvent e){
        if(e.getSource() == btnGuardar){
            JOptionPane.showConfirmDialog("Hola mundo");
        }
    }
}
