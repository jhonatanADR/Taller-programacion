/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andres
 */
public class TallerCuatro {

    private String input;

    //Constructor
    public TallerCuatro(String input) {
        this.input = input;
    }

    public boolean validation() {

        int size = input.length();
        int index = 0;
        boolean acceptedState = true;

        //Inicia en q0
        if (index < size && input.charAt(index) == 'b') {
            //Mueve a q1

            index += 1;
            while (index < size && acceptedState && input.charAt(index) == 'b') {
                //Ciclo en q1

                index += 1;
            }
            if (index < size && input.charAt(index) == 'a') {
                //Mueve a q2
                index += 1;

                if (index < size && input.charAt(index) == 'b') {
                    //Mueve a q3
                    index += 1;

                    while (index < size && acceptedState && input.charAt(index) == 'b') {
                        //Ciclo en q3
                        index += 1;
                    }

                } 

            } else {
                //Simbolo incorrecto
                acceptedState = false;
            }

        } else {
            //Simbolo incorrecto
            acceptedState = false;

        }

        if (index != size) {
            acceptedState = false;
        }

        return acceptedState;
    }

}
