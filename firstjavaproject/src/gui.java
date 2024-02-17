import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hi!, "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Your age: "+age);
    }
}
