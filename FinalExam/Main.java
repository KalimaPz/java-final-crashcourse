package FinalExam;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new Gui();
    }
}

class Gui extends JFrame {

    private JPanel JP1 = new JPanel();
    private JPanel JP2 = new JPanel();
   

    private JTextField ValueA = new JTextField(5);
    private JTextField ValueB = new JTextField(5);

    private JButton addButton = new JButton("Add");
    private JButton subButton = new JButton("Subtract");
    private JButton clearButton = new JButton("Clear");

    private JTextArea Result = new JTextArea();
    
    Gui(){
        setTitle("Final Exam");
        // JP1 Start
            JP1.setLayout(new GridLayout(1,2));
            JP1.add(ValueA);
            JP1.add(ValueB);

        // JP1 End
        // JP2 Start
            JP2.setLayout(new FlowLayout(FlowLayout.CENTER));
            JP2.add(addButton);
            JP2.add(subButton);
            JP2.add(clearButton);
        // JP2 End
        //  JFrame SetLayout
            setLayout(new GridLayout(3,1));
            add(JP1);
            add(JP2);
            add(Result);
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}