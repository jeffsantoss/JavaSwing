import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonFormated extends JButton {
	
	private	int x;
	private	int y;
	private	int largura;
	private	int altura;
	private	ImageIcon img;
	private	String	nome;
	
	// Criar botão com imagem
	public JButtonFormated(int x,int y,int largura,int altura,String nome,ImageIcon img)
	{
		this.setBounds(x,y,largura, altura);
		this.setText(nome);
		this.setIcon(img);
	}
	
	// Criar botão sem imagem
	public JButtonFormated(int x,int y,int largura,int altura,String nome)
	{
		this.setBounds(x, y,largura, altura);
		this.setText(nome);
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public ImageIcon getImg() {
		return img;
	}
	public void setImg(ImageIcon img) {
		this.img = img;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
