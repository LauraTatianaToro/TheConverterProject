package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.StateChanger;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FeetConversionArea;
	private JTextField CentimetersConversionArea;
	private JTextField MeterConversionArea;

	StateChanger statechanger;
	String cm;
	private String feet;

	/**
	 * Create the frame.
	 */
	public ConverterWindow() {
			setComponents();

	}
	
	public void setComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 420);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu updateModelMenu = new JMenu("Update model");
		menuBar.add(updateModelMenu);
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FeetConversionArea = new JTextField();
		FeetConversionArea.setEditable(false);
		FeetConversionArea.setHorizontalAlignment(SwingConstants.LEFT);
		FeetConversionArea.setBackground(Color.GREEN);
		FeetConversionArea.setBounds(106, 0, 194, 161);
		contentPane.add(FeetConversionArea);
		FeetConversionArea.setColumns(10);

		
		CentimetersConversionArea = new JTextField();
		CentimetersConversionArea.setHorizontalAlignment(SwingConstants.LEFT);
		CentimetersConversionArea.setColumns(10);
		CentimetersConversionArea.setBackground(Color.YELLOW);
		CentimetersConversionArea.setBounds(207, 172, 194, 161);
		contentPane.add(CentimetersConversionArea);
		
		MeterConversionArea = new JTextField();
		MeterConversionArea.setEditable(false);
		MeterConversionArea.setHorizontalAlignment(SwingConstants.LEFT);
		MeterConversionArea.setColumns(10);
		MeterConversionArea.setBackground(Color.ORANGE);
		MeterConversionArea.setBounds(310, 0, 194, 161);
		contentPane.add(MeterConversionArea);
		
		
		JMenuItem saveInputMenuItem = new JMenuItem("Save input centimeters");
		saveInputMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == saveInputMenuItem) {
					cm = CentimetersConversionArea.getText();

					statechanger = new StateChanger(cm, FeetConversionArea, MeterConversionArea);
				}
			}
		});
		saveInputMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_DOWN_MASK));
		updateModelMenu.add(saveInputMenuItem);
	}
	

	
	public void setFeet(String feet) {
		this.feet = feet;
		FeetConversionArea.setText(feet);
	}
	
}

