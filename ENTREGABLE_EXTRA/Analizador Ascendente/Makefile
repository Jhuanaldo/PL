all : clean every_one

every_one : exec m1

ejemplo1 : exec m1


exec: clean
	# export CLASSPATH=$CLASSPATH:/usr/share/java/cup.jar:/usr/share/java/cup.jar
	# export CLASSPATH=$CLASSPATH:/usr/share/java/cup.jar:/usr/share/java/JLlex.jar
	jflex Lex.flex
	cup ruby.cup
	javac *.java

m1:
	java parser ejemplos/programaEjemploSimple.rb

clean:
	rm -f Yylex.java *~
	rm -f parser.java
	rm -f sym.java
	rm -f *.class
	rm -f *~