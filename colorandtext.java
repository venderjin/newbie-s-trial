import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class colorandtext extends JFrame {
	public colorandtext() {
		Container a = getContentPane(); // ����Ʈ �� �˾Ƴ���
		a.setLayout(new FlowLayout());  //
		a.setBackground(Color.white);   // ����Ʈ���� ���� ���
		
		JLabel rule = new JLabel("<html><body style='text-align:center;'>-RULE-<br/>[STRT] ��ư�� ���ڻ��� ������ ���� �ڽ��� Ŭ��<br/>Ŭ���� �ڽ��� ���� ���ڿ� ������ ���� Ŭ��</body></html>", JLabel.CENTER);
		Font fontr = new Font("����������_ac", Font.PLAIN, 15);
		rule.setFont(fontr);
		rule.setForeground(Color.DARK_GRAY); //�� ���� ��Ʈ����
		a.add(rule);
		
		JButton reset = new JButton("RESET");
		JButton start = new JButton("START");
		
		reset.setBackground(Color.WHITE);
		reset.setForeground(Color.BLACK);
		start.setBackground(Color.WHITE);
		start.setForeground(Color.RED);

		
		a.add(reset); a.add(start);

		setTitle("color or text"); // Ÿ��Ʋ
		setSize(600, 700); // ������ ũ�l
		setVisible(true); // ������ ���
		setResizable(false); // ������ ������氡�� ����
		setLocationRelativeTo(null); // ������ �߾�����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ������ ���α׷� ����

	}

	public static void main(String[] args) {
		colorandtext frame = new colorandtext();
	}

}
