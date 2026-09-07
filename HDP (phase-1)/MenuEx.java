import javax.swing.*;

class MenuEx {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        m.add(new JMenuItem("Open"));
        m.add(new JMenuItem("Exit"));
        mb.add(m);
        f.setJMenuBar(mb);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
