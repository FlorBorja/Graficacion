/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author lili9
 */
public class Interfaz extends javax.swing.JFrame {
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setSize(600, 400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ArchivoNuevo = new javax.swing.JMenuItem();
        ArchivoAbrir = new javax.swing.JMenuItem();
        ArchivoGuardar = new javax.swing.JMenuItem();
        MenuFormas = new javax.swing.JMenu();
        FormaLinea = new javax.swing.JMenuItem();
        FormaRectang = new javax.swing.JMenuItem();
        FormaOvalo = new javax.swing.JMenuItem();
        FormaTriang = new javax.swing.JMenuItem();
        MenuTexto = new javax.swing.JMenu();
        TextoAgregar = new javax.swing.JMenuItem();
        SubMFuente = new javax.swing.JMenu();
        FuenteTipo = new javax.swing.JMenu();
        FuenteTam = new javax.swing.JMenu();
        MenuImagen = new javax.swing.JMenu();
        ImagenAgrega = new javax.swing.JMenuItem();
        MenuOpciones = new javax.swing.JMenu();
        OpcGrosor = new javax.swing.JMenu();
        OpcColor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor 2D");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 379));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        BtnBorrar.setText("Borrar");
        getContentPane().add(BtnBorrar, java.awt.BorderLayout.SOUTH);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        MenuArchivo.setText("Archivo");

        ArchivoNuevo.setText("Nuevo");
        MenuArchivo.add(ArchivoNuevo);

        ArchivoAbrir.setText("Abrir");
        MenuArchivo.add(ArchivoAbrir);

        ArchivoGuardar.setText("Guardar");
        MenuArchivo.add(ArchivoGuardar);

        jMenuBar1.add(MenuArchivo);

        MenuFormas.setText("Formas");

        FormaLinea.setText("Linea");
        MenuFormas.add(FormaLinea);

        FormaRectang.setText("Rectangulo");
        MenuFormas.add(FormaRectang);

        FormaOvalo.setText("Ovalo");
        MenuFormas.add(FormaOvalo);

        FormaTriang.setText("Triangulo");
        MenuFormas.add(FormaTriang);

        jMenuBar1.add(MenuFormas);

        MenuTexto.setText("Texto");

        TextoAgregar.setText("Agregar texto");
        MenuTexto.add(TextoAgregar);

        SubMFuente.setText("Fuente");

        FuenteTipo.setText("Tipo");
        SubMFuente.add(FuenteTipo);

        FuenteTam.setText("Tamano");
        SubMFuente.add(FuenteTam);

        MenuTexto.add(SubMFuente);

        jMenuBar1.add(MenuTexto);

        MenuImagen.setText("Imagen");

        ImagenAgrega.setText("Agregar imagen");
        MenuImagen.add(ImagenAgrega);

        jMenuBar1.add(MenuImagen);

        MenuOpciones.setText("Opciones");

        OpcGrosor.setText("Grosor de linea");
        MenuOpciones.add(OpcGrosor);

        OpcColor.setText("Color");
        MenuOpciones.add(OpcColor);

        jMenuBar1.add(MenuOpciones);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ArchivoAbrir;
    private javax.swing.JMenuItem ArchivoGuardar;
    private javax.swing.JMenuItem ArchivoNuevo;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JMenuItem FormaLinea;
    private javax.swing.JMenuItem FormaOvalo;
    private javax.swing.JMenuItem FormaRectang;
    private javax.swing.JMenuItem FormaTriang;
    private javax.swing.JMenu FuenteTam;
    private javax.swing.JMenu FuenteTipo;
    private javax.swing.JMenuItem ImagenAgrega;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuFormas;
    private javax.swing.JMenu MenuImagen;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JMenu MenuTexto;
    private javax.swing.JMenuItem OpcColor;
    private javax.swing.JMenu OpcGrosor;
    private javax.swing.JMenu SubMFuente;
    private javax.swing.JMenuItem TextoAgregar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 

}


