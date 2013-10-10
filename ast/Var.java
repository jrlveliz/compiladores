public class Var{
	public String id;
	public int length;
	public String style;
	public String type;

	public Var(String id, int length){
		this.style = "ARRAY";
		this.id = id;
		this.length = length;
	}

	public Var(String id){
		this.style = "VARIABLE";
		this.id = id;
	}

	public Var(String type, String id){
		this.style = "PARAMETRO";
		this.type = type;
		this.id = id;
	}
}