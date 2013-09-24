import compiler.lib.*;
import compiler.scanner.*;
import java.io.*;

public class Compiler{
	private static String[] options;

	public static void main(String[] args) {
		// Array indexes
		// 		0: <outname>
		// 		1: target stage
		// 		2: <optimization>
		// 		3: debug stage
		// 		4: help
		//		5: filename
		options = new String[6];
		int iOptIndex=-1;
		boolean bParametroEnviado=false;

		for (int i=0; i<args.length; i++) {
			switch (args[i]) {
				case "-h":
					options[4] = "true"; break;
				case "-o":
					iOptIndex=0; break;
				case "-target":
					Debug.target = args[i+1];
					iOptIndex=1; break;
				case "-opt":
					Debug.optimization = args[i+1];
					iOptIndex=2; break;
				case "-debug":
					iOptIndex=3; break;
				default:
				 	iOptIndex=-1; break; 
			}

			// Sí es parámetro válido
			if(iOptIndex >= 0){

				// Guardamos el valor rm parámetro en el arreglo de parámetros.
				options[iOptIndex] = args[i+1];
				bParametroEnviado = true;
			}
		}
		if(options[1] != null && !options[1].equals("") && !(options[1].equals("scan") || options[1].equals("parse") || options[1].equals("ast") || options[1].equals("semantic") || 
		   options[1].equals("irt") || options[1].equals("codegen")))
		{
			System.err.println("Error! La opcion -target tiene asignado un valor invalido.");
		}else{
			if(options[0] == null || options[0] == ""){
				options[0] = "default_output.txt";
			}

			if(args.length > 0){
				// Nombre de Archivo de entrada
				options[5] = args[args.length - 1];
			}

			if(!bParametroEnviado && options[5] == null){
				options[4] = "true";
			}

			String sAyuda ="";
			

			String[] sDebugStages;
			if(options[3] != null && options[3] != ""){
				sDebugStages = options[3].split(":");

				for (int i=0; i<sDebugStages.length; i++) {
					switch(sDebugStages[i]){
						case "scan": Debug.DebugScanner = true; break;
						case "parse": Debug.DebugParser = true; break;
						case "ast": Debug.DebugAST = true; break;
						case "semantic": Debug.DebugSemantic = true; break;
						case "irt": Debug.DebugIRT = true; break;
						case "codegen": Debug.DebugCodeGen = true; break;
						default: break;
					}
				}
			}

			// Si se debe mostrar la ayuda
			if(options[4] == "true" || options[5] == "" || options[5] == null){
				sAyuda+="-o <outname>		Escribir el output a un archivo de texto llamado <outname>.\n\n";
				sAyuda+="-target <stage>		Donde <stage> es uno de: scan, parse, ast, semantic, irt, codegen; la compilación debe proceder hasta la etapa indicada.\n\nPor ejemplo, si <stage> es scan, una instancia de scan debe ser creada imprimiendo en el archivo de salida \"stage: scanning\".\n\nSi es parse una instancia de parser debe ser creada a partir de la instancia de scanner imprimiendo \"stage: parsing'\", además rm mensaje de scanner y así sucesivamente.\n\n";
				sAyuda+="-opt <optimization>	<optimization> es uno de: constant, algebraic; la compilación debe hacer solo la optimización que se le pida, y debe imprimir como en -target \"optimizing: constant folding\" o \"optimizing: algebraic simplification\".\n\n";
				sAyuda+="-debug <stage>		Imprimir información de debugging. Debe haber un mensaje por cada etapa listada en <stage> de la forma \"Debugging <stage>\".\n<stage> tiene las mismas opciones de -target, con la diferencia que se pueden \"debuggear\" varias etapas, separandolas con ':' de la forma scan:parse:etc.\n\n";
				sAyuda+="-h			Muestra esta ayuda al usuario.";

				System.out.println(sAyuda);
			}else{
				Log.init(options[0]);
				File f = new File(options[5]);
				if(f.exists()) {
					Scanner scanner1 = new Scanner(options[5]);
					CC4Parser parser1 = new CC4Parser(scanner1);
					Ast ast1 = new Ast(parser1);
					Semantic semantic1 = new Semantic();

					if(Debug.target.equals("scan")){
						scanner1.scan();
					}else if(Debug.target.equals("parse"))
						parser1.parse();
					}else if(Debug.target.equals("ast")){
						ast1.start();
					}else if(Debug.target.equals("semantic")){

					}
				} else {
					Log.write("Archivo de entrada no existe");
					System.out.println("Archivo de entrada no existe");
				}

				Log.close();
			}
		}
	}
}