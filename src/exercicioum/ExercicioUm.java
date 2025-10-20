package exercicioum;

import java.util.Scanner;

public class ExercicioUm {
        static void main(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a quantidade de vetores:");
            int quantidadeDeVetores = sc.nextInt();
            int[] valoresDeVetores = new int[quantidadeDeVetores];

            for (int i = 0 ; i <quantidadeDeVetores ; i++){
                System.out.println("Digite o valor do vetor " + i + ":");
                valoresDeVetores[i] = sc.nextInt();
            }
            System.out.println("Esses são os valores escolihidos por você em ordem crescente:");
            exibirVetores(valoresDeVetores);

            sc.close();
        }
        private static void exibirVetores(int[] quantidadeDeVetores){
            for (int i = 0 ; i <quantidadeDeVetores.length ; i++){
                for (int j = i ; j < quantidadeDeVetores.length ; j++){

                    if (quantidadeDeVetores[i] > quantidadeDeVetores[j]){
                        int aux = quantidadeDeVetores[i];
                        quantidadeDeVetores[i] = quantidadeDeVetores[j];
                        quantidadeDeVetores[j] = aux;
                    }
                }
                System.out.println(quantidadeDeVetores[i]);
            }
            exibirVogais();
        }
        private static void exibirVogais(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um nome aleatório:");
            String nomeUsuario = sc.nextLine();
            String vogais = "aeiouAEIOU";
            int contadorDeVogais = 0;

            for (int i = 0 ; i < nomeUsuario.length() ; i++){
                if (vogais.indexOf(nomeUsuario.charAt(i))!= -1){
                    contadorDeVogais++;
                }
            }
            System.out.println("O nome " + nomeUsuario + " possui " + contadorDeVogais + " vogais.");
        }
    }

