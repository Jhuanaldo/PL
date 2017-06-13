all : clean every_one

every_one : exec m1 m2 m3 m4 m5

ejemplo1 : exec m1

ejemplo2 : exec m2

ejemplo3 : exec m3

ejemplo4 : exec m4

ejemplo5 : exec m5


exec: clean
	export CLASSPATH=$CLASSPATH:/usr/share/java/cup.jar:/usr/share/java/cup.jar
	export CLASSPATH=$CLASSPATH:/usr/share/java/cup.jar:/usr/share/java/JLlex.jar
	jflex Lex.flex
	cup ruby.cup
	javac *.java -Xdiags:verbose

m1:
	java parser ejemplos/programaEjemplo.rb
m2:
	java parser ejemplos/programaEjemplo1.rb
m3:
	java parser ejemplos/programaEjemplo2.rb
m4:
	java parser ejemplos/programaEjemplo3.rb
m5:
	java parser ejemplos/programaEjemploSimple.rb

clean:
	rm -f Yylex.java *~
	rm -f parser.java
	rm -f Sym.java
	rm -f *.class
	rm -f *~