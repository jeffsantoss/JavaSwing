import javax.swing.JTextField;

public class JNameTextField extends JTextField {
	
	private int qtd;
	int largura;
	int altura;
	
	public JNameTextField(int x, int y,int largura,int altura,int qtd,String nome)
	{
		 this.setText(nome);
		 this.setBounds(x, y, largura, altura);
		 this.setDocument(new MeuDocument(qtd));
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

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
