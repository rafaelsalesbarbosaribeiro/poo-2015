package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

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

}
