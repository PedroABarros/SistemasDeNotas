package org.example;

public class Avaliador {



    public char determinarNotaAluno (int notaTeste){
        if (notaTeste < 0) {
            throw new IllegalArgumentException("Valor da nota é invalido");
        }
        else{
            if (notaTeste < 60){
                return 'F';
            }
            else{
                if (notaTeste < 70){
                    return 'D';
                }
                else {
                    if (notaTeste < 80){
                        return 'C';
                    }
                    else {
                        if (notaTeste < 90){
                            return 'B';
                        }
                        else {
                            return 'A';
                        }
                    }
                }
            }
        }

    }

}
