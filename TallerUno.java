/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andres
 */
public class TallerUno {

    private String input;

    //Constructor
    public TallerUno(String input) {
        this.input = input;
    }

    public boolean validation() {

        int size = input.length();
        int index = 0;
        boolean acceptedState = true;

        //Inicia en q0
        if (index < size && input.charAt(index) == '0') {
            //Mueve a q1
            index += 1;
            while (index < size && input.charAt(index) == '0') {
                //Ciclo en q1
                index += 1;
            }
            if (index < size && input.charAt(index) == '1') {
                //Mueve a q2
                index += 1;
            } else {
                //Simbolo incorrecto
                acceptedState = false;
            }

        } else if (index < size && input.charAt(index) == '1') {
            //Mueve a q2
            index += 1;
        } else {
            //Simbolo incorrecto
            acceptedState = false;
        }

        //Estado q2
        while (index < size && acceptedState) {
            if (index < size && input.charAt(index) == '0') {
                //Mueve a q3
                index += 1;

                while (index < size && input.charAt(index) == '0') {
                    //Ciclo en q3
                    index += 1;
                }
                if (index < size && input.charAt(index) == '1') {
                    //Mueve a q4
                    index += 1;

                    if (index < size && input.charAt(index) == '1') {
                        //Mueve a q2
                        index += 1;
                    } else {
                        //Estado q4
                        while (index < size && acceptedState) {
                            if (index < size && input.charAt(index) == '0') {
                                //Mueve a q5
                                index += 1;
                                while (index < size && input.charAt(index) == '0') {
                                    //Ciclo en q5
                                    index += 1;
                                }
                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q4
                                    index += 1;
                                } else {
                                    //Simbolo incorrecto
                                    acceptedState = false;
                                }
                            } else {
                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q2
                                    index += 1;
                                    break;
                                } else {
                                    //Simbolo incorrecto
                                    acceptedState = false;
                                }

                            }
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
        }
        if (index != size) {
            acceptedState = false;
        }


        return acceptedState;
    }
}
