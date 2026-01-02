import javax.swing.*;

class ComboCheck {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JComboBox c = new JComboBox(new String[]{"A", "B", "C"});
        JCheckBox ch1 = new JCheckBox("Java");
        JCheckBox ch2 = new JCheckBox("Python");
        f.add(c); f.add(ch1); f.add(ch2);
        f.setLayout(new java.awt.FlowLayout());
        f.setSize(800, 800);
        f.setVisible(true);
    }
}
