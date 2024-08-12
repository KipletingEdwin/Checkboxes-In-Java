import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot'");
        checkBox.setFocusable(false);

         this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
