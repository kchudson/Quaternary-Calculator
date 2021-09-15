import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserInterface {
    static String input = "";


    public static void main(String[] args) {



        JFrame ui = new JFrame("Quaternary Calculator");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setSize(600, 800);

        ui.setLayout(new BorderLayout());

        //Visible Display...

        JPanel window = new JPanel();
        window.setPreferredSize(new Dimension(600, 100));
        JTextField display;
        window.add(display = new JTextField(8));
        display.setEditable(false);

        //

        //JOptionPane window = new JOptionPane();


        //4 Button Panel
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        Dimension numberButtons = new Dimension(200, 200);
        JButton button0 = new JButton(" 0 ");
        button0.setPreferredSize(numberButtons);
        JButton button1 = new JButton(" 1 ");
        button1.setPreferredSize(numberButtons);
        JButton button2 = new JButton(" 2 ");
        button2.setPreferredSize(numberButtons);
        JButton button3 = new JButton(" 3 ");
        button3.setPreferredSize(numberButtons);


        panel0.add(button0);
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);

        button0.addActionListener(new ListenZero());
        button1.addActionListener(new ListenOne());
        button2.addActionListener(new ListenTwo());
        button3.addActionListener(new ListenThree());


        JPanel numberButtonsPanel = new JPanel();
        numberButtonsPanel.setLayout(new GridLayout(2, 2));


        numberButtonsPanel.add(panel0);
        numberButtonsPanel.add(panel1);
        numberButtonsPanel.add(panel2);
        numberButtonsPanel.add(panel3);


        //Operations "+","-","*","/" (EAST)
        JPanel panel_add = new JPanel();
        JPanel panel_sub = new JPanel();
        JPanel panel_div = new JPanel();
        JPanel panel_mul = new JPanel();

        Dimension operationButtons = new Dimension(140, 60);
        JButton button_add = new JButton(" + ");
        button_add.setPreferredSize(operationButtons);
        JButton button_sub = new JButton(" - ");
        button_sub.setPreferredSize(operationButtons);
        JButton button_div = new JButton(" / ");
        button_div.setPreferredSize(operationButtons);
        JButton button_mul = new JButton(" * ");
        button_mul.setPreferredSize(operationButtons);

        panel_add.add(button_add, BorderLayout.EAST);
        panel_sub.add(button_sub, BorderLayout.EAST);
        panel_div.add(button_div, BorderLayout.EAST);
        panel_mul.add(button_mul, BorderLayout.EAST);

        button_add.addActionListener(new ListenAdd());
        button_sub.addActionListener(new ListenSub());
        button_div.addActionListener(new ListenDiv());
        button_mul.addActionListener(new ListenMul());

        JPanel operationsPanel = new JPanel();
        operationsPanel.setLayout(new GridLayout(4, 1));

        operationsPanel.add(panel_add, BorderLayout.EAST);
        operationsPanel.add(panel_sub, BorderLayout.EAST);
        operationsPanel.add(panel_div, BorderLayout.EAST);
        operationsPanel.add(panel_mul, BorderLayout.EAST);


        // "=" (SOUTH)
        Dimension bottomButtons = new Dimension(260, 60);

        JPanel panel_equals = new JPanel();
        JButton button_equals = new JButton(" = ");
        button_equals.setPreferredSize(bottomButtons);
        panel_equals.add(button_equals);

        JPanel equal_panel = new JPanel();
        equal_panel.setLayout(new GridLayout(1, 1));
        equal_panel.add(panel_equals);


        //Toggle (SOUTH)
        JPanel panel_toggle = new JPanel();
        JButton button_toggle = new JButton(" toggle ");
        button_toggle.setPreferredSize(bottomButtons);
        panel_toggle.add(button_toggle);

        JPanel toggle_panel = new JPanel();
        toggle_panel.setLayout(new GridLayout(1, 1));
        toggle_panel.add(panel_toggle);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(equal_panel);
        bottomPanel.add(toggle_panel);

        ui.add(window, BorderLayout.NORTH);
        ui.add(numberButtonsPanel, BorderLayout.CENTER);
        ui.add(operationsPanel, BorderLayout.EAST);
        ui.add(bottomPanel, BorderLayout.SOUTH);
        ui.getLayeredPane();
        ui.pack();
        ui.setVisible(true);
    }

    static class ListenZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           input += "0";
            //replace line with actual actual code
            System.out.println(input);
        }
    }

    static class ListenOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input += "1";
            //replace line with actual actual code
            System.out.println(input);
        }

    }

     static class ListenTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input += "2";
            //replace line with actual actual code
            System.out.println(input);
        }
    }

     static class ListenThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input += "3";
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '+')
                input += "+";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenSub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '-')
                    input += "-";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenMul implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '*')
                    input += "*";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenDiv implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '/')
                    input += "/";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
}