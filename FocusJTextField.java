import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusJTextField extends JFrame {

JTextField field1;
JTextField field2;
JPanel panel;

 public FocusJTextField() {
	 
  super( "This is my Frame" );
  panel = new JPanel();
  field1 = new JTextField( 10 );
  field2 = new JTextField( 10 );
  field1.addFocusListener(new Focus(field1,"Text here",""));
  
  panel.add( new JLabel("Field 1:"));
  panel.add( field1 );
  panel.add( new JLabel("Field 2:"));
  panel.add( field2 );
  getContentPane().add( "Center", panel );
  addWindowListener( new WindowAdapter() {
   public void windowOpened( WindowEvent e ){
        field1.requestFocus();
     }
   } ); 
  pack();
  setVisible( true );
  }
 
 	public static void main(String[] args) {
	 	new FocusJTextField();
 }
}

