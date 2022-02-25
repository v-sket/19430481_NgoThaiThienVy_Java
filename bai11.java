package tuan01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bai11 extends JFrame implements ActionListener {

	JLabel lblC, lblF;
	JTextField txtF;

	public bai11() {
		setTitle("Fahrenheit");
		setSize(350, 100);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Control();
	}

	public void Control() {
		JPanel pnl = new JPanel();
		pnl.add(lblF = new JLabel("Enter Fahrenheit temperature: "));
		pnl.add(txtF = new JTextField(10));
		pnl.add(lblC = new JLabel("Celcius temperature: "));
		pnl.setBackground(Color.orange);
		add(pnl);

		txtF.addActionListener(this);
	}

	public static void main(String[] args) {
		new bai11().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float temC, temF;
		temF = Float.parseFloat(txtF.getText());
		temC = (temF - 32) * 5 / 9;

		lblC.setText("Celcius temperature: " + temC + "");
	}

}
