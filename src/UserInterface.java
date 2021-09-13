import javax.swing.*;
import java.awt.*;


public class UserInterface {

    public static void main(String[] args) {

        JFrame ui = new JFrame("Quaternary Calculator");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setSize(600, 800);

        ui.setLayout(new BorderLayout());

        //Visible Display...

        JPanel window = new JPanel();
        window.setPreferredSize(new Dimension(600,100));
        //JOptionPane window = new JOptionPane();


        //4 Button Pannel
        JPanel pannel0 = new JPanel();
        JPanel pannel1 = new JPanel();
        JPanel pannel2 = new JPanel();
        JPanel pannel3 = new JPanel();
        Dimension numberButtons = new Dimension(200, 200);
        JButton button0 = new JButton(" 0 ");
        button0.setPreferredSize(numberButtons);
        JButton button1 = new JButton(" 1 ");
        button1.setPreferredSize(numberButtons);
        JButton button2 = new JButton(" 2 ");
        button2.setPreferredSize(numberButtons);
        JButton button3 = new JButton(" 3 ");
        button3.setPreferredSize(numberButtons);

        pannel0.add(button0);
        pannel1.add(button1);
        pannel2.add(button2);
        pannel3.add(button3);

        JPanel numberButtonsPannel = new JPanel();
        numberButtonsPannel.setLayout(new GridLayout(2,2));

        numberButtonsPannel.add(pannel0);
        numberButtonsPannel.add(pannel1);
        numberButtonsPannel.add(pannel2);
        numberButtonsPannel.add(pannel3);



        //Operations "+","-","*","/" (EAST)
        JPanel pannel_add = new JPanel();
        JPanel pannel_sub = new JPanel();
        JPanel pannel_div = new JPanel();
        JPanel pannel_mul = new JPanel();

        Dimension operationButtons = new Dimension(140, 60);
        JButton button_add = new JButton(" + ");
        button_add.setPreferredSize(operationButtons);
        JButton button_sub = new JButton(" - ");
        button_sub.setPreferredSize(operationButtons);
        JButton button_div = new JButton(" / ");
        button_div.setPreferredSize(operationButtons);
        JButton button_mul = new JButton(" * ");
        button_mul.setPreferredSize(operationButtons);

        pannel_add.add(button_add, BorderLayout.EAST);
        pannel_sub.add(button_sub, BorderLayout.EAST);
        pannel_div.add(button_div, BorderLayout.EAST);
        pannel_mul.add(button_mul, BorderLayout.EAST);

        JPanel operationsPannel = new JPanel();
        operationsPannel.setLayout(new GridLayout(4,1));

        operationsPannel.add(pannel_add, BorderLayout.EAST);
        operationsPannel.add(pannel_sub, BorderLayout.EAST);
        operationsPannel.add(pannel_div, BorderLayout.EAST);
        operationsPannel.add(pannel_mul, BorderLayout.EAST);



        // "=" (SOUTH)
        Dimension bottomButtons = new Dimension(260, 60);

        JPanel pannel_equals = new JPanel();
        JButton button_equals = new JButton(" = ");
        button_equals.setPreferredSize(bottomButtons);
        pannel_equals.add(button_equals);

        JPanel equal_pannel = new JPanel();
        equal_pannel.setLayout(new GridLayout(1,1));
        equal_pannel.add(pannel_equals);


        //Toggle (SOUTH)
        JPanel pannel_toggle = new JPanel();
        JButton button_toggle = new JButton(" toggle ");
        button_toggle.setPreferredSize(bottomButtons);
        pannel_toggle.add(button_toggle);

        JPanel toggle_pannel = new JPanel();
        toggle_pannel.setLayout(new GridLayout(1,1));
        toggle_pannel.add(pannel_toggle);

        JPanel bottomPannel = new JPanel();
        bottomPannel.add(equal_pannel);
        bottomPannel.add(toggle_pannel);

        ui.add(window,BorderLayout.NORTH);
        ui.add(numberButtonsPannel, BorderLayout.CENTER);
        ui.add(operationsPannel, BorderLayout.EAST);
        ui.add(bottomPannel, BorderLayout.SOUTH);
        ui.getLayeredPane();
        ui.pack();
        ui.setVisible(true);
    }

}
