import java.awt.*;
import java.awt.event.*;
public class ButtonExample
{
public static void main(String []args)
{

Frame f=new Frame("button example");
final TextField tf=new TextField();
tf.setBounds(40,40,160,30);
 Button b=new Button("Click here");
b.setBounds(40,80,60,30);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{

tf.setText("welcomme to java");

}
}
);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{

System.exit(0);
}
}
);
f.add(b);
f.add(tf);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);


}
}
