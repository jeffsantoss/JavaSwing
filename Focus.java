import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class Focus implements FocusListener {
	
	private JTextField field;
	private	String	gained;
	private	String	lost;
	private	Color	gainedColor;
	private Color	lostColor;
	
	public Focus(JTextField a,String gained, String lost)
	{	
		this.field = a;
		this.setGained(gained);
		this.setLost(lost);
	}

	public JTextField getField() {
		return field;
	}

	public void setField(JTextField field) {
		this.field = field;
	}

	public String getGained() {
		return gained;
	}

	public void setGained(String gained) {
		this.gained = gained;
	}

	public String getLost() {
		return lost;
	}

	public void setLost(String lost) {
		this.lost = lost;
	}

	public Color getGainedColor() {
		return gainedColor;
	}

	public void setGainedColor(Color gainedColor) {
		this.gainedColor = gainedColor;
	}

	public Color getLostColor() {
		return lostColor;
	}

	public void setLostColor(Color lostColor) {
		this.lostColor = lostColor;
	}

	public void focusGained(FocusEvent arg0) {
		field.setText(this.getLost());
		field.setForeground(this.getLostColor());
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		field.setText(this.getGained());
		field.setForeground(this.getGainedColor());
	}	
	
}
