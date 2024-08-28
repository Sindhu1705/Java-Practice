import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/* Jframe is used to create a main Window for the GUI application*/

public class WordCounter extends JFrame implements ActionListener{
JTextArea jt;
JButton b1,b2;
JScrollPane sp;
WordCounter()
{
super("Finding the word COunt");
jt = new JTextArea();
jt.setBounds(60,60,350,250);
jt.setMargin(new Insets(10,15,10,10));

sp=new JScrollPane(jt);
sp.setBounds(60,60,350,250);


b1 = new JButton("Word");
b1.setBounds(100,350,140,40);
b1.setForeground(Color.blue);
b2= new JButton("Charac");
b2.setBounds(230,350,140,40);
b2.setForeground(Color.blue);

b1.addActionListener(this);
b2.addActionListener(this);
add(b1);add(b2);add(sp);
//add(jt);

setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent a){
String text = jt.getText();
if(a.getSource()==b1){
/* regular expression to split the given string by using the space as a seperator*/
String w[]=text.split("\\s");
JOptionPane.showMessageDialog(this,"Total Words"+w.length);
}
if(a.getSource()== b2){
JOptionPane.showMessageDialog(this,"Total characters with spaces"+text.length());
}
}

public static void main(String args[]){
new WordCounter();
}
}




