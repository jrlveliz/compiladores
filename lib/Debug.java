package compiladores.lib;

public class Debug{
	public static boolean DebugScanner = false;
	public static boolean DebugParser = false;
	public static boolean DebugAST = false;
	public static boolean DebugIRT = false;
	public static boolean DebugOpt = false;
	public static boolean DebugCodeGen = false;
	public static boolean DebugSemantic = false;
	public static String target = "";

	public static void print(String sDebugText, String sStage){
		if(
			(sStage == "scan" && DebugScanner) ||
			(sStage == "parse" && DebugParser) ||
			(sStage == "semantic" && DebugSemantic) ||
			(sStage == "irt" && DebugIRT) ||
			(sStage == "codegen" && DebugCodeGen) ||
			(sStage == "ast" && DebugAST)
		)
			System.out.println(sDebugText);
	}

	public static void Always(String text){
		System.out.println(text);
	}
}