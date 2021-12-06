import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class colorandtext extends JFrame {
	public colorandtext() {
		Container a = getContentPane(); // 컨텐트 팬 알아내기
		a.setLayout(new FlowLayout());  //
		a.setBackground(Color.white);   // 컨텐트팬의 색을 흰색
		
		JLabel rule = new JLabel("<html><body style='text-align:center;'>-RULE-<br/>[STRT] 버튼의 글자색과 동일한 배경색 박스를 클릭<br/>클릭한 박스에 적힌 글자와 동일한 배경색 클릭</body></html>", JLabel.CENTER);
		Font fontr = new Font("나눔스퀘어_ac", Font.PLAIN, 15);
		rule.setFont(fontr);
		rule.setForeground(Color.DARK_GRAY); //룰 설명 폰트설정
		a.add(rule);
		
		JButton reset = new JButton("RESET");
		JButton start = new JButton("START");
		
		reset.setBackground(Color.WHITE);
		reset.setForeground(Color.BLACK);
		start.setBackground(Color.WHITE);
		start.setForeground(Color.RED);

		
		a.add(reset); a.add(start);

		setTitle("color or text"); // 타이틀
		setSize(600, 700); // 프레임 크릐
		setVisible(true); // 프레임 출력
		setResizable(false); // 프레임 사이즈변경가능 유무
		setLocationRelativeTo(null); // 프레임 중앙정렬
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫으면 프로그램 종료

	}

	public static void main(String[] args) {
		colorandtext frame = new colorandtext();
	}

}
