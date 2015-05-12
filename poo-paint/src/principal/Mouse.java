package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import figuras.Figura;
import figuras.Retangulo;

public class Mouse extends MouseAdapter{
	private AreaDeDesenho area2;
	public Mouse(AreaDeDesenho area){
		this.area2 = area;
		
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		Retangulo ret1 = new Retangulo(e.getX(), e.getY(), 100, 80);
		this.area2.adicionarFigura(ret1);
		
		
		
	}
	
	
	
	
	
	
	
	

}
