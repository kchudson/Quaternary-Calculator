import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserInterface {
    static String input = " ";

    //Ideally these two lines would be in a separate interface class.
    Calculator calculator = new Calculator();
    final static int number_of_digits = 8;

    public static void main(String[] args) {

        JFrame ui = new JFrame("Quaternary Calculator");
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.setSize(600, 800);

        ui.setLayout(new BorderLayout());

        //Visible Display...

        JPanel window = new JPanel();
        window.setPreferredSize(new Dimension(600, 100));
        JTextField display;
        window.add(display = new JTextField(number_of_digits));
        display.setText(" ");
        display.setEditable(false);

        //

        //JOptionPane window = new JOptionPane();


        //4 Button Panel
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        Dimension numberButtons = new Dimension(160, 200);
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

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" 0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" 1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" 2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" 3");
            }
        });


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

        Dimension operationButtons = new Dimension(100, 90);
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

        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" +");
            }
        });
        button_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" -");
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" /");
            }
        });
        button_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" *");
            }
        });

        JPanel operationsPanel = new JPanel();
        operationsPanel.setLayout(new GridLayout(4, 1));

        operationsPanel.add(panel_add, BorderLayout.EAST);
        operationsPanel.add(panel_sub, BorderLayout.EAST);
        operationsPanel.add(panel_div, BorderLayout.EAST);
        operationsPanel.add(panel_mul, BorderLayout.EAST);


        //WEST (square and square root)
        JPanel squareRootPanel = new JPanel();
        JPanel squarePanel = new JPanel();
        JButton squareRootButton = new JButton("√");
        JButton squareButton = new JButton("^2");

        squareRootPanel.add(squareRootButton);
        squarePanel.add(squareButton);

        Dimension LeftButtons = new Dimension(100, 200);
        squareRootButton.setPreferredSize(LeftButtons);
        squareButton.setPreferredSize(LeftButtons);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(2, 1));

        leftPanel.add(squareRootPanel);
        leftPanel.add(squarePanel);

        squareRootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" √");
            }
        });
        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" ^2");
            }
        });



        // "=" (SOUTH)
        Dimension bottomButtons = new Dimension(260, 60);

        JPanel panel_equals = new JPanel();
        JButton button_equals = new JButton(" = ");
        button_equals.setPreferredSize(bottomButtons);
        panel_equals.add(button_equals);

        JPanel equal_panel = new JPanel();
        equal_panel.setLayout(new GridLayout(1, 1));
        equal_panel.add(panel_equals);

        button_equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+" =");
            }
        });

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

        button_toggle.addActionListener(new ListenToggle());



        Font numberFont = new Font("Arial", Font.PLAIN, 40);
        Font operationsFont = new Font("Arial", Font.PLAIN, 30);
        Font lowerButtonsFont = new Font("Arial", Font.PLAIN, 30);
        Font leftButtonsFont = new Font("Arial", Font.PLAIN, 40);
        button0.setFont(numberFont);
        button1.setFont(numberFont);
        button2.setFont(numberFont);
        button3.setFont(numberFont);
        button_add.setFont(operationsFont);
        button_sub.setFont(operationsFont);
        button_mul.setFont(operationsFont);
        button_div.setFont(operationsFont);
        button_equals.setFont(lowerButtonsFont);
        button_toggle.setFont(lowerButtonsFont);
        squareRootButton.setFont(leftButtonsFont);
        squareButton.setFont(leftButtonsFont);















        ui.add(window, BorderLayout.NORTH);
        ui.add(numberButtonsPanel, BorderLayout.CENTER);
        ui.add(leftPanel, BorderLayout.WEST);
        ui.add(operationsPanel, BorderLayout.EAST);
        ui.add(bottomPanel, BorderLayout.SOUTH);
        ui.getLayeredPane();
        ui.pack();
        ui.setVisible(true);
    }


    static class ListenZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           input += "0";
           input.;
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
                if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*'
                && input.charAt(input.length() - 1) != '/')
                input += "+";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenSub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*'
                        && input.charAt(input.length() - 1) != '/')
                    input += "-";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenMul implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*'
                        && input.charAt(input.length() - 1) != '/')
                    input += "*";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }
    static class ListenDiv implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                if (input.charAt(input.length() - 1) != '+' && input.charAt(input.length() - 1) != '-' && input.charAt(input.length() - 1) != '*'
                        && input.charAt(input.length() - 1) != '/')
                    input += "/";}
            //replace line with actual actual code
            System.out.println(input);
        }
    }


    static class ListenEqual implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){
                Calculator calculate = new Calculator();
                if (input.charAt(input.length() - 1) != '=')
                    System.out.println(calculate.splitInput(input));
                    input = "";
            }
        }
    }

    static class ListenToggle implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           // if (!input.equals("")){
               // Calculator calculate = new Calculator();
                //if (input.charAt(input.length() - 1) != '=')
                    //if (input)
                    //System.out.println(calculate.splitInput(input));
           // }
            //System.out.println(input);
        }
    }


    static class ListenSquareRoot implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){ input += "^2";
                Calculator calculate = new Calculator();
                System.out.println(calculate.squareRoot(input));
            }
            //replace line with actual actual code
            System.out.println(input);
        }
    }

    static class ListenSquare implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!input.equals("")){ input += "^2";
                Calculator calculate = new Calculator();
                System.out.println(calculate.square(input));
            }
            System.out.println(input);
        }
    }





}