import javax.swing.*;

public class InfoPanel extends JPanel {
    int score;
    JLabel scoreLabel;

    InfoPanel(){

        score = 0;
        scoreLabel = new JLabel();
        scoreLabel.setText("Score : " + score);

        this.add(scoreLabel);
    }
    public void updateScore(){
        score++;
        scoreLabel.setText("Score : " + score);
    }
}
