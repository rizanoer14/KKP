package gui;

import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class slidersudirman extends javax.swing.JFrame {

    public slidersudirman() {
        initComponents();
        this.setLocationRelativeTo(null);
        show(position);
    }
    int position=0;
public String[] takeimage()
{
    File f=new File(getClass().getResource("/image_sudirman").getFile());
    String[] Images=f.list();
    return Images;
}

public void show(int index)
{
    String[] Images=takeimage();
    String img=Images[index];
    ImageIcon icon=new ImageIcon(getClass().getResource("/image_sudirman/"+img));
    Image image=icon.getImage().getScaledInstance(slide.getWidth(), slide.getHeight(), Image.SCALE_SMOOTH);
    slide.setIcon(new ImageIcon(image));
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        close = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        slide = new javax.swing.JLabel();
        dasar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icancel.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 40));

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 80));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 60, 50));
        getContentPane().add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 640, 360));

        dasar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        getContentPane().add(dasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
      new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slidersudirman.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.slide.getX();
        
        if(p>-1)
        {
          Animacion.Animacion.mover_izquierda(900, 200, 1, 2, slide);
        }
        position=position+1;
        if(position>=takeimage().length)
        {
            position=takeimage().length-1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
       new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(slidersudirman.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.slide.getX();
        
        if(p>-1)
        {
          Animacion.Animacion.mover_izquierda(900, 200, 1, 2, slide);
        }
          position=position-1;
        if(position<0)
        {
            position=0;
        }
        show(position);
    }//GEN-LAST:event_previousMousePressed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
       dispose();
    }//GEN-LAST:event_closeMousePressed

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
            java.util.logging.Logger.getLogger(slidersudirman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slidersudirman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slidersudirman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slidersudirman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slidersudirman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dasar;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    private javax.swing.JLabel slide;
    // End of variables declaration//GEN-END:variables
}
