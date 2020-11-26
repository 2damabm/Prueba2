

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9UD1 {

	public static void main(String[] args) {

		List<String> listCommand = new ArrayList<String>();
		ProcessBuilder pb = new ProcessBuilder(listCommand);
		listCommand.add("ls");
		listCommand.add("src");

		File fileError = new File("salida_ejercicio9.txt");
		File fileOut = new File("log_ejercicio9.txt");

		int status;
		try {
			pb.redirectError(fileError);
			pb.redirectOutput(fileOut);

			Process p = pb.start();
			status = p.waitFor();
			if (status != 0) {
				System.out.println("HA FALLADO");
			} else {
				System.out.println("TODO OK JOSE LUIS ");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
