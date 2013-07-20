make: lib\Debug.class scanner\Scanner.class parser\CC4Parser.class Compiler.class

Compiler.class: Compiler.java
	javac Compiler.java

parser\CC4Parser.class: parser\CC4Parser.java
	javac parser\CC4Parser.java

scanner\Scanner.class: scanner\Scanner.java
	javac scanner\Scanner.java

lib\Debug.class: lib\Debug.java
	javac lib\Debug.java

clean:
	del Compiler.class
	del parser\CC4Parser.class
	del scanner\Scanner.class
	del lib\Debug.class