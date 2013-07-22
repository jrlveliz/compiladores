package compiladores.lib;
import java.io.*;

public class Log{
	private static PrintWriter out;

	public static void init(String sFileName){
		try{
			out = new PrintWriter(sFileName, "UTF-8");
		}catch(Exception ex){
			System.out.println("ERROR: No se ha podido crear el archivo de salida " + sFileName + ex.getMessage());
		}
	}

	public static void write(String text){
		if(out == null){
			System.out.println("ERROR: No se ha inicializado el módulo Log");
		}else{
			try{
				Debug.Always(text);
				out.println(text + "\r\n");
			}catch(Exception ex){
				System.out.println("ERROR: " + ex.getMessage());
			}
		}
	}

	public static void close(){
		if(out != null){
			try{
				out.close();
			}catch(Exception ex){
				System.out.println("ERROR: " + ex.getMessage());
			}
		}
	}
}