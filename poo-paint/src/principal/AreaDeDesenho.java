package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import figuras.Figura;

public class AreaDeDesenho extends JPanel {

	List<Figura> figuras = new ArrayList<Figura>();
	
	public void adicionarFigura(Figura figura){
		figuras.add(figura);
		this.repaint();
	}
		
	
		public AreaDeDesenho(List<Figura> figura) {
		this.figuras = figura;
		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
			for (Figura f : figuras) {
			f.desenha(g);
		}
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
