all : clean comp exec

comp :
	export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
	java -jar /usr/local/lib/antlr-4.7-complete.jar Ruby.g4
	javac *.java

exec :
	java org.antlr.v4.gui.TestRig Ruby prog ejemplos/programaEjemploSimple.rb -gui

clean :
	rm -f *.java *~
	rm -f *.class
	rm -f *.tokens