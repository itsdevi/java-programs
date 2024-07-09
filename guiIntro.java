import javax.swing.JOptionPane;
public class guiIntro {
    public static void main(String args[]){
        String name= JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"hello "+ name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
    }
}
