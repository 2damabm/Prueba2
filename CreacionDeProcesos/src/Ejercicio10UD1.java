

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio10UD1 {

	public static void main(String[] args) {
		
		List<String> lCommandLinux = new ArrayList<String>();
		lCommandLinux.add("/bin/bash");
		lCommandLinux.add("-c");
		lCommandLinux.add("echo $MI_NOMBRE");
		
		List<String> lCommandWin = new ArrayList<String>();
		lCommandWin.add("CMD");
		lCommandWin.add("/C");
		lCommandWin.add("echo");
		lCommandWin.add("%MI_NOMBRE%");
		
		List<String> lCommand = null;
		
		if(System.getProperty("os.name").contains("Windows")) {
			lCommand = lCommandWin;
		}
		else {
			lCommand = lCommandLinux;
		}
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		Map<String, String> vEnt = pb.environment();
		vEnt.put("MI_NOMBRE", "JESUS");
		
		pb.inheritIO();
		
		try {
			pb.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
