make: Debug.class DecafLexer.java DecafLexer.class DecafParser.java DecafParser.class Scanner.class CC4Parser.class Ast.class Semantic.class Irt.class Algebraic.class ConstantFolding.class Codegen.class Compiler.class

Debug.class: lib/Debug.java
	javac lib/Debug.java

DecafLexer.java: scanner/DecafLexer.g
	java -jar /usr/local/lib/antlr-4.1-complete.jar scanner/DecafLexer.g

DecafLexer.class: scanner/DecafLexer.java
	javac scanner/DecafLexer.java

DecafParser.java: parser/DecafParser.g
	java -jar /usr/local/lib/antlr-4.1-complete.jar -visitor -lib "scanner/" "parser/DecafParser.g"

DecafParser.class: parser/DecafParser.java
	javac parser/DecafParser.java
	javac parser/DecafParserBaseVisitor.java

Scanner.class: scanner/Scanner.java
	javac scanner/Scanner.java

CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java

Ast.class: ast/Ast.java
	javac ast/Ast.java

Semantic.class: semantic/Semantic.java
	javac semantic/Semantic.java

Irt.class: irt/Irt.java
	javac irt/Irt.java

Algebraic.class: opt/Algebraic.java
	javac opt/Algebraic.java

ConstantFolding.class: opt/ConstantFolding.java
	javac opt/ConstantFolding.java

Codegen.class: codegen/Codegen.java
	javac codegen/Codegen.java

Compiler.class: Compiler.java
	javac Compiler.java

clean:
	rm Compiler.class
	rm scanner/Scanner.class
	rm parser/CC4Parser.class
	rm ast/Ast.class
	rm semantic/Semantic.class
	rm irt/Irt.class
	rm codegen/Codegen.class
	rm opt/Algebraic.class
	rm opt/ConstantFolding.class
	rm codegen/Codegen.class
	rm lib/Debug.class
	rm scanner/DecafLexer.java
	rm parser/DecafParser.java
	
win: 
	javac lib\Debug.java
	java -jar C:\Javalib\antlr-4.1-complete.jar scanner\DecafLexer.g
	javac scanner\DecafLexer.java
	java -jar C:\Javalib\antlr-4.1-complete.jar -visitor -lib "scanner\\" "parser\DecafParser.g"
	javac parser\DecafParser.java
	javac scanner\Scanner.java
	javac parser\CC4Parser.java
	javac ast\Ast.java
	javac semantic\Semantic.java
	javac irt\Irt.java
	javac opt\Algebraic.java
	javac opt\ConstantFolding.java
	javac codegen\Codegen.java
	javac Compiler.java

cleanwin:
	del Compiler.class
	del scanner\Scanner.class
	del parser\CC4Parser.class
	del ast\Ast.class
	del semantic\Semantic.class
	del irt\Irt.class
	del codegen\Codegen.class
	del opt\Algebraic.class
	del opt\ConstantFolding.class
	del codegen\Codegen.class
	del lib\Debug.class
	del scanner\DecafLexer.java
	del parser\DecafParser.java	