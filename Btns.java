import javax.swing.*;

class Btns {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JToggleButton t = new JToggleButton("ON/OFF");
        JRadioButton r1 = new JRadioButton("A");
        JRadioButton r2 = new JRadioButton("B");
        ButtonGroup g = new ButtonGroup();
        g.add(r1); g.add(r2);
        f.add(t); f.add(r1); f.add(r2);
        f.setLayout(new java.awt.FlowLayout());
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
