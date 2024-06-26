package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import central.Galeria;

public class PanelRegistrarPieza {

    public static void updatePanel(JPanel panel) {
        panel.removeAll();
        
        panel.setLayout(new GridBagLayout());


        JLabel initialLabel = new JLabel("Registrar Pieza");
        
        JLabel label1= new JLabel("Codigo de Registro:");
        JTextField textField1 = new JTextField(20);
        
        JLabel label2= new JLabel("Titulo:");
        JTextField textField2 = new JTextField(20);
        
        JLabel label3= new JLabel("Año:");
        JTextField textField3 = new JTextField(20);
        
        JLabel label4= new JLabel("Lugar:");
        JTextField textField4 = new JTextField(20);
        
        JLabel label5= new JLabel("Autor:");
        JTextField textField5 = new JTextField(20);
        
        JLabel label6= new JLabel("Tipo Pieza:");
        JTextField textField6 = new JTextField(20);
        
        JLabel label7= new JLabel("Exhibición:");
        JTextField textField7 = new JTextField(20);
        
        JLabel label8= new JLabel("Estado:");
        JTextField textField8 = new JTextField(20);
        
        JLabel label9= new JLabel("Valor:");
        JTextField textField9 = new JTextField(20);
        
        JLabel label10= new JLabel("Propietario Actual:");
        JTextField textField10 = new JTextField(20);
        
      
        JButton button = new JButton("Registrar");
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.anchor = GridBagConstraints.CENTER;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(initialLabel, gbc);
        gbc.gridwidth = 1;
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(label1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textField1, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(label2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textField2, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(label3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textField3, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(label4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(textField4, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(label5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(textField5, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(label6, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(textField6, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(label7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(textField7, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        panel.add(label8, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(textField8, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 9;
        panel.add(label9, gbc);

        gbc.gridx = 1;
        gbc.gridy = 9;
        panel.add(textField9, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 10;
        panel.add(label10, gbc);

        gbc.gridx = 1;
        gbc.gridy = 10;
        panel.add(textField10, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        panel.add(button, gbc);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Date fecha = new Date();
            	String codigo = textField1.getText();
            	String titulo = textField2.getText();
            	int anio = Integer.parseInt(textField3.getText());
            	String lugar = textField4.getText();
            	String autor = textField5.getText();
            	String tipo_pieza = textField6.getText();
            	String exhibicion = textField7.getText();
            	String estado = textField8.getText();
            	int valor = Integer.parseInt(textField9.getText());
            	int propietario_actual = Integer.parseInt(textField10.getText());
            	//TODO Terminar
            	//IngresarVideoConsignacion(nombre,identificacion,telefono,correo,login,contraseña,ingreso);
            	
            }
        });

        panel.revalidate();
        panel.repaint();
    }
}

