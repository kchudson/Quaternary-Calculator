import javax.swing.*;
import java.awt.*;

public class UserInterface {

    public static void main(String[] args) {

        JFrame ui = new JFrame("Quaternary Calculator");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setSize(600, 800);

        ui.setLayout(new BorderLayout());

        //Visible Display


        //4 Button Pannel
        JPanel pannel0 = new JPanel();
        JPanel pannel1 = new JPanel();
        JPanel pannel2 = new JPanel();
        JPanel pannel3 = new JPanel();

        JButton button0 = new JButton(" 0 ");
        JButton button1 = new JButton(" 1 ");
        JButton button2 = new JButton(" 2 ");
        JButton button3 = new JButton(" 3 ");

        pannel0.add(button0);
        pannel1.add(button1);
        pannel2.add(button2);
        pannel3.add(button3);

        JPanel buttonsPannel = new JPanel();
        buttonsPannel.setLayout(new GridLayout(2,2));

        buttonsPannel.add(pannel0);
        buttonsPannel.add(pannel1);
        buttonsPannel.add(pannel2);
        buttonsPannel.add(pannel3);

        //Operations "+","-","*","/" (EAST)

        // "=" (SOUTH)

        //Toggle (SOUTH)

        ui.add(buttonsPannel, BorderLayout.CENTER);

        ui.setVisible(true);
    }

}
