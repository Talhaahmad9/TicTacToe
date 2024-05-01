/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author Talha
 */
public class TicTacToeFrame extends javax.swing.JFrame {
    public static int turn = 1;
    
        public void ChangeColor(JButton clickedButton) {
        // Determine the color based on the current turn
        Color color;
        if (turn == 1) {
            color = Color.red;
        } else {
            color = Color.yellow;
        }

        // Check if the clicked button is not already colored
        if (!clickedButton.getBackground().equals(Color.red) && !clickedButton.getBackground().equals(Color.yellow)) {
            // Change the background color of the clicked button to the determined color
            InitializeButtons();
            clickedButton.setBackground(color);
            CheckWin();
            SwitchTurn();
        }
    }
    public void SwitchTurn(){
        if(turn == 1){
            turn = 2;
            Turn.setText("Player 2 turn");
        }else{
            turn = 1;
            Turn.setText("Player 1 turn");
        }
    }
    
    public void setWinLabel(int player) {
    WinLabel.setText("Player " + player + " wins!!");
}

public boolean CheckWin(){
    Color color;
    if(turn == 1){
        color = Color.red;
    }else{
        color = Color.yellow;
    }

    // Check for vertical wins
    if((b1.getBackground().equals(color) && b4.getBackground().equals(color) && b7.getBackground().equals(color))
       || (b2.getBackground().equals(color) && b5.getBackground().equals(color) && b8.getBackground().equals(color))
       || (b3.getBackground().equals(color) && b6.getBackground().equals(color) && b9.getBackground().equals(color))){
        setWinLabel(turn);
        shouldReset = true;
        startTimer();
        return true;
        
    }

    // Check for horizontal wins
    if((b1.getBackground().equals(color) && b2.getBackground().equals(color) && b3.getBackground().equals(color))
       || (b4.getBackground().equals(color) && b5.getBackground().equals(color) && b6.getBackground().equals(color))
       || (b7.getBackground().equals(color) && b8.getBackground().equals(color) && b9.getBackground().equals(color))){
        setWinLabel(turn);
        shouldReset = true;
        startTimer();
        return true;
        
    }

    // Check for diagonal wins
    if((b1.getBackground().equals(color) && b5.getBackground().equals(color) && b9.getBackground().equals(color))
       || (b3.getBackground().equals(color) && b5.getBackground().equals(color) && b7.getBackground().equals(color))){
        setWinLabel(turn);
        shouldReset = true;
        startTimer();
        return true;
        
    }

    // Check for a draw
    if(isDraw()){
        WinLabel.setText("Draw!!");
        shouldReset = true;
       startTimer();
       return true;
    }

    return false;
}
JButton[][] button = new JButton[3][3];
public void InitializeButtons(){
    button[0][0] = b1; button[0][1] = b2; button[0][2] = b3;
    button[1][0] = b4; button[1][1] = b5; button[1][2] = b6;
    button[2][0] = b7; button[2][1] = b8; button[2][2] = b9;
}


public boolean isDraw(){
    for(int row = 0; row < 3; row++){
        for(int col = 0; col < 3; col++){
            if(!button[row][col].getBackground().equals(Color.red) &&
                 !button[row][col].getBackground().equals(Color.yellow)){
                return false;
            }
        }
    }
    
    
    return true; 
}



public boolean shouldReset = false;
    public void startTimer() {
        if(shouldReset) {
            Timer timer = new Timer(1500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resetGame();
                    shouldReset = false;
                    
                }
            });
            timer.setRepeats(false); // Set to false to run only once
            timer.start();
        }
    }
public void resetGame(){
    b1.setBackground(Color.LIGHT_GRAY);
    b2.setBackground(Color.LIGHT_GRAY);
    b3.setBackground(Color.LIGHT_GRAY);
    b4.setBackground(Color.LIGHT_GRAY);
    b5.setBackground(Color.LIGHT_GRAY);
    b6.setBackground(Color.LIGHT_GRAY);
    b7.setBackground(Color.LIGHT_GRAY);
    b8.setBackground(Color.LIGHT_GRAY);
    b9.setBackground(Color.LIGHT_GRAY);
    turn = 1;
    WinLabel.setText("");
}



    
    

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
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

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        Turn = new javax.swing.JLabel();
        WinLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });

        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });

        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });

        Restart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Restart.setText("Restart");
        Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestartMouseClicked(evt);
            }
        });

        Turn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Turn.setText("Player 1 turn");

        WinLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b7)
                            .addComponent(b4)
                            .addComponent(b1))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Restart)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5)
                                    .addComponent(b8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9)
                                    .addComponent(b6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2)
                                .addGap(18, 18, 18)
                                .addComponent(b3))
                            .addComponent(WinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Turn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(WinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Restart)
                .addGap(163, 163, 163))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        ChangeColor(b1);
        
        
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        ChangeColor(b2);
        
        
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        ChangeColor(b3);
        
        
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        ChangeColor(b4);
        
        
        
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        ChangeColor(b5);
        
        
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        ChangeColor(b6);
        
        
    }//GEN-LAST:event_b6MouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        ChangeColor(b7);
        
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        ChangeColor(b8);
        
        
    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        ChangeColor(b9);
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_b9MouseClicked

    private void RestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestartMouseClicked
        resetGame();// TODO add your handling code here:
    }//GEN-LAST:event_RestartMouseClicked

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Restart;
    private javax.swing.JLabel Turn;
    private javax.swing.JLabel WinLabel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    // End of variables declaration//GEN-END:variables
}
