/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruby;

import analizadores.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ordenador
 */
public class Ruby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream fichero;
        DataInputStream entrada;
        try {
            
            fichero = new FileInputStream("src/entrada.txt");
            entrada = new DataInputStream(fichero);
            new parser(new Yylex(new BufferedReader(
                    new InputStreamReader(entrada)))).parse();

        } catch (Exception ex) {
            Logger.getLogger(Ruby.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void generar() {
        Process p;
        try {
            p = Runtime.getRuntime().exec(new String[]{"src/analizadores/ejecutar.sh"}, null);
            p.waitFor();
 
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Ruby.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
