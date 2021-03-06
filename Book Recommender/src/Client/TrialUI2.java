package Client;

import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Point;
import java.awt.Font;
import javax.swing.JButton;
import java.util.Locale;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class TrialUI2 extends javax.swing.JFrame {
	static String recomendations[][];
    public TrialUI2(String [][]recommendations) {
    	setPreferredSize(new Dimension(1130, 650));
    	setLocation(new Point(100, 0));	
    	//setLocationRelativeTo(null);
    	this.recomendations = recommendations;
    	for (String[] strings : recommendations) {
			System.out.println("Title : "+strings[0]);
			System.out.println("Rating : "+strings[1]);
			System.out.println("imageURL : "+strings[2]);
			System.out.println();
		}
    	initComponents();
		jLabel1.setVisible(false);
		jLabel3.setVisible(false);
		jLabel2.setVisible(false);
		jLabel4.setVisible(false);
		jLabel5.setVisible(false);
		textArea.setVisible(false);
    	textArea_1.setVisible(false);
		textArea_2.setVisible(false);
		textArea_3.setVisible(false);
		textArea_4.setVisible(false);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(new Rectangle(0, 0, 50, 0));
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel1.setBounds(151, 256, 126, 166);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setMinimumSize(new Dimension(50, 50));
        jLabel1.setPreferredSize(new Dimension(50, 50));
        jLabel1.setMaximumSize(new Dimension(50, 50));
        jLabel1.setForeground(Color.RED);
        jLabel1.setBackground(Color.BLACK);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(new Rectangle(0, 0, 50, 0));
        jButton1.setBounds(494, 34, 194, 157);
        jButton1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jButton1.setIcon(new ImageIcon("E:\\java pro\\Book Recommender\\images\\books-that-matter-book-review.png"));
        jButton1.setForeground(Color.WHITE);
        jButton1.setBackground(Color.WHITE);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(new Rectangle(0, 0, 50, 0));
        jLabel3.setBounds(330, 256, 126, 166);
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setForeground(Color.RED);
        jLabel3.setBackground(Color.BLACK);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(new Rectangle(0, 0, 50, 0));
        jLabel2.setBounds(510, 256, 126, 166);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setForeground(Color.RED);
        jLabel2.setBackground(Color.BLACK);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(new Rectangle(0, 0, 50, 0));
        jLabel4.setBounds(686, 256, 126, 166);
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setForeground(Color.RED);
        jLabel4.setBackground(Color.BLACK);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(new Rectangle(0, 0, 50, 0));
        jLabel5.setBounds(866, 256, 126, 166);
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setForeground(Color.RED);
        jLabel5.setBackground(Color.BLACK);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(1600, 1000));
        System.out.println("Hello");
        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(recomendations[0][2])
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jLabel3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(recomendations[2][2])
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(recomendations[1][2])
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        jLabel4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(recomendations[3][2])
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        
        jLabel5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jLabel5.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL(recomendations[4][2])
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        

        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
        lblNewLabel.setBackground(Color.LIGHT_GRAY);
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblNewLabel.setBounds(0, 0, 1114, 582);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setIcon(new ImageIcon("E:\\java pro\\Book Recommender\\images\\ui2.jpg"));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        getContentPane().add(jLabel5);
        getContentPane().add(jButton1);
        getContentPane().add(jLabel4);
        getContentPane().add(jLabel2);
        getContentPane().add(jLabel3);
        
        textArea = new JLabel();
        textArea.setBounds(new Rectangle(0, 0, 50, 0));
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea.setHorizontalTextPosition(SwingConstants.CENTER);
        textArea.setHorizontalAlignment(SwingConstants.CENTER);
        textArea.setToolTipText("");
        textArea.setOpaque(false);
        textArea.setLocale(new Locale("en", "IN"));
        textArea.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
        textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setBounds(151, 474, 126, 84);
        getContentPane().add(textArea);
        //textArea.setText(recomendations[0][0]);
        textArea.setText("<html>"+recomendations[0][0] +"</html>");
        
        textArea_1 = new JLabel();
        textArea_1.setBounds(new Rectangle(0, 0, 50, 0));
        textArea_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea_1.setHorizontalTextPosition(SwingConstants.CENTER);
        textArea_1.setHorizontalAlignment(SwingConstants.CENTER);
        textArea_1.setToolTipText("");
        textArea_1.setOpaque(false);
        textArea_1.setLocale(new Locale("en", "IN"));
        textArea_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
        textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        textArea_1.setBackground(Color.LIGHT_GRAY);
        textArea_1.setBounds(330, 474, 126, 84);
        getContentPane().add(textArea_1);
        //textArea_1.setText(recomendations[2][0]);
        textArea_1.setText("<html>"+recomendations[2][0] +"</html>");
     
        textArea_2 = new JLabel();
        textArea_2.setBounds(new Rectangle(0, 0, 50, 0));
        textArea_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea_2.setHorizontalTextPosition(SwingConstants.CENTER);
        textArea_2.setHorizontalAlignment(SwingConstants.CENTER);
        textArea_2.setToolTipText("");
        textArea_2.setOpaque(false);
        textArea_2.setLocale(new Locale("en", "IN"));
        textArea_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
        textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        textArea_2.setBackground(Color.LIGHT_GRAY);
        textArea_2.setBounds(510, 474, 126, 84);
        getContentPane().add(textArea_2);
        //textArea_2.setText(recomendations[1][0]);
        textArea_2.setText("<html>"+recomendations[1][0] +"</html>");
        
        textArea_3 = new JLabel();
        textArea_3.setBounds(new Rectangle(0, 0, 50, 0));
        textArea_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea_3.setHorizontalTextPosition(SwingConstants.CENTER);
        textArea_3.setHorizontalAlignment(SwingConstants.CENTER);
        textArea_3.setToolTipText("");
        textArea_3.setOpaque(false);
        textArea_3.setLocale(new Locale("en", "IN"));
        textArea_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
        textArea_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        textArea_3.setBackground(Color.LIGHT_GRAY);
        textArea_3.setBounds(686, 475, 126, 83);
        getContentPane().add(textArea_3);
      //  textArea_3.setText(recomendations[3][0]);
        textArea_3.setText("<html>"+recomendations[3][0] +"</html>");
        
        textArea_4 = new JLabel();
        textArea_4.setBounds(new Rectangle(0, 0, 50, 0));
        textArea_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        textArea_4.setHorizontalTextPosition(SwingConstants.CENTER);
        textArea_4.setHorizontalAlignment(SwingConstants.CENTER);
        textArea_4.setToolTipText("");
        textArea_4.setOpaque(false);
        textArea_4.setLocale(new Locale("en", "IN"));
        textArea_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
        textArea_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        textArea_4.setBackground(Color.LIGHT_GRAY);
        textArea_4.setBounds(866, 475, 126, 83);
        getContentPane().add(textArea_4);
        //textArea_4.setText(recomendations[4][0]);
        textArea_4.setText("<html>"+recomendations[4][0] +"</html>");
        getContentPane().add(lblNewLabel);

        pack();
        menuBar = new JMenuBar();
        menuBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
        menuBar.setBackground(SystemColor.activeCaptionBorder);
        menuBar.locate(50, 0);
        setJMenuBar(menuBar);
        
        mnMenu = new JMenu("Menu");
        mnMenu.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
        mnMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        mnMenu.setBackground(new Color(102, 153, 204));
        mnMenu.setLocation(new Point(100, 0));
        mnMenu.setAlignmentX(Component.RIGHT_ALIGNMENT);
        menuBar.add(mnMenu);
        
        mntmSignOut = new JMenuItem("Sign out");
        mntmSignOut.setBackground(new Color(0, 0, 0));
        mntmSignOut.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        mntmSignOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		// TrialUI2 t1=new TrialUI2();
        		 TrialUI t=new TrialUI();
        		//this.setVisible(false);//To hide first window
        		 dispose();
                t.setVisible(true);//to take to next window
        	}


        });
        mnMenu.add(mntmSignOut);
        
        mntmUserDetails = new JMenuItem("User Details");
        mntmUserDetails.setBackground(new Color(0, 0, 0));
        mnMenu.add(mntmUserDetails);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jLabel1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel2.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        textArea.setVisible(true);
    	textArea_1.setVisible(true);
		textArea_2.setVisible(true);
		textArea_3.setVisible(true);
		textArea_4.setVisible(true);
	        

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
            java.util.logging.Logger.getLogger(TrialUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrialUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrialUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrialUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrialUI2(recomendations).setVisible(true);
            }
        });
    }
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private JMenu mnMenu;
    private JMenuItem mntmSignOut;
    private JMenuItem mntmUserDetails;
    private JMenuBar menuBar;
    private JButton jButton1;
    private JLabel textArea_1;
    private JLabel textArea_2;
    private JLabel textArea_3;
    private JLabel textArea_4;
    private JLabel textArea;
    // End of variables declaration                   
	public JLabel getJLabel4() {
		return jLabel4;
	}
	public JLabel getJLabel5() {
		return jLabel5;
	}
	public JLabel getJLabel3() {
		return jLabel3;
	}
	public JLabel getJLabel1() {
		return jLabel1;
	}
	public JLabel getJLabel2() {
		return jLabel2;
	}
}
