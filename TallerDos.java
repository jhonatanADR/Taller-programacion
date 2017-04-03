public class TallerDos {

    private String input;

    //Constructor
    public TallerDos(String input) {
        this.input = input;
    }

    //This method simulates the behavior of the string on the automata
    public boolean validation() {

        int size = input.length();
        int index = 0;
        boolean acceptedState = true;

        //Inicia en qo
        if (index < size && input.charAt(index) == 'b') {
            //Mueve a q4
            index += 1;

            if (index < size && input.charAt(index) == 'a') {
                //Mueve a q2
                index += 1;

            } else {
                if (index < size && input.charAt(index) == 'b') {
                    //Mueve a q3
                    index += 1;

                    while (index < size && input.charAt(index) == 'b') {
                        //loop en q3
                        index += 1;
                    }
                    if (index < size && input.charAt(index) == 'a') {
                        //Mueve a q1
                        index += 1;

                        if (index < size && input.charAt(index) == 'a') {
                            //Mueve a q2
                            index += 1;
                        } else {
                            //Simbolo incorrecto
                            acceptedState = false;
                        }

                    } else {
                        //Simbolo incorrecto
                        acceptedState = false;
                    }

                } else {
//                    if (index == size) {
//                        acceptedState = true;
//                    } else {
//                        //Simbolo incorrecto
//                        acceptedState = false;
//                    }
                }
            }
            //q2
            while (index < size && acceptedState && (input.charAt(index) == 'a' || input.charAt(index) == 'b')) {

                //loop q2
                index += 1;
            }

            if (index != size) {
                acceptedState = false;
            }
        } else {
            //Simbolo incorrecto
            acceptedState = false;
        }

        return acceptedState;
    }
}
