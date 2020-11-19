import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio8 {

	public static void main(String[] args) {
		ProcessBuilder proceso = new ProcessBuilder();
		Map<String, String> variable = proceso.environment();
		System.out.println(variable);

		List<String> commando = new ArrayList<String>();
		
		commando.add("CMD");
		commando.add("/C");
		commando.add("DIRR");
		
		ProcessBuilder process = new ProcessBuilder(commando);
		System.out.println(process.command());
		
		try {
			process.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
