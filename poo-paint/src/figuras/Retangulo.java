package figuras;

import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Retangulo extends Figura {

	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		super(x, y);
		this.altura = altura;
		this.largura = largura;
	}

	public String imprime() {
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}

	@Override
	public void desenha(Graphics g) {
		g.drawRect(x, y, largura, altura);
	}
	
	
	JToolBar barraDeFerramentas = new JToolBar("Barra de Ferramentas"); 
	painelPrincipal.add(barraDeFerramentas, BorderLayout.PAGE_START);
	
	JPanel painelPrincipal = new JPanel();
	painelPrincipal.setLayout(new BorderLayout());
	
	
	
	ButtonGroup grupoDeBotoes = new ButtonGroup(); 
	JToggleButton botaoRetangulo = new JToggleButton("Retangulo"); 
	//botaoRetangulo.addActionListener(/* Aqui vem um ActionListener */); 
	botaoRetangulo.getModel().setPressed(true); 
	grupoDeBotoes.add(botaoRetangulo);
	
	
	barraDeFerramentas.add(botaoRetangulo); 
	barraDeFerramentas.setFloatable(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
