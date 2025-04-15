/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

/**
 *
 * @author p4prika
 */
public class AnadirAsistente extends javax.swing.JFrame {

    /**
     * Creates new form AnadirAsistente
     */
    public AnadirAsistente() {
        initComponents();
        // Evitar que al presionar la X se cierre
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        // Opcional: agregar un WindowListener para controlar el cierre
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Aquí no hará nada, para que el usuario no pueda cerrarlo con la X
                // o puedes mostrar un mensaje si quieres.
                System.out.println("La ventana no se puede cerrar desde la X.");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1_registro_anadir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_nombre_registro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1_1er_apellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_2do_apellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1_edad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField1_tel_contacto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1_tel_emergencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1_direccion = new javax.swing.JTextField();
        jButton1_registrar_usuario = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3_registro_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel8.setText("Nombre(s)");

        jLabel9.setText("Primer Apellido");

        jLabel10.setText("Segundo Apellido");

        jTextField1_2do_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_2do_apellidoActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula");

        jLabel11.setText("Edad");

        jLabel13.setText("Telefono de contacto");

        jLabel12.setText("Genero");

        jLabel15.setText("Telefono de emergencia");

        jLabel14.setText("Direccion");

        jTextField1_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_direccionActionPerformed(evt);
            }
        });

        jButton1_registrar_usuario.setBackground(new java.awt.Color(255, 51, 51));
        jButton1_registrar_usuario.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton1_registrar_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_registrar_usuario.setText("Registrar");
        jButton1_registrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registrar_usuarioActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Femenino");

        jRadioButton3.setText("Otro");

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel4.setText("Ingrese los datos del asistente");

        jButton3_registro_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButton3_registro_cancelar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton3_registro_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_registro_cancelar.setText("Cancelar");
        jButton3_registro_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_registro_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_registro_anadirLayout = new javax.swing.GroupLayout(jPanel1_registro_anadir);
        jPanel1_registro_anadir.setLayout(jPanel1_registro_anadirLayout);
        jPanel1_registro_anadirLayout.setHorizontalGroup(
            jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3_registro_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1_registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1_1er_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1_2do_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel11)
                            .addGap(272, 272, 272)
                            .addComponent(jLabel13)
                            .addGap(202, 202, 202)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jTextField1_tel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jTextField1_tel_emergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel12))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jRadioButton1)
                            .addGap(110, 110, 110)
                            .addComponent(jRadioButton2)
                            .addGap(118, 118, 118)
                            .addComponent(jRadioButton3))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel14))
                        .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1_registro_anadirLayout.setVerticalGroup(
            jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_registro_anadirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jTextField1_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jTextField1_1er_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jTextField1_2do_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_tel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_tel_emergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jTextField1_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1_registro_anadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_registro_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1_registro_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1_registro_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_2do_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_2do_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_2do_apellidoActionPerformed

    private void jTextField1_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_direccionActionPerformed

    private void jButton1_registrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrar_usuarioActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        // Aquí iría tu lógica de registro
    // Suponiendo que ya registraste al usuario correctamente...

        javax.swing.JOptionPane.showMessageDialog(null, "¡Asistente registrado correctamente!", 
                                  "Registro Exitoso", 
                                  javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1_registrar_usuarioActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
     
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3_registro_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_registro_cancelarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas cancelar la operacion?",
                "Cancelar",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            System.out.println("Registro cancelado. Redirigiendo al dashboard...");
            //new LoginForm().setVisible(true);
            this.dispose();
            // Aquí puedes llamar a tu método para cerrar sesión o abrir la pantalla de login
        } else {
            System.out.println("Operación cancelada.");
        }
    }//GEN-LAST:event_jButton3_registro_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnadirAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnadirAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnadirAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnadirAsistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnadirAsistente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_registrar_usuario;
    private javax.swing.JButton jButton3_registro_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1_registro_anadir;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1_1er_apellido;
    private javax.swing.JTextField jTextField1_2do_apellido;
    private javax.swing.JTextField jTextField1_direccion;
    private javax.swing.JTextField jTextField1_edad;
    private javax.swing.JTextField jTextField1_nombre_registro;
    private javax.swing.JTextField jTextField1_tel_contacto;
    private javax.swing.JTextField jTextField1_tel_emergencia;
    // End of variables declaration//GEN-END:variables
}
