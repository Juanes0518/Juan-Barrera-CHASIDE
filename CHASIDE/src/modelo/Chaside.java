package modelo;

public class Chaside {
	
	private String resultados;
	private int[] interes;
	private int[] aptitud;
	private int[] datos;
	

	
	public Chaside() 
	
	{
		
		datos = new int[99];
		aptitud = new int[10];
		interes = new int[9];
		
		resultados = "TOTAL";
		
	}
	
	
	public int[] archivarDatos(int[] i)
	
	{
		
		
		return datos;
	}

	
	public String puntuarDatos()
	{
		
		return resultados;
		
	}

	
	public int[] getDatos() 
	{
		return datos;
	}
}


