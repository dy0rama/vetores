package exerciciodois;

import java.util.Scanner;

public class ExercicioDois {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de vetores:");
        int quantidadeDeVetores = sc.nextInt();
        int[] valoresDeVetores = new int[quantidadeDeVetores];

        for (int i = 0 ; i <quantidadeDeVetores ; i++){
            System.out.println("Digite o valor do vetor " + i + ":");
            valoresDeVetores[i] = sc.nextInt();
        }
        System.out.println("Esses são os valores escolihidos por você multiplicados por 2 (se for números pares) ou elevados ao quadrado (se for números ímpares):");
        exibirVetores(valoresDeVetores);

        sc.close();
    }
    private static void exibirVetores(int[] quantidadeDeVetores){
        for (int i = 0 ; i < quantidadeDeVetores.length ; i++){

            if (quantidadeDeVetores[i] % 2 == 0){
                quantidadeDeVetores[i] = quantidadeDeVetores[i] * 2;
                System.out.println(quantidadeDeVetores[i]);
            }else {
                quantidadeDeVetores[i] = (int) Math.pow(quantidadeDeVetores[i], 2);
                System.out.println(quantidadeDeVetores[i]);
            }
        }
    }
}
