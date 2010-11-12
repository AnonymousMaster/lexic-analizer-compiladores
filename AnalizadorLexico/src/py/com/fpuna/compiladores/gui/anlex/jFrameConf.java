/*
 * jFrameConf.java
 *
 * Created on 16 de noviembre de 2008, 07:19 PM
 */

package py.com.fpuna.compiladores.gui.anlex;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.load.Persister;

/**
 *
 * @author  Cristhian Parra ({@link cdparra@gmail.com})
 */
public class jFrameConf extends javax.swing.JFrame {

    private boolean cancelled = true; 
    private String gvPaht = "";
    private Configuracion conf;
    private Configuracion mainConf;
    
    /** Creates new form jFrameConf */
    public jFrameConf(Configuracion mainConf) throws Exception {
        this.mainConf = mainConf;
        Serializer serializer = new Persister();
        File source = new File("conf.xml");

        this.conf = serializer.read(Configuracion.class, source);
        
        initComponents();
    }

    private File getInicio() {
        String initDir = this.conf.getDotPath(); 
        File finitDir = new File(initDir);
        
        if (!finitDir.isDirectory()) {
            initDir = ".";
            finitDir = new File(initDir);
        }
        return finitDir;
    }

    
    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getGvPaht() {
        return gvPaht;
    }

    public void setGvPaht(String gvPaht) {
        this.gvPaht = gvPaht;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooser = new javax.swing.JFileChooser(this.getInicio());
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextGraphvizPath = new javax.swing.JTextField(this.conf.getDotPath());
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextGraphvizVacio = new javax.swing.JTextField(this.conf.getEmptySymbol());
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextGraphvizTempDir = new javax.swing.JTextField(this.conf.getImgdir());
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AfGen - Configuraciones");
        setForeground(java.awt.Color.white);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("GraphViz Path");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Alien Encounters", 1, 36));
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_afgen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("Etiqueta Vacía");

        jLabel4.setFont(new java.awt.Font("As seen on TV", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Edite las Variables de configuración");

        jLabel5.setText("Directorio de Imágenes");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/fileopen.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/fileopen.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextGraphvizTempDir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextGraphvizPath, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextGraphvizVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextGraphvizPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextGraphvizTempDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextGraphvizVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setCancelled(true);
    this.setEnabled(false);
    this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    Serializer serializer = new Persister();
    this.setGvPaht(jTextGraphvizPath.getText());
    
    this.conf = new Configuracion(jTextGraphvizPath.getText(), 1);
    this.conf.setEmptySymbol(this.jTextGraphvizVacio.getText());
    this.conf.setImgdir(this.jTextGraphvizTempDir.getText());
    
    File result = new File("conf.xml");
    try {
        serializer.write(this.conf, result);
    } catch (Exception ex) {
        Logger.getLogger(jFrameConf.class.getName()).log(Level.SEVERE, null, ex);
    }

    GraphViz.setDir(this.conf.getImgdir());
    GraphViz.setDot(this.conf.getDotPath()+File.separator+"dot");
    //CONSTANS.setVacio(this.conf.getEmptySymbol());
    
    this.mainConf.setDotPath(this.conf.getDotPath());
    this.mainConf.setEmptySymbol(this.conf.getEmptySymbol());
    this.mainConf.setImgdir(this.conf.getImgdir());
    
    this.setCancelled(false);
    this.setEnabled(false);
    this.setVisible(false);
    
   
}//GEN-LAST:event_jButton1ActionPerformed

private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    int status = this.chooser.showOpenDialog(null);				
    if (status == JFileChooser.APPROVE_OPTION) {
        File selectedFile = chooser.getSelectedFile();
        this.conf.setDotPath(selectedFile.getAbsolutePath());
        this.jTextGraphvizPath.setText(this.conf.getDotPath());
    } else if (status == JFileChooser.CANCEL_OPTION) {
        // nothing
    }    
}//GEN-LAST:event_jLabel7MouseClicked

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    int status = this.chooser.showOpenDialog(null);
    if (status == JFileChooser.APPROVE_OPTION) {
        File selectedFile = chooser.getSelectedFile();
        this.conf.setImgdir(selectedFile.getAbsolutePath());
        this.jTextGraphvizTempDir.setText(this.conf.getImgdir());
    } else if (status == JFileChooser.CANCEL_OPTION) {
        // nothing
    }
}//GEN-LAST:event_jLabel6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextGraphvizPath;
    private javax.swing.JTextField jTextGraphvizTempDir;
    private javax.swing.JTextField jTextGraphvizVacio;
    // End of variables declaration//GEN-END:variables
}
