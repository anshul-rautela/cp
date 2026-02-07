import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField display;
    private double result = 0;
    private String lastCommand = "=";
    private boolean start = true;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Start with display field
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);

        // Create and add button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Add buttons
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
            if (Character.isDigit(label.charAt(0)) || label.equals(".")) {
                button.addActionListener(new NumberListener());
            } else {
                button.addActionListener(new OperatorListener());
            }
        }

        // Add clear button
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(e -> {
            start = true;
            result = 0;
            lastCommand = "=";
            display.setText("0");
        });
        
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(clearButton);
        
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        
        add(mainPanel, BorderLayout.CENTER);
        
        // Set frame properties
        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    private class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText(input);
                start = false;
            } else {
                display.setText(display.getText() + input);
            }
        }
    }

    private class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (!start) {
                calculate();
                lastCommand = event.getActionCommand();
                start = true;
            }
        }
    }

    public void calculate() {
        double x = Double.parseDouble(display.getText());
        switch(lastCommand) {
            case "+": result += x; break;
            case "-": result -= x; break;
            case "*": result *= x; break;
            case "/": result /= x; break;
            case "=": result = x; break;
        }
        display.setText("" + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
} 