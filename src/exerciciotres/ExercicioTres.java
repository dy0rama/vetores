package exerciciotres;

import java.util.Scanner;

public class ExercicioTres {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavraUsuario = sc.nextLine();
        char[] vetorPalavras = palavraUsuario.toCharArray();

        for (int i = 0 ; i < vetorPalavras.length ; i++){
           for (int j = i ; j < vetorPalavras.length ; j++){

               char aux = vetorPalavras[i];
               vetorPalavras[i] = vetorPalavras[j];
               vetorPalavras[j] = aux;
           }
            System.out.print(vetorPalavras[i]);
        }
        sc.close();
    }
}
