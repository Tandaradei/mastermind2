/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind2;

import java.awt.event.WindowEvent;

/**
 *
 * @author laurin.agostini
 */
public class HelpWindow extends javax.swing.JFrame {

    /**
     * Creates new form HelpPage
     */
    public HelpWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help - Mastermind");

        jTextPane1.setEditable(false);
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextPane1.setText(" <h1> Help </h1> <hr> <h2> General </h2> <ul>         <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>         <li>Aliquam tincidunt mauris eu risus.</li>         <li>Vestibulum auctor dapibus neque.</li>  </ul> \t  <hr> <h2> Rules </h2> <ul>         <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>         <li>Aliquam tincidunt mauris eu risus.</li>         <li>Vestibulum auctor dapibus neque.</li>  </ul> \t  <hr> <h2> Play as Client </h2> <ul>         <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>         <li>Aliquam tincidunt mauris eu risus.</li>         <li>Vestibulum auctor dapibus neque.</li>  </ul> \t  <hr> <h2> Host a Server </h2> <ul>         <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>         <li>Aliquam tincidunt mauris eu risus.</li>         <li>Vestibulum auctor dapibus neque.</li>  </ul> \t       ");
        jScrollPane1.setViewportView(jTextPane1);

        jMenu1.setText("Exit");
        jMenu1.setToolTipText("Exit the help page");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitClicked
      System.out.println("Help Window Exit clicked");
      this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jMenuExitClicked

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpWindow().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
