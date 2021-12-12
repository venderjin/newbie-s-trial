import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class color_game extends JFrame {
	public color_game() {
		setTitle("Color and Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container a = getContentPane();
		a.setLayout(null); // 컨팬트팬의 배치자관리자 제거
		a.setBackground(new Color(245, 245, 255));   // 컨텐트팬의 색을 흰색

		JLabel rule = new JLabel(
				"<html><body style='text-align:center;'>-RULE-<br/>[STRT] 버튼의 글자색과 동일한 배경색 박스를 클릭<br/>클릭한 박스에 적힌 글자와 동일한 배경색 클릭</body></html>",
				JLabel.CENTER);
		Font fontr = new Font("맑은고딕", Font.BOLD, 17);
		rule.setFont(fontr);
		rule.setForeground(Color.DARK_GRAY); 
		rule.setSize(400, 80);
		rule.setLocation(150, 10); // 룰 설명란
		a.add(rule);

		JButton reset = new JButton("RESET");
		JButton start = new JButton("START");
		JButton exit = new JButton("EXIT");

		reset.setBackground(new Color(255, 245, 255));
		reset.setForeground(Color.BLACK);
		reset.setFont(new Font("맑은고딕", Font.BOLD, 20));
		reset.setLocation(150, 100);
		reset.setSize(90, 40);
		reset.setBorder(new LineBorder(Color.BLACK, 5, true));
		
		start.setBackground(new Color(245, 245, 255));
		start.setForeground(Color.RED);
		start.setFont(new Font("맑은고딕", Font.BOLD, 20));
		start.setLocation(300, 100);
		start.setSize(90, 40);
		start.setBorder(new LineBorder(Color.BLACK, 5, true));
		
		exit.setBackground(new Color(255, 245, 255));
		exit.setForeground(Color.BLACK);
		exit.setFont(new Font("맑은고딕", Font.BOLD, 20));
		exit.setLocation(450, 100);
		exit.setSize(90, 40);
		exit.setBorder(new LineBorder(Color.BLACK, 5, true));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			});
	
		a.add(reset); 
		a.add(start);
		a.add(exit);
		// 리셋 스타트 엑시트 버튼
		
		JLabel jLabel = new JLabel();
        jLabel.setBounds(250, 120, 250, 100);
        jLabel.setFont(new Font("맑은고딕", Font.BOLD, 30));
        
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;

            public void run() {

                jLabel.setText("Time left : " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over!");
                    jLabel.setForeground(Color.RED);
                    jLabel.setFont(new Font("맑은고딕", Font.BOLD, 40));
                    
                }
            }
        }, 0, 1000);
        
        a.add(jLabel);
        //타이머
		
		JButton b1 = new JButton("보라");
		JButton b2 = new JButton("남색");
		JButton b3 = new JButton("파랑");
		JButton b4 = new JButton("NEXT");
		JButton b5 = new JButton("분홍");
		JButton b6 = new JButton("하늘");
		JButton b7 = new JButton("연두");
		JButton b8 = new JButton("초록");
		JButton b9 = new JButton("노랑");
		JButton b10 = new JButton("검정");
		JButton b11 = new JButton("회색");
		JButton b12 = new JButton("주황");
		
		b1.setBackground(new Color(255, 0, 0));
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b1.setLocation(110, 200);
		b1.setSize(150, 120);
		b1.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b2.setBackground(new Color(255, 165, 0));
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b2.setLocation(270, 200);
		b2.setSize(150, 120);
		b2.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b3.setBackground(new Color(0, 0, 0));
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b3.setLocation(430, 200);
		b3.setSize(150, 120);
		b3.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b4.setBackground(new Color(0, 0, 255));
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b4.setLocation(110, 330);
		b4.setSize(150, 120);
		b4.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b5.setBackground(new Color(128, 128, 128));
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b5.setLocation(270, 330);
		b5.setSize(150, 120);
		b5.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b6.setBackground(new Color(173, 255, 47));
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b6.setLocation(430, 330);
		b6.setSize(150, 120);
		b6.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b7.setBackground(new Color(255, 105, 180));
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b7.setLocation(110, 460);
		b7.setSize(150, 120);
		b7.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b8.setBackground(new Color(0, 0, 128));
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b8.setLocation(270, 460);
		b8.setSize(150, 120);
		b8.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b9.setBackground(new Color(128, 0, 128));
		b9.setForeground(Color.WHITE);
		b9.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b9.setLocation(430, 460);
		b9.setSize(150, 120);
		b9.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b10.setBackground(new Color(0, 128, 0));
		b10.setForeground(Color.WHITE);
		b10.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b10.setLocation(110, 590);
		b10.setSize(150, 120);
		b10.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b11.setBackground(new Color(255, 255, 0));
		b11.setForeground(Color.WHITE);
		b11.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b11.setLocation(270, 590);
		b11.setSize(150, 120);
		b11.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		b12.setBackground(new Color(135, 206, 235));
		b12.setForeground(Color.WHITE);
		b12.setFont(new Font("맑은고딕", Font.BOLD, 40));
		b12.setLocation(430, 590);
		b12.setSize(150, 120);
		b12.setBorder(new LineBorder(new Color(255, 245, 255)));
		
		a.add(b1);
		a.add(b2);
		a.add(b3);
		a.add(b4);
		a.add(b5);
		a.add(b6);
		a.add(b7);
		a.add(b8);
		a.add(b9);
		a.add(b10);
		a.add(b11);
		a.add(b12);
		
		setSize(700, 800); // 프레임 크기
		setVisible(true); // 프레임 출력
		setResizable(false); // 프레임 사이즈변경가능 유무
		setLocationRelativeTo(null); // 프레임 중앙정렬
	}

	public static void main(String[] args) {
		new color_game();
	}

}
