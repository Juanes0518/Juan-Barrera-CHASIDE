package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	public Interfaz()
	{
		
	}
	public int tomarDato(String mensaje)
	{
		int tst = JOptionPane.showConfirmDialog(null, mensaje,"CHASIDE",JOptionPane.YES_NO_OPTION);
		return tst;
	}
	
	public void getMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje,"Resultado Final",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}

