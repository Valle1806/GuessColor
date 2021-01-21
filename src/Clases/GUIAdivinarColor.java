/**
 * 
 */
package Clases;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author CristianV
 *
 */
public class GUIAdivinarColor extends JFrame{
	private JButton rMas,rMenos,vMas,vMenos,aMas,aMenos;
	private JLabel titulo,cBuscar,color;
	private JPanel botones,colores,izquierda,derecha;
	private Colores color1;
	
	public GUIAdivinarColor(){
		super("Adivina Color");
		color1= new Colores();
		System.out.println(color1.getRojo());
		System.out.println(color1.getVerde());
		System.out.println(color1.getAzul());
		Container contenedor= getContentPane();
		contenedor.setLayout(new BorderLayout());
		
		titulo= new JLabel(" ADIVINAR COLOR");
		titulo.setForeground(new Color(255,255,255));
		titulo.setBackground(new Color(0,2,3));
		titulo.setOpaque(true);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 36));
		contenedor.add(titulo,BorderLayout.NORTH);
		
		Escuchar click = new Escuchar();
		
		botones=new JPanel();
		botones.setBackground(new Color(0,0,0));
		botones.setOpaque(true);
		
		rMas= new JButton("+");
		rMas.setBackground(new Color(255,0,0));
		rMas.addActionListener(click);
		
		rMenos= new JButton("-");
		rMenos.setBackground(new Color(255,0,0));
		rMenos.addActionListener(click);
		
		vMas= new JButton("+");
		vMas.setBackground(new Color(0,255,0));
		vMas.addActionListener(click);
		
		vMenos= new JButton("-");
		vMenos.setBackground(new Color(0,255,0));
		vMenos.addActionListener(click);
		
		aMas= new JButton("+");
		aMas.setBackground(new Color(0,0,255));
		aMas.addActionListener(click);
		
		aMenos= new JButton("-");
		aMenos.setBackground(new Color(0,0,255));
		aMenos.addActionListener(click);
		botones.add(rMas);
		botones.add(rMenos);
		botones.add(vMas);
		botones.add(vMenos);
		botones.add(aMas);
		botones.add(aMenos);
		
		contenedor.add(botones, BorderLayout.SOUTH);
		
		colores=new JPanel();
		
		cBuscar= new JLabel("   ");
		color= new JLabel("   ");
		
		cBuscar.setFont(new Font("Monospaced", Font.BOLD, 20));
		cBuscar.setBackground(new Color(0,0,0));
		cBuscar.setOpaque(true);
		
		color.setFont(new Font("Monospaced", Font.BOLD, 20));
		color.setBackground(new Color(color1.getRojo(),color1.getVerde(),color1.getAzul()));
		color.setOpaque(true);
		
		colores.add(cBuscar);
		colores.add(color);
		
		
		contenedor.add(colores, BorderLayout.CENTER);
		
		izquierda=new JPanel();
		derecha=new JPanel();
		izquierda.setBackground(new Color(30,100,255));
		derecha.setBackground(new Color(30,100,225));
		contenedor.add(izquierda,BorderLayout.WEST);
		contenedor.add(derecha,BorderLayout.EAST);
		setSize(360,150); 
		setResizable(false); 
		setVisible(true);
	}
	
	public void cambiar(){
		cBuscar.setBackground(new Color(color1.getAuxRojo(),color1.getAuxVerde(),color1.getAuxAzul()));
		if(color1.comparar()){
			JOptionPane.showMessageDialog(null,"Has adivinado el color","Resultado",JOptionPane.PLAIN_MESSAGE);	
		}
	}
	public class Escuchar implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent evento) {
			// TODO Auto-generated method stub
			if(evento.getSource()==rMas){
				color1.setAuxRojoMas();
				System.out.println(color1.getAuxRojo());
				cambiar();
			}else{
				if(evento.getSource()==rMenos){
					color1.setAuxRojoMenos();
					System.out.println(color1.getAuxRojo());
					cambiar();
				}else{
					if(evento.getSource()==vMas){
						color1.setAuxVerdeMas();
						System.out.println(color1.getAuxVerde());
						cambiar();
					}else{
						if(evento.getSource()==vMenos){
							color1.setAuxVerdeMenos();
							System.out.println(color1.getAuxVerde());
							cambiar();
						}else{
							if(evento.getSource()==aMas){
								color1.setAuxAzulMas();
								System.out.println(color1.getAuxAzul());
								cambiar();
							}else{
								if(evento.getSource()==aMenos){
									color1.setAuxAzulMenos();
									System.out.println(color1.getAuxAzul());
									cambiar();
								}
							}
						}
					}
				}
			}
			
		}

		
	}
}
