package tuan01;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoCheckbox_ngoThaiThienVy_45  extends JFrame implements ActionListener {

	JTextField txtFont;
	JCheckBox chkBold, chkItalic;
	
	public DemoCheckbox_ngoThaiThienVy_45() {
		setTitle("JCheckBox Test");
		setSize(350, 100);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Control();
	}
	
	public void Control() {
		JPanel pnl = new JPanel();
		pnl.add(txtFont = new JTextField(25));
		pnl.add(chkBold = new JCheckBox("Bold"));
		pnl.add(chkItalic = new JCheckBox("Italic"));
		add(pnl);
	}
	
	public static void main(String[] args) {
		new DemoCheckbox_ngoThaiThienVy_45().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == chkBold) {
			txtFont.setFont(new Font("Arial", Font.BOLD, 20));
		} else if(obj == chkItalic){
			txtFont.setFont(new Font("Arial", Font.ITALIC, 20));
		}
	}
	
}
