package homework10.p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    private JFrame frame;
    private JTextField textField;
    private String operator;
    private double tempFirst = Double.NaN;
    private double tempSecond = Double.NaN;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test window = new Test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Test() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 11, 364, 69);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "C",
                "0", ".", "="
        };

        int xPos = 10;
        int yPos = 91;
        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            button.setBounds(xPos, yPos, 89, 89);
            frame.getContentPane().add(button);
            button.addActionListener(new ButtonClickListener());

            xPos += 94;
            if ((i + 1) % 4 == 0) {
                xPos = 10;
                yPos += 94;
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "C":
                    textField.setText("");
                    tempFirst = Double.NaN;
                    tempSecond = Double.NaN;
                    operator = "";
                    break;
                case "=":
                    if (!Double.isNaN(tempFirst) && !operator.isEmpty()) {
                        tempSecond = Double.parseDouble(textField.getText());
                        double result = calculate(tempFirst, tempSecond, operator);
                        textField.setText(String.valueOf(result));
                        tempFirst = result;
                        operator = "";
                    }
                    break;
                case "+":
                case "-":
                    if (!Double.isNaN(tempFirst)) {
                        tempSecond = Double.parseDouble(textField.getText());
                        double result = calculate(tempFirst, tempSecond, operator);
                        textField.setText(String.valueOf(result));
                        tempFirst = result;
                    } else {
                        tempFirst = Double.parseDouble(textField.getText());
                    }
                    operator = command;
                    textField.setText("");
                    break;
                default:
                    textField.setText(textField.getText() + command);
                    break;
            }
        }
    }

    private double calculate(double first, double second, String op) {
        switch (op) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            default:
                return Double.NaN;
        }
    }
}
