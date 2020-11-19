import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		String comandoParaWindows = "CMD /C DIR";
		

		String comando = comandoParaWindows;
		Process p = null;
		try {
			p = rt.exec(comando);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		int status = 0;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			status = p.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El comando " + comando + " con el resultado de " + status);
		
		InputStream errorStream = p.getErrorStream();
		br = new BufferedReader(new InputStreamReader(errorStream));

	}

}
