all : borrar ejecutar

borrar:
	rm analex.class
	rm analex.java

ejecutar: 
	jflex Lex.flex
	javac analex.java
	@echo ------------------------------------------- EJEMPLO 1 -------------------------------------------
	java analex programaEjemplo1.rb
	@echo ------------------------------------------- EJEMPLO 2 -------------------------------------------
	java analex programaEjemplo2.rb
	@echo ------------------------------------------- EJEMPLO 3-------------------------------------------
	java analex programaEjemplo3.rb

1:
	jflex Lex.flex
	javac analex.java
	java analex programaEjemplo1.rb
2:
	jflex Lex.flex
	javac analex.java
	java analex programaEjemplo2.rb
3:
	jflex Lex.flex
	javac analex.java
	java analex programaEjemplo3.rb
