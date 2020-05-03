
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class FondoMenuPrincipal extends javax.swing.JPanel {

    public FondoMenuPrincipal() {
        initComponents();
    }

      @Override
        public void paintComponent(Graphics g) {
            
            Dimension dimension = this.getSize();
            
            ImageIcon icon = new ImageIcon(getClass().getResource("/Img/fondoapp-01.png"));
            
            g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
            
            setOpaque(false);
            
            super.paintComponent(g);
            
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
