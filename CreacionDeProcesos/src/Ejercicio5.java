import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoParaWindows = "CMD /C DIR";
		

		String comando = comandoParaWindows;
		Process p = null;
		try {
			p = rt.exec(comando);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		int status;
		BufferedReader br = null;
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " con el resultado de " + status);
			
			InputStream errorStream = p.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errorStream));
			
			String linea = "";
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
