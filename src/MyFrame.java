import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot'");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));

         this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
