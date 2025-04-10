/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

/**
 *
 * @author p4prika
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    // default border for the menu items
    Border default_border = BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(46,49,49));
        
    // yellow border for the menu items
    Border yellow_border = BorderFactory.createMatteBorder(1, 0, 1, 0, Color.YELLOW);
    
    javax.swing.JLabel[] menuLabels;
    javax.swing.JPanel[] panels;
    
    public Dashboard() {
        initComponents();
        // center this form
        this.setLocationRelativeTo(null);
        
        // set borders
        // panel logo border
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.lightGray);
        jPanel_logoANDname.setBorder(panelBorder);
        // panel container border
        Border containerBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(46,49,49));
        jPanel_container.setBorder(containerBorder);
        
        // create an array of jlabels
        menuLabels = new javax.swing.JLabel[6];
        // Populate the menuLabels array
        menuLabels[0] = Label_menuItem1;
        menuLabels[1] = Label_menuItem2;
        menuLabels[2] = Label_menuItem3;
        menuLabels[3] = Label_menuItem4;
        menuLabels[4] = Label_menuItem5;
        menuLabels[5] = Label_menuItem6;
        
        /*for (JLabel label : menuLabels) {
            if (label != null) {
                label.setOpaque(true);
            }
        }*/
        
        panels = new javax.swing.JPanel[2];
        
        // Populate the panels array
        panels[0] = jPanel1_dashboard;
        panels[1] = jPanel2_users;
        /*panels[2] = jPanel_products;
        panels[3] = jPanel_settings;
        panels[4] = jPanel_contact;
        panels[5] = jPanel_calendar;
        panels[6] = jPanel_test;*/
        // Oculta todos los paneles menos el dashboard al iniciar
        //showPanel(jPanel1_dashboard);

        // Agrega los listeners para hacer clic en los labels
        addActionToMenuLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_container = new javax.swing.JPanel();
        jPanel_logoANDname = new javax.swing.JPanel();
        jLabel_appLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_menu = new javax.swing.JPanel();
        Label_menuItem1 = new javax.swing.JLabel();
        Label_menuItem2 = new javax.swing.JLabel();
        Label_menuItem3 = new javax.swing.JLabel();
        Label_menuItem4 = new javax.swing.JLabel();
        Label_menuItem5 = new javax.swing.JLabel();
        Label_menuItem6 = new javax.swing.JLabel();
        jPanel1_dashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2_users = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_logoANDname.setBackground(new java.awt.Color(255, 51, 51));

        jLabel_appLogo.setText("LOGO");

        jLabel1.setText("X");

        javax.swing.GroupLayout jPanel_logoANDnameLayout = new javax.swing.GroupLayout(jPanel_logoANDname);
        jPanel_logoANDname.setLayout(jPanel_logoANDnameLayout);
        jPanel_logoANDnameLayout.setHorizontalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_appLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 912, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel_logoANDnameLayout.setVerticalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_appLogo)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_container.add(jPanel_logoANDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1020, 60));

        jPanel_menu.setBackground(new java.awt.Color(51, 51, 51));

        Label_menuItem1.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem1.setText("Dashboard");
        Label_menuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        Label_menuItem2.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem2.setText("Usuarios");

        Label_menuItem3.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem3.setText("Registo de asistentes");

        Label_menuItem4.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem4.setText("Inscripcion de asistentes");

        Label_menuItem5.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem5.setText("Información de los asistentes");

        Label_menuItem6.setForeground(new java.awt.Color(255, 255, 255));
        Label_menuItem6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_menuItem6.setText("Exportar");

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_menuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Label_menuItem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Label_menuItem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Label_menuItem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Label_menuItem5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(Label_menuItem6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(Label_menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPanel_container.add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 690));

        jLabel2.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel1_dashboardLayout = new javax.swing.GroupLayout(jPanel1_dashboard);
        jPanel1_dashboard.setLayout(jPanel1_dashboardLayout);
        jPanel1_dashboardLayout.setHorizontalGroup(
            jPanel1_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_dashboardLayout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(jLabel2)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel1_dashboardLayout.setVerticalGroup(
            jPanel1_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_dashboardLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel2)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jPanel_container.add(jPanel1_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 1020, 630));

        jLabel3.setText("USUARIOS");

        javax.swing.GroupLayout jPanel2_usersLayout = new javax.swing.GroupLayout(jPanel2_users);
        jPanel2_users.setLayout(jPanel2_usersLayout);
        jPanel2_usersLayout.setHorizontalGroup(
            jPanel2_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_usersLayout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(jLabel3)
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel2_usersLayout.setVerticalGroup(
            jPanel2_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_usersLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel3)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        jPanel_container.add(jPanel2_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // create a function to set the label background color
    
    
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        this.dispose();
    }                                         

    /*public void setLabelBackround(javax.swing.JLabel label) {
        for (javax.swing.JLabel menuItem : menuLabels) {
            menuItem.setBackground(new Color(46,49,49));
            menuItem.setForeground(Color.white); 
        }
        label.setBackground(Color.white);
        label.setForeground(Color.blue);
    }*/
    
    public void setLabelBackround(javax.swing.JLabel label) {
    for (javax.swing.JLabel menuItem : menuLabels) {
        menuItem.setOpaque(true); // Asegurarse de que se puede pintar el fondo
        menuItem.setBackground(new Color(51, 51, 51)); // Fondo por defecto
        menuItem.setForeground(Color.WHITE); 
    }
    label.setOpaque(true);
    label.setBackground(Color.WHITE); // Fondo cuando está seleccionado
    label.setForeground(Color.BLUE);  // Texto azul
}
    
    public void showPanel(javax.swing.JPanel panel) {
        for (javax.swing.JPanel pnl : panels) {
            pnl.setVisible(false);
        }
        panel.setVisible(true);
    }
    
    public void addActionToMenuLabels() {
        Component[] components = jPanel_menu.getComponents();

        for (Component component : components) {
            if (component instanceof javax.swing.JLabel label) {

                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setLabelBackround(label);
                        switch (label.getText().trim()) {
                            case "Dashboard" -> showPanel(jPanel1_dashboard);
                            case "Users" -> showPanel(jPanel2_users);
                            /*case "Products":
                            showPanel(jPanel_products); break;
                            case "Settings":
                            showPanel(jPanel_settings); break;
                            case "Contact":
                            showPanel(jPanel_contact); break;
                            case "Calendar":
                            showPanel(jPanel_calendar); break;
                            case "Test":
                            /*case "Products":
                                showPanel(jPanel_products); break;
                            case "Settings":
                                showPanel(jPanel_settings); break;
                            case "Contact":
                                showPanel(jPanel_contact); break;
                            case "Calendar":
                                showPanel(jPanel_calendar); break;
                            case "Test":
                                showPanel(jPanel_test); break;*/
                        }
                    }
                    @Override public void mousePressed(MouseEvent e) {}
                    @Override public void mouseReleased(MouseEvent e) {}
                    @Override public void mouseEntered(MouseEvent e) {
                        label.setBorder(yellow_border);
                    }
                    @Override public void mouseExited(MouseEvent e) {
                        label.setBorder(default_border);
                    }
                });
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_menuItem1;
    private javax.swing.JLabel Label_menuItem2;
    private javax.swing.JLabel Label_menuItem3;
    private javax.swing.JLabel Label_menuItem4;
    private javax.swing.JLabel Label_menuItem5;
    private javax.swing.JLabel Label_menuItem6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_appLogo;
    private javax.swing.JPanel jPanel1_dashboard;
    private javax.swing.JPanel jPanel2_users;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_logoANDname;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
    
}
