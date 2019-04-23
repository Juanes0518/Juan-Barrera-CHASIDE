package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Datos {
	
	private String[] chaside;
	private File input;
	private FileReader lectura;
	private BufferedReader lector;

	
	
	public String[] Arreglo() throws IOException
	
	{
		
		lectura = new FileReader(input);
		
		lector = new BufferedReader(lectura);
		
		String cadena = lector.readLine();
		
for(int x=0;x<chaside.length && cadena!=null;x++)
			
		{
			chaside[x] = cadena+"\n";
			cadena = lector.readLine();
			
		}
		
		return chaside;
		
	}
		public Datos()
		{
			
			chaside = new String[99];
			
			input = new File("src/Preguntas.txt");
			
		}
		
	
	public String[] getChaside()
	
	{
		return chaside;
	}
}


