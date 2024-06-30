import javax.swing.*;
import java.awt.*;

public class EasyFrame extends JFrame{

    ImageIcon icon;
    public static InfoPanel  topPanel;
    JPanel  panel2;
    JPanel  panel3;
    public static GamePanel  mainPanel;
    JPanel  panel5;

    /**
     * main Frame 생성자
     * @author Easy
     */
    EasyFrame(){

        this.setSize(1024,680);
        this.setLayout(new BorderLayout(1,1));
        this.setTitle("EasySwing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setJMenuBar(new EasyMenuBar());
        icon = new ImageIcon("resource/images/Agent Smith.png");
        this.setIconImage(icon.getImage());

        //TODO panel 배치,배경색,크기 및 변수명 변경요함
        topPanel = new InfoPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        mainPanel = new GamePanel();
        panel5 = new JPanel();

        topPanel.setBackground(Color.gray);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.blue);
        mainPanel.setBackground(Color.black);
        panel5.setBackground(Color.yellow);

        topPanel.setPreferredSize(new Dimension(100,25));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        mainPanel.setPreferredSize(new Dimension(600,600));
        panel5.setPreferredSize(new Dimension(100,100));

        this.add(topPanel, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.EAST);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(panel5, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * 게임 재시작을 위한 method
     */
    public static void newGameStart(){
        System.out.println("System : Someone try to start a new game.");
        topPanel.score = 0;
        mainPanel.startGame();
    }

    /**
     * Score 증가를 위한 method
     * TODO : dataStructure 관리자에게 인계
     */
    public static void updateScore(){
        topPanel.updateScore();
        System.out.println("System : score++");
    }
}
