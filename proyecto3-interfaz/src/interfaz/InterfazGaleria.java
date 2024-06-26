package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import central.Galeria;

@SuppressWarnings("serial")
public class InterfazGaleria extends JFrame {

	private Galeria mundoGaleria;
	private static String clasePasarela;
	private static String archivoDatos;
	
	private JButton btnIngreso;
    private JLabel labelBienv;

    public InterfazGaleria(String clasePasarela, String archivoDatos) {
    	mundoGaleria = new Galeria(clasePasarela, archivoDatos);
        initComponents();
    }
                     
    private void initComponents() {

        labelBienv = new JLabel();
        btnIngreso = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBienv.setText("BIENVENIDO A LA GALERIA DE ARTE");

        btnIngreso.setText("Ingresar");
        btnIngreso.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(labelBienv)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnIngreso, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(labelBienv)
                .addGap(72, 72, 72)
                .addComponent(btnIngreso)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }                   

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
    	dispose();
		Menu1 ingreso = new Menu1(mundoGaleria);
		ingreso.setVisible(true);
    }                                        

 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGaleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGaleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGaleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGaleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGaleria(clasePasarela, archivoDatos).setVisible(true);
            }
        });
    }

                                      
}
