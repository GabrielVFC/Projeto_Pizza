package builderpizza.pizza;

import builderpizza.pizza.builders.PizzaBuilder;
import builderpizza.pizza.builders.interfaces.Builder;
import builderpizza.pizza.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int opcao;
        Scanner dado = new Scanner(System.in);
        String ingrendienteNovoPizza, ingrendienteNovoPizza2, ingrendienteNovoPizza3, tamanhoDaPizza;
        String tamanhoDaPizza1 = "P", tamanhoDaPizza2 = "M", tamanhoDaPizza3 = "G";
        int timer = 15;
        int valorPositivo = 1;
        int valorNegativo = 2;
        String menu = """
                == Escolha um dos três tipos de sabor de pizza ==
                1- Quatro queijos.
                2- Portuguesa
                3- Frango com catupiry
                4- Sair
                """;
        opcao = -1;


        do {
            System.out.println(menu);
            System.out.println("Escolha uma opção:");
            opcao = dado.nextInt();
            PizzaBuilder pizza = new PizzaBuilder();

            switch (opcao){
                case 1:
                    System.out.println("Pizza de Quatro Queijo selecionada\n");
                    System.out.println("Ingredientes:" + "Queijo Provolone, Queijo parmesão, Queijo prata, Queijo mussarela, " +
                            "molho de tomate, massa da pizza, orégano\n");
                    System.out.println("Qual o tamanho da pizza? (P, M, G)\n");
                    dado.nextLine();
                    tamanhoDaPizza = dado.nextLine().toUpperCase();
                    pizza.buildTamanho(tamanhoDaPizza);
                    switch (tamanhoDaPizza){
                        case "P":
                                tamanhoDaPizza = "pequena";
                                System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                                break;
                        case "M":
                                tamanhoDaPizza = "média";
                                System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                                break;
                        case "G":
                                tamanhoDaPizza = "grande";
                                System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                                break;

                    }

                    System.out.println("Deseja colocar algo mais na pizza? (1 para sim e 2 para não)");
                    opcao = dado.nextInt();
                    dado.nextLine();
                    if (opcao == valorPositivo){
                        System.out.println("O que deseja colocar à mais?");
                        ingrendienteNovoPizza = dado.nextLine();
                        pizza.buildPizza(ingrendienteNovoPizza);
                        System.out.println("Ingrediente adicionado com sucesso: %s \n".formatted(ingrendienteNovoPizza));
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza de Quatro queijo pronta!\n");
                        } catch (Exception e){
                        }

                    } else{
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza de Quatro queijo pronta!\n");
                        } catch (Exception e){
                        }
                    }
                    break;
                case 2:
                    System.out.println("Pizza Portuguesa selecionada\n");
                    System.out.println("Ingredientes:" + "Queijo mussarela, molho de tomate, azeitona preta, massa da pizza, " +
                            "ovo, cebola, tomate,orégano\n");
                    System.out.println("Qual o tamanho da pizza? (P, M, G)\n");
                    dado.nextLine();
                    tamanhoDaPizza = dado.nextLine().toUpperCase();
                    pizza.buildTamanho(tamanhoDaPizza);
                    switch (tamanhoDaPizza){
                        case "P":
                            tamanhoDaPizza = "pequena";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;
                        case "M":
                            tamanhoDaPizza = "média";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;
                        case "G":
                            tamanhoDaPizza = "grande";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;

                    }
                    System.out.println("Deseja colocar algo mais na pizza? (1 para sim e 2 para não)");
                    opcao = dado.nextInt();
                    dado.nextLine();
                    if (opcao == valorPositivo){
                        System.out.println("O que deseja colocar à mais?");
                        ingrendienteNovoPizza2 = dado.nextLine();
                        pizza.buildPizza(ingrendienteNovoPizza2);
                        System.out.println("Ingrediente adicionado com sucesso: %s\n".formatted(ingrendienteNovoPizza2));
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza Portuguesa pronta!\n");
                        } catch (Exception e){
                        }
                    } else{
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza Portuguesa pronta!\n");
                        } catch (Exception e){
                        }
                    }
                    break;

                case 3:
                    System.out.println("Pizza de Frango com Catupiry selecionada\n");
                    System.out.println("Ingredientes:" + "Frango desfiado, queijo mussarela, molho de tomate, massa da pizza, " +
                            "catupiry, orégano\n");
                    System.out.println("Qual o tamanho da pizza? (P, M, G)\n");
                    dado.nextLine();
                    tamanhoDaPizza = dado.nextLine().toUpperCase();
                    pizza.buildTamanho(tamanhoDaPizza);
                    switch (tamanhoDaPizza){
                        case "P":
                            tamanhoDaPizza = "pequena";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;
                        case "M":
                            tamanhoDaPizza = "média";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;
                        case "G":
                            tamanhoDaPizza = "grande";
                            System.out.println("Pizza %s selecionada!\n".formatted(tamanhoDaPizza));
                            break;

                    }
                    System.out.println("Deseja colocar algo mais na pizza? (1 para sim e 2 para não)");
                    opcao = dado.nextInt();
                    dado.nextLine();
                    if (opcao == valorPositivo){
                        System.out.println("O que deseja colocar à mais?");
                        ingrendienteNovoPizza3 = dado.nextLine();
                        pizza.buildPizza(ingrendienteNovoPizza3);
                        System.out.println("Ingrediente adicionado com sucesso: %s\n".formatted(ingrendienteNovoPizza3));
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza de Frango com catupiry pronta!\n");
                        } catch (Exception e){
                        }
                    } else{
                        try{
                            System.out.println("Entrando no forno, aguarde %d segundos".formatted(timer));
                            Thread.sleep(15 * 1000);
                            System.out.println("Pizza de Frango com catupiry pronta!\n");
                        } catch (Exception e){
                        }
                    }
            }
        } while (opcao != 4);

    }

}

