import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class color_game extends JFrame {
	public color_game() {

		
		Container a = getContentPane();
		a.setLayout(null); // 컨팬트팬의 배치자관리자 제거
		a.setBackground(new Color(245, 245, 255));   // 컨텐트팬의 색을 흰색

		JLabel rule = new JLabel(
				"<html><body style='text-align:center;'>-RULE-<br/>[STRT] 버튼의 글자색과 동일한 배경색 박스를 클릭<br/>클릭한 박스에 적힌 글자와 동일한 배경색 클릭</body></html>",
				JLabel.CENTER);
		Font fontr = new Font("나눔스퀘어_ac", Font.PLAIN, 15);
		rule.setFont(fontr);
		rule.setForeground(Color.DARK_GRAY); // 룰 설명 폰트설정
		rule.setSize(350, 50);
		rule.setLocation(125, 20);
		a.add(rule);

		JButton reset = new JButton("RESET");
		JButton start = new JButton("START");

		reset.setBackground(new Color(255, 245, 255));
		reset.setForeground(Color.BLACK);
		reset.setFont(new Font("나눔스퀘어_ac", Font.BOLD, 15));
		reset.setLocation(100, 90);
		reset.setSize(90, 40);
		reset.setBorder(new LineBorder(Color.BLACK, 5, true));
		start.setBackground(new Color(245, 245, 255));
		start.setForeground(Color.RED);
		start.setFont(new Font("나눔스퀘어_ac", Font.BOLD, 15));
		start.setLocation(250, 90);
		start.setSize(90, 40);
		start.setBorder(new LineBorder(Color.BLACK, 5, true));

		a.add(reset); 
		a.add(start);
		
		setTitle("Color and Text");
		setSize(600, 700); // 프레임 크기
		setVisible(true); // 프레임 출력
		setResizable(false); // 프레임 사이즈변경가능 유무
		setLocationRelativeTo(null); // 프레임 중앙정렬
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new color_game();
	}

}
