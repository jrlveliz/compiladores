make: lib\Debug.class scanner\Scanner.class parser\CC4Parser.class ast\Ast.class semantic\Semantic.class irt\Irt.class codegen\Codegen.class Compiler.class

Compiler.class: Compiler.java
	javac Compiler.java

ast\Ast.class: ast/Ast.java
	javac ast/Ast.java

parser\CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java

scanner\Scanner.class: scanner/Scanner.java
	javac scanner/Scanner.java

semantic\Semantic.class: semantic/Semantic.java
	javac semantic/Semantic.java

irt\Irt.class: irt/Irt.java
	javac irt/Irt.java

codegen\Codegen.class: codegen/Codegen.java
	javac codegen/Codegen.java

lib\Debug.class: lib/Debug.java
	javac lib/Debug.java

clean:
	rm Compiler.class
	rm scanner/Scanner.class
	rm parser/CC4Parser.class
	rm ast/Ast.class
	rm semantic/Semantic.class
	rm irt/Irt.class
	rm codegen/Codegen.class
	rm lib/Debug.class