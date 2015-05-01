import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class creadorDiscos {

	ImageIcon lbdisco0 = new ImageIcon("practica2/disco0.png");
	ImageIcon lbdisco1 = new ImageIcon("practica2/disco1.png");
	ImageIcon lbdisco2 = new ImageIcon("practica2/disco2.png");
	ImageIcon lbdisco3 = new ImageIcon("practica2/disco3.png");
	ImageIcon lbdisco4 = new ImageIcon("practica2/disco4.png");
	ImageIcon lbdisco5 = new ImageIcon("practica2/disco5.png");
	ImageIcon lbdisco6 = new ImageIcon("practica2/disco6.png");
	ImageIcon lbdisco7 = new ImageIcon("practica2/disco7.png");
	
public static void crearDiscos(JFrame ventana, String Discos){
		
		creadorDiscos cD = new creadorDiscos();
		JLabel disco0 = new JLabel(cD.lbdisco0);
		JLabel disco1 = new JLabel(cD.lbdisco1);
		JLabel disco2 = new JLabel(cD.lbdisco2);
		JLabel disco3 = new JLabel(cD.lbdisco3);
		JLabel disco4 = new JLabel(cD.lbdisco4);
		JLabel disco5 = new JLabel(cD.lbdisco7);
		JLabel disco6 = new JLabel(cD.lbdisco6);
		JLabel disco7 = new JLabel(cD.lbdisco7);
		
		int T1[] ={288,260,233,203,176,146,122,94};
		
		int d = Integer.parseInt(Discos);
		
		
		if(d==3){
			disco2.setBounds(49, T1[0], 240, 40);
			disco1.setBounds(49, T1[1], 240, 40);
			disco0.setBounds(49, T1[2], 240, 40);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if(d==4){
			disco3.setBounds(49, T1[0], 240, 40);
			disco2.setBounds(49, T1[1], 240, 40);
			disco1.setBounds(49, T1[2], 240, 40);
			disco0.setBounds(49, T1[3], 240, 40);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if (d==5){
			disco4.setBounds(49, T1[0], 240, 40);
			disco3.setBounds(49, T1[1], 240, 40);
			disco2.setBounds(49, T1[2], 240, 40);
			disco1.setBounds(49, T1[3], 240, 40);
			disco0.setBounds(49, T1[4], 240, 40);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if(d==6){
			disco5.setBounds(49, T1[0], 240, 40);
			disco4.setBounds(49, T1[1], 240, 40);
			disco3.setBounds(49, T1[2], 240, 40);
			disco2.setBounds(49, T1[3], 240, 40);
			disco1.setBounds(49, T1[4], 240, 40);
			disco0.setBounds(49, T1[5], 240, 40);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if (d==7){
			disco6.setBounds(49, T1[0], 240, 40);
			disco5.setBounds(49, T1[1], 240, 40);
			disco4.setBounds(49, T1[2], 240, 40);
			disco3.setBounds(49, T1[3], 240, 40);
			disco2.setBounds(49, T1[4], 240, 40);
			disco1.setBounds(49, T1[5], 240, 40);
			disco0.setBounds(49, T1[6], 240, 40);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else{
			disco7.setBounds(49, T1[0], 240, 40);
			disco6.setBounds(49, T1[1], 240, 40);
			disco5.setBounds(49, T1[2], 240, 40);
			disco4.setBounds(49, T1[3], 240, 40);
			disco3.setBounds(49, T1[4], 240, 40);
			disco2.setBounds(49, T1[5], 240, 40);
			disco1.setBounds(49, T1[6], 240, 40);
			disco0.setBounds(49, T1[7], 240, 40);
			ventana.add(disco7);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}
		
	}

}

