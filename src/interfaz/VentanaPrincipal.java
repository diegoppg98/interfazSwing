package interfaz;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class VentanaPrincipal {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application. CAMBIADO
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(61, 62, 231, 112);
		frame.getContentPane().add(textArea);
		
		JLabel lblCaracteres = new JLabel("Numero caracteres");
		lblCaracteres.setBounds(152, 24, 167, 14);
		frame.getContentPane().add(lblCaracteres);
		
		JLabel lblPalabras = new JLabel("Numero palabras");
		lblPalabras.setBounds(10, 24, 118, 14);
		frame.getContentPane().add(lblPalabras);
		
		JButton btnContar= new JButton("Contar palabras");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "BOTON CLICADO");
				
			}
		});
		
		btnContar.setBounds(49, 212, 142, 23);
		frame.getContentPane().add(btnContar);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Radio button1");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(246, 192, 142, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Radio button2");


		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	if(rdbtnNewRadioButton_1.isSelected()){    
				//	JOptionPane.showMessageDialog(null,"HOLA");    
					
			//		} 
			}});
		
		
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(246, 231, 142, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()){    
				//	JOptionPane.showMessageDialog(null, "R1.");    
					}    
					if(rdbtnNewRadioButton_1.isSelected()){    
				//	JOptionPane.showMessageDialog(null,"R2");    
					
					} 
			}
		});
		
	
	
		btnNewButton_1.setBounds(302, 91, 124, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox CheckBox1 = new JCheckBox("Check box 1");
		CheckBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(CheckBox1.isSelected())
					textArea.setText("CHECK BOX CLICADO");
				
				else {
					textArea.setText("CHECK BOX DESELECCIONADO");
				}
				
			}
		});
		
		
		CheckBox1.setBounds(313, 130, 97, 23);
		frame.getContentPane().add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("Check box 2");
		CheckBox2.setBounds(313, 156, 97, 23);
		frame.getContentPane().add(CheckBox2);
		   
		   
		String list[]={"1","2","3","4"};   
		JComboBox<String> comboBox = new JComboBox<String>(list);
		comboBox.setBounds(329, 20, 81, 22);
		frame.getContentPane().add(comboBox);
		 
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				lblPalabras.setText(comboBox.getItemAt(comboBox.getSelectedIndex()));
				lblPalabras.setText(""+comboBox.getSelectedItem());
			
				/*String texto = textArea.getText();
				
				int numCaracteres = texto.replaceAll(" ", "").length();
				
				lblCaracteres.setText("Numero de caracteres: "+ numCaracteres);
				
				
				String[] arrayPalabras = texto.split(" ");
				int numPalabras = arrayPalabras.length;
				lblPalabras.setText("Numero plabras: "+ numPalabras);
				*/
			}
		});
		
	}
}
