import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejercicio2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoParaWindows = "CMD /C DIR";
		String linea;
		
		String comando = comandoParaWindows;
		Process p = null;
		try {
			p = rt.exec(comando);
			InputStream is = p.getInputStream();
			// lee todos los caracter de la lina y hace un conversion
			BufferedReader flujo = new BufferedReader(new InputStreamReader(is));
			
			// mientras que linea sea distinto a null lee la linea
			while((linea = flujo.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
