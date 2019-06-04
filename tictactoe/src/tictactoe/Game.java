package tictactoe;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.scene.AccessibleRole;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

	public class Game extends javax.swing.JFrame{
		                   
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton6;
	    private javax.swing.JButton jButton7;
	    private javax.swing.JButton jButton8;
	    private javax.swing.JButton jButton9;
	    private javax.swing.JButton jButtonReplay;
	    private javax.swing.JLabel jLabelMSG;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    
	    public Game() {
	        initComponents();
	        addAction();
	    }
	    
	    
	    int x_or_o = 0;
	    
	    public ActionListener createAction(JButton button)
	    {
	        ActionListener al = new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	                if(button.getText().equals("")){
	                    if((x_or_o % 2) == 0)
	                        {
	                            button.setText("X");
	                            button.setForeground(Color.BLUE);
	                           jLabelMSG.setText("O turn now");
	                            getTheWinner();
	                        }else{
	                            button.setText("O");
	                            button.setForeground(Color.RED);
	                            jLabelMSG.setText("X turn now");
	                            getTheWinner();
	                        }

	                          x_or_o ++;
	                }
	                
	            }
	            
	        };
	        return al;
	    }      
	    
	    public void addAction(){
	        
	        Component[] comps = jPanel1.getComponents();
	        
	        for(Component comp : comps){
	            if(comp instanceof JButton){
	                JButton button = (JButton)comp;
	                button.addActionListener(createAction(button));
	            }
	        }
	        
	    }
	    
	    @SuppressWarnings("unchecked")
		protected void initComponents() {
	    	
	        jPanel1 = new javax.swing.JPanel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButton4 = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jButton6 = new javax.swing.JButton();
	        jButton7 = new javax.swing.JButton();
	        jButton8 = new javax.swing.JButton();
	        jButton9 = new javax.swing.JButton();
	        jPanel2 = new javax.swing.JPanel();
	        jLabelMSG = new javax.swing.JLabel();
	        jButtonReplay = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jButton1.setBackground(new java.awt.Color(255, 255, 255));
	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton1.setBorder(null);

	        jButton2.setBackground(new java.awt.Color(255, 255, 255));
	        jButton2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton2.setBorder(null);

	        jButton3.setBackground(new java.awt.Color(255, 255, 255));
	        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton3.setBorder(null);

	        jButton4.setBackground(new java.awt.Color(255, 255, 255));
	        jButton4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton4.setBorder(null);

	        jButton5.setBackground(new java.awt.Color(255, 255, 255));
	        jButton5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton5.setBorder(null);

	        jButton6.setBackground(new java.awt.Color(255, 255, 255));
	        jButton6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton6.setBorder(null);

	        jButton7.setBackground(new java.awt.Color(255, 255, 255));
	        jButton7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton7.setBorder(null);

	        jButton8.setBackground(new java.awt.Color(255, 255, 255));
	        jButton8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton8.setBorder(null);

	        jButton9.setBackground(new java.awt.Color(255, 255, 255));
	        jButton9.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
	        jButton9.setBorder(null);

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel2.setBackground(Color.BLACK);

	        jLabelMSG.setFont(new Font("Times New Roman", Font.ITALIC, 24)); // NOI18N
	        jLabelMSG.setForeground(new java.awt.Color(255, 255, 255));
	        jLabelMSG.setText("play tic tac toe");

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabelMSG, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jLabelMSG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
	        );

	        jButtonReplay.setBackground(Color.BLACK);
	        jButtonReplay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15)); // NOI18N
	        jButtonReplay.setForeground(new java.awt.Color(255, 255, 255));
	        jButtonReplay.setText("replay");
	        jButtonReplay.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButtonReplayActionPerformed(evt);
	            }
	        });
	        
	        JButton btnExit = new JButton();
	        btnExit.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent args0)	{
	        		if (JOptionPane.showConfirmDialog(getContentPane(), "confirm if you want to exit", "tic tac toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)	{
	        		
	        			System.exit(0);
	        			
	        		}
	        	}
	        });
	        btnExit.setText("exit");
	        btnExit.setForeground(Color.WHITE);
	        btnExit.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	        btnExit.setBackground(Color.BLACK);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(33)
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(30, Short.MAX_VALUE))
	        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        			.addContainerGap(23, Short.MAX_VALUE)
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
	        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
	        					.addComponent(jButtonReplay, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
	        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
	        				.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jButtonReplay, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
	        			.addContainerGap())
	        );
	        getContentPane().setLayout(layout);

	        pack();
	        
	    }                       

	    private void jButtonReplayActionPerformed(java.awt.event.ActionEvent evt) {                         
	        win = false;        
	        Component[] comps = jPanel1.getComponents();
	        
	        for(Component comp : comps){
	            if(comp instanceof JButton){
	                JButton button = (JButton)comp;
	                button.setText("");
	                button.setBackground(Color.WHITE);
	                jLabelMSG.setText("Play");
	            }
	        }
	        
	    }  
	    
	    boolean win = false;
	    
	    public void winEffect(JButton b1, JButton b2, JButton b3)
	    {
	        b1.setBackground(Color.BLACK);
	        b2.setBackground(Color.BLACK);
	        b3.setBackground(Color.BLACK);
	        
	        b1.setForeground(Color.WHITE);
	        b2.setForeground(Color.WHITE);
	        b3.setForeground(Color.WHITE);
	        
	        String msg = b1.getText() + " Is The Winner";
	        jLabelMSG.setText(msg);
	        
	    }
	    
	    public void getTheWinner(){
	        
	        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton2.getText()) && jButton1.getText().equals(jButton3.getText())){
	            winEffect(jButton1, jButton2, jButton3);
	            win = true;
	        }
	        
	        if(!jButton4.getText().equals("") && jButton4.getText().equals(jButton5.getText()) && jButton4.getText().equals(jButton6.getText())){
	            winEffect(jButton4, jButton5, jButton6);
	            win = true;
	        }
	        
	        if(!jButton7.getText().equals("") && jButton7.getText().equals(jButton8.getText()) && jButton7.getText().equals(jButton9.getText())){
	            winEffect(jButton7, jButton8, jButton9);
	            win = true;
	        }
	        
	        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton4.getText()) && jButton1.getText().equals(jButton7.getText())){
	            winEffect(jButton1, jButton4, jButton7);
	            win = true;
	        }
	        
	        if(!jButton2.getText().equals("") && jButton2.getText().equals(jButton5.getText()) && jButton2.getText().equals(jButton8.getText())){
	           winEffect(jButton2, jButton5, jButton8);
	           win = true;
	        }
	        
	        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton6.getText()) && jButton3.getText().equals(jButton9.getText())){
	            winEffect(jButton3, jButton6, jButton9);
	            win = true;
	        }
	        
	        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton5.getText()) && jButton1.getText().equals(jButton9.getText())){
	            winEffect(jButton1, jButton5, jButton9);
	            win = true;
	        }
	        
	        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton5.getText()) && jButton3.getText().equals(jButton7.getText())){
	            winEffect(jButton3, jButton5, jButton7);
	            win = true;
	        }
	        
	        else if(buttonsTextLength() == 9 && win == false){
	            jLabelMSG.setText("No One Win");
	        }
	}

	    //https://www.youtube.com/watch?v=QFEfQMc4qEk
	    public int buttonsTextLength(){

	        String txt = "";
	        
	        Component[] comps = jPanel1.getComponents();
	        
	        for(Component comp : comps){
	            if(comp instanceof JButton){
	                JButton button = (JButton)comp;
	                 txt = txt + button.getText();
	            }
	        }
	        return txt.length();
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
	            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new Game().setVisible(true);
	            }
	        });
	    }
	    
	}
