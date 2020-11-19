import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoParaWindows = "CMD /C DIRRR";
	

		String comando = comandoParaWindows;
		Process p = null;
		try {
			p = rt.exec(comando);
			
	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int status;
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " con el resultado de " + status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
