import javax.swing.*;

public class main{
    public static void main(String[] args){
        //System.out.println("Hello, java!");
        JFrame frame = new JFrame("hello cuties xoxo");
        JLabel label = new JLabel("hello cuties xoxo", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible( true );
    }
}