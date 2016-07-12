import javax.swing.JLabel;

public class JLabelFormated extends JLabel {
	
	public JLabelFormated(int x,int y,int altura,int largura, String nome){
		this.setBounds(x, y, altura, largura);
		this.setText(nome);
	}
}
