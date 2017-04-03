/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andres
 */
public class TallerTres {

    private String input;

    //Constructor
    public TallerTres(String input) {
        this.input = input;
    }

    public boolean validation() {
        int size = input.length();
        int index = 0;
        boolean acceptedState = true;
        int[] estadoFin = {1, 2, 3};
        int estadoAcutal = 0;

        //Inicia en q0
        if (index < size && input.charAt(index) == '0') {
            //Mueve a q1
            estadoAcutal = 1;
            index += 1;
            while (index < size && acceptedState && estadoAcutal == 1) {
                if (index < size && input.charAt(index) == '0') {
                    //Mueve a q2
                    estadoAcutal = 2;
                    index += 1;
                    if (index < size && input.charAt(index) == '0') {
                        //Mueve a q1
                        estadoAcutal = 1;
                        index += 1;
                    } else {
                        //Estado q2
                        while (index < size && acceptedState && estadoAcutal == 2) {
                            if (index < size && input.charAt(index) == '1') {
                                //Mueve a q3
                                estadoAcutal = 3;
                                index += 1;

                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q2
                                    estadoAcutal = 2;
                                    index += 1;
                                } else {
                                    //Estado q3   

                                    while (index < size && acceptedState && estadoAcutal == 3) {
                                        if (index < size && input.charAt(index) == '0') {
                                            //Mueve a q4
                                            estadoAcutal = 4;
                                            index += 1;
                                            if (index < size && input.charAt(index) == '0') {
                                                //Mueve a q3
                                                estadoAcutal = 3;
                                                index += 1;
                                            } else {
                                                if (index < size && input.charAt(index) == '1') {
                                                    //Mueve a q1
                                                    estadoAcutal = 1;
                                                    System.out.println("si");
                                                    index += 1;
                                                } else {
                                                    //Simbolo incorrecto
                                                    acceptedState = false;
                                                }
                                            }

                                        } else {
                                            if (index < size && input.charAt(index) == '1') {
                                                //Mueve a q2
                                                estadoAcutal = 2;
                                                index += 1;
                                            } else {
                                                acceptedState = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (index < size && input.charAt(index) == '0') {
                                    //Mueve a q1
                                    estadoAcutal = 1;
                                    index += 1;
                                } else {
                                    acceptedState = false;
                                }
                                //Simbolo incorrecto

                            }
                        }
                    }
                } else if (index < size && input.charAt(index) == '1') {
                    //Mueve a q4
                    estadoAcutal = 4;
                    index += 1;
                    if (index < size && input.charAt(index) == '1') {
                        //Mueve a q1
                        estadoAcutal = 1;
                        index += 1;
                    } else {
                        //Estado q4
                        while (index < size && acceptedState && estadoAcutal == 4) {
                            if (index < size && input.charAt(index) == '0') {
                                //Mueve a q3
                                estadoAcutal = 3;
                                index += 1;

                                if (index < size && input.charAt(index) == '0') {
                                    //Mueve a q4
                                    estadoAcutal = 4;
                                    index += 1;
                                } else {
                                    //Estado q3     
                                    while (index < size && acceptedState && estadoAcutal == 3) {
                                        if (index < size && input.charAt(index) == '1') {
                                            //Mueve a q2
                                            estadoAcutal = 2;
                                            index += 1;
                                            if (index < size && input.charAt(index) == '1') {
                                                //Mueve a q3
                                                estadoAcutal = 3;
                                                index += 1;
                                            } else {
                                                if (index < size && input.charAt(index) == '0') {
                                                    //Mueve a q1
                                                    estadoAcutal = 1;
                                                    index += 1;
                                                } else {
                                                    //Simbolo incorrecto
                                                    acceptedState = false;
                                                }
                                            }

                                        } else {
                                            if (index < size && input.charAt(index) == '0') {
                                                //Mueve a q4
                                                estadoAcutal = 4;
                                                index += 1;
                                            } else {
                                                //Simbolo incorrecto
                                                acceptedState = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q1
                                    estadoAcutal = 1;
                                    index += 1;
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
            }
        } else if (index < size && input.charAt(index) == '1') {
            //Mueve a q3
            estadoAcutal = 3;
            index += 1;
            while (index < size && acceptedState && estadoAcutal == 3) {
                if (index < size && input.charAt(index) == '0') {
                    //Mueve a q4
                    estadoAcutal = 4;
                    index += 1;
                    if (index < size && input.charAt(index) == '0') {
                        //Mueve a q3
                        estadoAcutal = 3;
                        index += 1;
                    } else {
                        //Estado q4
                        while (index < size && acceptedState && estadoAcutal == 4) {
                            if (index < size && input.charAt(index) == '1') {
                                //Mueve a q1
                                estadoAcutal = 1;
                                index += 1;

                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q4
                                    estadoAcutal = 4;
                                    index += 1;
                                } else {
                                    //Estado q1     
                                    while (index < size && acceptedState && estadoAcutal == 1) {
                                        if (index < size && input.charAt(index) == '0') {
                                            //Mueve a q2
                                            estadoAcutal = 2;
                                            index += 1;
                                            if (index < size && input.charAt(index) == '0') {
                                                //Mueve a q1
                                                estadoAcutal = 1;
                                                index += 1;
                                            } else {
                                                if (index < size && input.charAt(index) == '1') {
                                                    //Mueve a q3
                                                    estadoAcutal = 3;
                                                    index += 1;
                                                } else {
                                                    //Simbolo incorrecto
                                                    acceptedState = false;
                                                }
                                            }

                                        } else {
                                            if (index < size && input.charAt(index) == '1') {
                                                //Mueve a q4
                                                estadoAcutal = 4;
                                                index += 1;
                                            } else {
                                                //Simbolo incorrecto
                                                acceptedState = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (index < size && input.charAt(index) == '0') {
                                    //Mueve a q3
                                    estadoAcutal = 3;
                                    index += 1;
                                } else {
                                    //Simbolo incorrecto
                                    acceptedState = false;
                                }
                            }
                        }
                    }
                } else if (index < size && input.charAt(index) == '1') {
                    //Mueve a q2
                    estadoAcutal = 2;
                    index += 1;
                    if (index < size && input.charAt(index) == '1') {
                        //Mueve a q3
                        estadoAcutal = 3;
                        index += 1;
                    } else {
                        //Estado q2
                        while (index < size && acceptedState && estadoAcutal == 2) {
                            if (index < size && input.charAt(index) == '0') {
                                //Mueve a q1
                                estadoAcutal = 1;
                                index += 1;

                                if (index < size && input.charAt(index) == '0') {
                                    //Mueve a q2
                                    estadoAcutal = 2;
                                    index += 1;
                                } else {
                                    //Estado q1     
                                    while (index < size && acceptedState && estadoAcutal == 1) {
                                        if (index < size && input.charAt(index) == '1') {
                                            //Mueve a q4
                                            estadoAcutal = 4;
                                            index += 1;
                                            if (index < size && input.charAt(index) == '1') {
                                                //Mueve a q1
                                                estadoAcutal = 1;
                                                index += 1;
                                            } else {
                                                if (index < size && input.charAt(index) == '0') {
                                                    //Mueve a q3
                                                    estadoAcutal = 3;
                                                    index += 1;
                                                } else {
                                                    //Simbolo incorrecto
                                                    acceptedState = false;
                                                }
                                            }

                                        } else {
                                            if (index < size && input.charAt(index) == '0') {
                                                //Mueve a q2
                                                estadoAcutal = 2;
                                                index += 1;
                                            } else {
                                                //Simbolo incorrecto
                                                acceptedState = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (index < size && input.charAt(index) == '1') {
                                    //Mueve a q3
                                    estadoAcutal = 3;
                                    index += 1;
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
            }
        } else {
            //Simbolo incorrecto
            acceptedState = false;
        }
        if (index == size && (estadoAcutal == estadoFin[0] || estadoAcutal == estadoFin[1] || estadoAcutal == estadoFin[2])) {
            acceptedState = true;
        } else {
            acceptedState = false;
        }
        return acceptedState;
    }
}
