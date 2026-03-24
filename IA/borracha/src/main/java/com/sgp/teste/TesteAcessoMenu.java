package com.sgp.teste;

import java.util.Scanner;

import com.sgp.modelo.Borracha; 
import com.sgp.util.Validacoes;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Borracha borracha = new Borracha("Teste", 20);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(borracha.toString());
                    break;
                case 2:
                    alterarNome(borracha, scanner);
                    break;
                case 3:
                    alterarMaterial(borracha, scanner);
                    break;
                case 4:
                    Borracha.saudacao();
                    break;
                case 5:
                    alterarCor(borracha, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados da borracha");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar idade");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar Cor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Borracha borracha, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            borracha.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarMaterial(Borracha borracha, Scanner scanner) {
        System.out.print("Digite a nova material: ");
        try {
            int novaMaterial = Integer.parseInt(scanner.nextLine());
            if (Validacoes.idadeValida(novaMaterial)) {
                borracha.setIdade(novaMaterial);
                System.out.println("Material alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroIdade(novaMaterial));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um material válido!");
        }
    }

    public static void alterarCor(Borracha borracha, Scanner scanner) {
        System.out.print("Digite a nova cor: ");
        try {
            double novaCor = Double.parseDouble(scanner.nextLine());
            if (Validacoes.CorValida(novaCor)) {
                borracha.setCor(novaCor);
                System.out.println("Cor alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroCor(novaCor));
            }
        } 
    }

}