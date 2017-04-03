
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();
            TallerUno demo = new TallerUno(input);

            if (demo.validation()) { //If input is accepted
                bw.write("Cadena aceptada");
            } else { //Input is rejected
                bw.write("Cadena rechazada");
            }
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
