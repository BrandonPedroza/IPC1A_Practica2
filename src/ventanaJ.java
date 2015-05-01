import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.Icon;


public class ventanaJ {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaJ window = new ventanaJ();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaJ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
		public void mover(){ 
		JButton btTorre_1 = new JButton("Torre 1");
		btTorre_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		}
		});
		btTorre_1.setBounds(92, 331, 89, 23);
		frame.getContentPane().add(btTorre_1);
		
		JButton btTorre_2 = new JButton("Torre 2");
		btTorre_2.setBounds(309, 331, 89, 23);
		frame.getContentPane().add(btTorre_2);
		
				
		JButton btTorre_3 = new JButton("Torre 3");
		btTorre_3.setBounds(509, 331, 89, 23);
		frame.getContentPane().add(btTorre_3);
		
		
		
		}
		
		public static void crearDisco(){
			
			ventanaJ cd = new ventanaJ();
		
		JLabel lbT1_0 = new JLabel(new ImageIcon("practica2/disco7.png"));
				
		JLabel lbT1_1 = new JLabel(new ImageIcon("practica2/disco6.png"));
				
		JLabel lbT1_2 = new JLabel(new ImageIcon("practica2/disco5.png"));
				
		JLabel lbT1_3 = new JLabel(new ImageIcon("practica2/disco4.png"));
		
		JLabel lbT1_4 = new JLabel(new ImageIcon("practica2/disco3.png"));
		
		JLabel lbT1_5 = new JLabel(new ImageIcon("practica2/disco2.png"));
		
		JLabel lbT1_6 = new JLabel(new ImageIcon("practica2/disco1.png"));
		
		JLabel lbT1_7 = new JLabel(new ImageIcon("practica2/disco0.png"));
		
		
	
			
		
	final int y[] ={485,445,405,365,325,285,245,205};
	String Discos;
	
	

	
	
	
		}
}

