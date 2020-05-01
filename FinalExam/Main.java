package FinalExam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new Gui();
    }
}

class Gui extends JFrame implements ActionListener {

    private JPanel JP1 = new JPanel();
    private JPanel JP2 = new JPanel();
   

    private JTextField ValueA = new JTextField(5);
    private JTextField ValueB = new JTextField(5);

    private JButton addButton = new JButton("Add");
    private JButton subButton = new JButton("Subtract");
    private JButton clearButton = new JButton("Clear");

    private JTextArea Result = new JTextArea();

    JOptionPane Error = new JOptionPane();
    
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
                addButton.addActionListener(this);
            JP2.add(subButton);
                subButton.addActionListener(this);
            JP2.add(clearButton);
                clearButton.addActionListener(this);
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
    public int addNumber(int x , int y){
        return x + y;
    }
    public int subtract(int x, int y){
        return x - y;
    }
    void CheckInput() throws MaiTemException {
        if(ValueA.getText().equals("") || ValueB.getText().equals("")) {
            throw new MaiTemException();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
        CheckInput();
        int _Result = 0;
        int a , b;
            a = Integer.parseInt(ValueA.getText());
            b = Integer.parseInt(ValueB.getText());
        if(ae.getSource() == addButton) {
            _Result = addNumber(a,b);
            // System.out.println(Result);
            Result.append(ValueA.getText() + " + " + ValueB.getText() + " = " + Integer.toString(_Result)+"\n");
        }
        if(ae.getSource() == subButton) {
            _Result = subtract(a, b);
            Result.append(ValueA.getText() + " - " + ValueB.getText() + " = " + Integer.toString(_Result)+"\n");
        }
        if(ae.getSource() == clearButton){
            Result.setText("");
        }
        }

        catch(MaiTemException Mte){
            System.out.println("Mai Tem");
            Error.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException Nfe){
            System.out.println("Not Integer");
        }
    }
}