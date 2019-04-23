package modelo;

import java.io.IOException;

public class Mundo {

	private Chaside chaside;
	private Datos datos;
	
	public Mundo() throws IOException
	{
		
		chaside = new Chaside();
		datos = new Datos();
		
	}
		
	public Chaside getChaside()
	
	{
		return chaside;
	}
		
	public Datos getDatos()
	
	{
		return datos;
	}
}
