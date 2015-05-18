package figuras;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

import java.awt.BorderLayout;

public class Circulo extends Figura {

	private int raio = 0;

	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}

	public String imprime() {
		return "circulo[X:"+this.x+",Y:"+this.y+",raio:"+this.raio+"]";
	}

	public int getRaio() {
		return raio;
	}

	@Override
	public void desenha(Graphics g) {
		g.drawOval(x, y, raio * 2, raio * 2);
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
