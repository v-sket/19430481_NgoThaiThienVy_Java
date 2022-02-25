package tuan01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GPTB2 extends JFrame implements ActionListener {

	JLabel lblTitle, lblNhapA, lblNhapB, lblNhapC, lblKQ;
	JTextField txtNhapA, txtNhapB, txtNhapC, txtKQ;
	JButton btnGiai, btnXoaRong, btnThoat;

	public GPTB2() {
		setTitle("^-^");
		setSize(600, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Control();
	}

	public void Control() {
		JPanel pnl = new JPanel();
//		JPanel pnlNorth = new JPanel();
//		
//		pnlNorth.add(lblTitle = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2"));
//		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
//		pnlNorth.setBackground(Color.cyan);
//		pnl.add(pnlNorth, BorderLayout.NORTH);
//		
//		JPanel pnlCenter = new JPanel();
//		pnlCenter.add(lblNhapA = new JLabel("Nhập a: "));
//		pnlCenter.add(txtNhapA = new JTextField(10));
//		
//		pnlCenter.add(lblNhapB = new JLabel("Nhập b: "));
//		pnlCenter.add(txtNhapB = new JTextField(10));
//		
//		pnlCenter.add(lblNhapC = new JLabel("Nhập c: "));
//		pnlCenter.add(txtNhapC = new JTextField(10));
//		
//		pnlCenter.add(lblKQ = new JLabel("Kết quả: "));
//		pnlCenter.add(txtKQ = new JTextField(10));
//		pnl.add(pnlCenter, BorderLayout.CENTER);
//		txtKQ.setEditable(false);

		Box b = Box.createVerticalBox();
		Box b1, b2, b3, b4;
		b.add(lblTitle = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2"));
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setBackground(Color.cyan);
		
		b.add(b1 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b1.add(lblNhapA = new JLabel("Nhập a: "));
		b1.add(txtNhapA = new JTextField(10));

		b.add(b2 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b2.createVerticalStrut(10);
		b2.add(lblNhapB = new JLabel("Nhập b: "));
		b2.add(txtNhapB = new JTextField(10));

		b.add(b3 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b3.add(lblNhapC = new JLabel("Nhập c: "));
		b3.add(txtNhapC = new JTextField(10));

		b.add(b4 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b4.add(lblKQ = new JLabel("Kết quả: "));
		b4.add(txtKQ = new JTextField(10));
		txtKQ.setEditable(false);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		
		pnl.add(b);

		JPanel pnlSouth = new JPanel();
		pnlSouth.setBorder(new TitledBorder("Chọn tác vụ"));
		pnlSouth.add(btnGiai = new JButton("Giải"));
		pnlSouth.add(btnXoaRong = new JButton("Xóa rỗng"));
		pnlSouth.add(btnThoat = new JButton("Thoát"));

		pnl.add(pnlSouth, BorderLayout.SOUTH);

		add(pnl);
	}

	public static void main(String[] args) {
		new GPTB2().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
	}
}
