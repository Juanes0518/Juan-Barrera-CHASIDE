package controlador;

import java.io.IOException;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Interfaz itz;
	
	private Mundo md;
	
	public Controlador() throws IOException
	
	{
		
		itz = new Interfaz();
		md = new Mundo();
		this.ejecutar();
		
	}
	
	public void guardarArreglo() throws IOException
	
	{
		md.getDatos().Arreglo();
	}
	
	public void guardarDatos()
	
	{
		int[] tv = new int[99];
		String[] tst = md.getDatos().getChaside();
		for(int x=0;x<tst.length;x++)
			
		{
			
			tv[x] = itz.tomarDato(tst[x]);
			
		}
		
		md.getChaside().getDatos();
	}
		
	public void datosObtenidos()
	
	{
		itz.getMensaje(md.getChaside().puntuarDatos());
		
	}
	
	public void ejecutar() throws IOException
	
	{
		this.guardarArreglo();
		this.guardarDatos();
		this.datosObtenidos();
		
	}
}


