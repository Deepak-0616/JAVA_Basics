import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame implements ActionListener {
    JTextField t = new JTextField();
    double a, b; char op;

    Calc() {
        setLayout(new GridLayout(4, 4));
        add(t);
        String s[] = {"0","1","2","3","+","-","4","5","6","*","/","7","8","9","0","%","="};
        for (String i : s) {
            JButton b = new JButton(i);
            b.addActionListener(this);
            add(b);
        }
        setSize(800, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String x = e.getActionCommand();
        if ("+-*/%".contains(x)) {
            a = Double.parseDouble(t.getText());
            op = x.charAt(0);
            t.setText("");
        } else if (x.equals("=")) {
            b = Double.parseDouble(t.getText());
            t.setText("" + (op == '+' ? a + b : op == '-' ? a - b :
                            op == '*' ? a * b : op == '/' ? a / b : a % b));
        } else
            t.setText(t.getText() + x);
    }
    public static void main(String[] args) {
        new Calc();
    }
}
