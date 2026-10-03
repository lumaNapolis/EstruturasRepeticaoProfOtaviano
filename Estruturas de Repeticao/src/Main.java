
// Olá professor, sei que o senhor não gosta que a gente pesquise pela IA, por isso
// coloquei a fonte usada para esses comandos diferentes que descobri ao invés de usa-lá.

import java.util.Scanner;

void main() {

    Scanner leia = new Scanner(System.in);

    int menu = 0;

    System.out.println("Digite o número correspondente ao algoritmo que deseja ver" +
            "\nExemplo: Digite '1' para o Algoritmo 1");

    menu = leia.nextInt();

    switch (menu) {

        default:
            System.out.println("Opção inválida");
            break;

        case 1:
            Algoritmo1();
            break;

        case 2:
            Algoritmo2();
            break;

        case 3:
            Algoritmo3();

            break;

        case 4:
            Algoritmo4();
            break;

        case 5:
            Algoritmo5();
            break;

        case 6:
            Algoritmo6();
            break;

        case 7:
            Algoritmo7();
            break;

        case 8:
            Algoritmo8();
            break;

        case 9:
            Algoritmo9();
            break;

        case 10:
            Algoritmo10();

            break;

        case 11:
            Algoritmo11();
            break;

        case 12:
            Algoritmo12();
            break;
    }


}

//====================================================================================
//====================================================================================
private static void Algoritmo1() {

/*
    Desenvolver um programa que leia o valor de dois números inteiros e a
    operação aritmética desejada; calcule, então, a resposta adequada. Utilize os
    símbolos a seguir para ler qual a operação aritmética escolhida.
    1 - retornar o soma de dois números;
    2 – retornar a subtração de dois números;
    3 - retornar a multiplicação de dois números;
    4 - retornar o quociente inteiro de uma divisão;
    Deve-se permitir que o usuário tenha a opção de digitar novos valores ou encerrar
    a execução do algortimo/programa.
*/


    Scanner leia = new Scanner(System.in);

    String sair;
    String minusc;
    int operacao = 0;
    double resultado = 0;


    do {

        boolean repetirOperacao = true;

        System.out.println("Digite 'sair' para sair do programa\n" +
                "digite qualquer tecla para continuar");

        sair = leia.next();
        minusc = sair.toLowerCase(Locale.ROOT);  //https://www.w3schools.com/java/java_strings.asp


        while (repetirOperacao == true && !minusc.equals("sair")) {

            System.out.println("escolha o primeiro número:");

            double num1 = leia.nextDouble();

            System.out.println("escolha o segundo número:");

            double num2 = leia.nextDouble();

            System.out.println("escolha a a operação aritmética com base nos números a seguir" +
                    "\n digite 1 para soma" +
                    "\n digite 2 para subtração" +
                    "\n digite 3 para multiplicação" +
                    "\n digite 4 para o quociente inteiro da divisão" +
                    "\n digite 5 para sair do programa");

            operacao = leia.nextInt();

            switch (operacao) {

                default:

                    System.out.println("Número incorreto");

                    break;

                case 1:

                    resultado = num1 + num2;

                    System.out.println("Seu resultado é: " + resultado);

                    repetirOperacao = false;

                    break;

                case 2:

                    resultado = num1 - num2;

                    System.out.println("Seu resultado é: " + resultado);

                    repetirOperacao = false;

                    break;

                case 3:

                    resultado = num1 * num2;

                    System.out.println("Seu resultado é: " + resultado);

                    repetirOperacao = false;

                    break;

                case 4:

                    resultado = (num1 / num2);//https://www.w3schools.com/java/java_math.asp
                    resultado = Math.round(resultado);

                    System.out.println("Seu resultado é: " + resultado);

                    repetirOperacao = false;

                    break;

                case 5:

                    repetirOperacao = false;
                    minusc = "sair";

                    break;

            }

        }


    } while (!minusc.equals("sair"));

}

//====================================================================================
private static void Algoritmo2() {
//Desenvolver um algoritmo e um programa que efetue a soma de todos os números ímpares
//que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

    int i = 3;
    int soma = 0;

    while (i <= 498) {

        if (i % 2 != 0) {

            soma = i + soma;

        }

        i = i + 3;

    }

    System.out.println("a soma de todos os números ímpares que são múltiplos de três e que se" +
            "encontram no conjunto dos números de 1 até 500 é:\n" + soma);

}

//====================================================================================
private static void Algoritmo3() {

//Qual é o empregado mais recente e qual é o mais antigo.
//Desenvolver um algoritmo e um programa em para ler um número indeterminado de informações
//(máximo de 300) contendo o número do empregado e o número de meses de trabalho deste
//empregado e imprimir o mais recente e o mais antigo. Obs.: A última informação contém os dois
//números iguais a zero. Não existem dois empregados admitidos no mesmo mês.

    Scanner leia = new Scanner(System.in);

    String fim;
    String minusc = "";
    int numero;
    int limite = 0;
    int meses = 0;
    int maiorMes = 0;
    int menorMes = 1080;
    int maiorNumero = 0;
    int menorNumero = 10 ^ 20;

    System.out.println("Digite 'fim' quando terminar de informar todos os empregados" +
            " para ver o mais recente e o mais antigo\n" +
            "Digite qualquer outra tecla para prosseguir");

    fim = leia.next();
    minusc = fim.toLowerCase(Locale.ROOT);

    while (!minusc.equals("fim") && limite <= 300) {


        System.out.println("Informe o número do empregado: ");

        numero = leia.nextInt();

        System.out.println("Informe quantos meses de trabalho");

        meses = leia.nextInt();

        if (meses > maiorMes) {
            maiorNumero = numero;
            maiorMes = meses;
        } else if (meses < menorMes) {
            menorNumero = numero;
            menorMes = meses;
        }

        System.out.println("Digite 'fim' quando terminar de informar todos os empregados" +
                " para ver o mais recente e o mais antigo\n" +
                "Digite qualquer outra tecla para prosseguir");

        fim = leia.next();
        minusc = fim.toLowerCase(Locale.ROOT);
        limite = limite + 1;

    }

    System.out.println("O empregado mais velho é o Nº " + maiorNumero + "\nCom " +
            maiorMes + " meses de serviço!\n\n" +
            "O empregado mais novo é o Nº " + menorNumero + "\nCom " + menorMes + " meses de serviço!");

}

//====================================================================================
private static void Algoritmo4() {
/*
  Desenvolver um algoritmo e um programa que leia a altura e o sexo (M ou F) de 15
  pessoas. Este programa deverá calcular e mostrar:
  a. A menor altura do grupo;
  b. A média de altura das mulheres;
  c. O número de homens;
  d. O sexo da pessoa mais alta.
*/

    Scanner leia = new Scanner(System.in);

    int quantosF = 0;
    int quantosM = 0;
    double altura = 0;
    double maiorAltura = 0.0;
    double menorAltura = 6.0;
    double mediaAltura = 0.0;
    String maiorAltSex = "";

    for (int i = 0; i < 15; i++) {

        String sexo = "";
        String sexMaiusc;
        sexMaiusc = sexo.toUpperCase(Locale.ROOT);

        while (!sexMaiusc.equals("F") && !sexMaiusc.equals("M")) {

            System.out.println("Informe o sexo entre F ou M");

            sexo = leia.next();
            sexMaiusc = sexo.toUpperCase(Locale.ROOT);

        }

        System.out.println("Informe a altura em metros");

        altura = leia.nextDouble();

        if (altura > maiorAltura) {
            maiorAltura = altura;

            if (sexMaiusc.equals("F")) {
                maiorAltSex = "Feminino";
            } else {
                maiorAltSex = "Masculino";
            }
        }

        if (altura < menorAltura) {
            menorAltura = altura;
        }
        if (sexMaiusc.equals("F")) {

            mediaAltura = mediaAltura + altura;
            quantosF++;

        } else {
            quantosM++;
        }

    }

    System.out.println("A menor altura do grupo é: " + menorAltura);
    System.out.println("A média de altura so sexo feminino é: " + mediaAltura / quantosF);
    System.out.println("A quantidade de pessoas do sexo masculino é: " + quantosM);
    System.out.println("O sexo da pessoa mais alta é: " + maiorAltSex);

}

//====================================================================================
private static void Algoritmo5() {

//Coletando dados sobre o salário e número de filhos. A prefeitura deseja saber: ·
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$250,00.
//Desenvolver um algoritmo estruturado para calcular e escrever o que foi pedido nos itens a, b, c e d.
//O final da leitura de dados se dará com a entrada de um salário negativo (FLAG).


    Scanner leia = new Scanner(System.in);

    double somaSal = 0;
    double maiorSal = 0;
    int pessoaSal250 = 0;
    int filhos = 0;
    int somaFil = 0;
    double media = 0;

    System.out.println("Informe o Salário");
    double salario = leia.nextDouble();

    while (salario >= 0) {

        if (salario <= 250) {
            pessoaSal250++;
        }

        if (salario > maiorSal) {
            maiorSal = salario;
        }

        do {
            System.out.println("Informe o número de filhos");
            filhos = leia.nextInt();
            if (filhos < 0) {
                System.out.print("Valor inválido\n" + "\n");
            }

        } while (filhos < 0);

        somaSal = somaSal + salario;
        somaFil = somaFil + filhos;

        System.out.println("Informe o Salário");
        salario = leia.nextDouble();

        media++;
    }

    System.out.println("teste" + media);
    System.out.println("A média de filhos é: " + (somaFil / media) +
            "\nA média de salários é: " + (somaSal / media) + "\n" + (pessoaSal250 * 100) / media + "% das pessoas tem" +
            " salários até 250R$\nO maior salário foi de: " + maiorSal);

}


//====================================================================================
private static void Algoritmo6() {

    //Desenvolver um algoritmo estruturado que leia um número não determinado de valores e
    //calcule e escreva a média aritmética dos valores lidos, a quantidade de valores positivos, a
    //quantidade de valores negativos e o percentual de valores negativos e positivos.

    Scanner leia = new Scanner(System.in);

    String resultado = "";
    String resultMinusc;
    int media = 0;
    int valorPos = 0;
    int valorNeg = 0;
    double valor = 0;
    double valorMedia = 0;

    do {

        System.out.println("Digite um valor");
        valor = leia.nextDouble();

        if (valor > 0) {
            valorPos++;

        } else if (valor < 0) {
            valorNeg++;
        }

        valorMedia = valorMedia + valor;

        media++;

        System.out.println("Digite 'r' para ver resultados OU digite qualquer outra tecla para" +
                " continuar escrevendo valores");
        resultado = leia.next();
        resultMinusc = resultado.toLowerCase(Locale.ROOT);

    } while (!resultMinusc.equals("r"));

    System.out.println("A média aritmética dos valores é: " + valorMedia / media +
            "\nA quantidade de valores positivos é: " + valorPos + " representando " + valorPos * 100 / media + "%" +
            "\nA quantidade de valores negativos é: " + valorNeg + " representando " + valorNeg * 100 / media + "%");

}

//====================================================================================
private static void Algoritmo7() {

    //Escreva um algoritmo para calcular a média de um conjunto de 75 valores inteiros e positivos
    //fornecidos pelo usuário. Exiba no final do programa além da média, a quantidade de números lidos.

    Scanner leia = new Scanner(System.in);

    int valores = 0;
    int media = 0;

    for (int i = 1; i <= 75; i++) {

        do {

            System.out.println("Informe um valor positivo inteiro" +
                    "\nEste é o " + i + "º valor");
            valores = leia.nextInt();

        } while (valores < 0);

        media = valores + media;

    }

    System.out.println("A média é: " + media / 75 + " A quantidade de números lidos foi 75");

}

//====================================================================================
private static void Algoritmo8() {

    /*

leia um conjunto dos seguintes dados de uma turma de amigos:
o nome, altura e o sexo (código = 1 se for masculino e 2 se for feminino) de cada um. E sabendo que são
15 amigos calcule e imprima:
O valor e o nome da maior e a menor altura da turma;
A média de altura das mulheres e dos homens;
A média de altura da turma.
Observação. Suponha que não exista dois ou mais pessoas com a mesma altura.

    */

    Scanner leia = new Scanner(System.in);

    String nome = "";
    String menorNome = "";
    String maiorNome = "";
    double altura = 0;
    double alturaFem = 0;
    double alturaMasc = 0;
    double menorAltura = 6;
    double maiorAltura = 0;
    int sexo = 0;
    int sexCountF = 0;
    int sexCountM = 0;


    for (int i = 1; i <= 15; i++) {
        sexo = 0;

        System.out.println("Digite seu nome");
        nome = leia.next();

        System.out.println("Digite sua altura em metros");
        altura = leia.nextDouble();

        if (altura > maiorAltura) {
            maiorAltura = altura;
            maiorNome = nome;
        }
        if (altura < menorAltura) {
            menorAltura = altura;
            menorNome = nome;
        }

        while (sexo != 1 && sexo != 2) {
            System.out.println("Digite seu sexo entre F e M" +
                    "\nSendo 1 para 'M' e 2 para 'F'");

            sexo = leia.nextInt();
        }

        if (sexo == 2) {
            sexCountF++;
            alturaFem = altura + alturaFem;
        } else {
            sexCountM++;
            alturaMasc = altura + alturaMasc;
        }
    }

    System.out.println("A maior pessoa é " + maiorNome + " com " + maiorAltura + "\nA menor pessoa é " +
            menorNome + " com " + menorAltura);
    System.out.println("A média de altura entre as mulheres é: " + alturaFem / sexCountF +
            "\nA média de altura entre os homens é: " + alturaMasc / sexCountM);
    System.out.println("A média da altura da turma é: " + (alturaFem + alturaMasc) / 15);

}

//====================================================================================
private static void Algoritmo9() {

    /*
    Dados o número n de alunos de uma turma de Lógica e Técnicas de programação e suas notas
    da primeira DAD, escreva um algoritmo para determinar e imprimir a maior e a menor nota
    obtida por essa turma, onde a nota mínima é 0 e a nota máxima é 15.
    */

    Scanner leia = new Scanner(System.in);

    double nota = 0;
    double maiorNota = 0;
    double menorNota = 15;

    System.out.println("Quantos alunos há na turma?");
    int n = leia.nextInt();

    for (int i = 1; i <= n; i++) {

        System.out.println("Escreva a nota do " + i + "º aluno");
        nota = leia.nextDouble();

        if (nota > maiorNota) {
            maiorNota = nota;
        }
        if (nota < menorNota) {
            menorNota = nota;
        }

    }

    System.out.println("A menor nota foi " + menorNota + "\nA maior nota foi " + maiorNota);

}

//====================================================================================
private static void Algoritmo10() {

    //Escreva um algoritmo que Imprima uma tabela de conversão de polegadas para centímetros de 1 a 20.

    double centimetro = 0;

    for (int polegada = 1; polegada <= 20; polegada++) {

        centimetro = polegada * 2.54;

        System.out.println(polegada + " polegadas equivale a " + centimetro + " centímetros");

    }

}

//====================================================================================
private static void Algoritmo11() {

    //Escreva um algoritmo que dado um limite inferior e superior, calcule a soma de todos os números
    //pares contidos nesse intervalo.
    //Observação. Os limites a serem fornecidos são números inteiros e positivos.

    Scanner leia = new Scanner(System.in);

    int inferior = 0;
    int superior = 0;
    int somaNumero = 0;

    do {
        System.out.println("Escolha o limite inferior");
        inferior = leia.nextInt();

    } while (inferior < 0);

    do {
        System.out.println("Escolha o limite superior");
        superior = leia.nextInt();

    } while (superior < 0);


    for (int numeros = inferior; numeros <= superior; numeros++) {


        if (numeros % 2 == 0) {

            somaNumero = numeros + somaNumero;

        }

    }

    System.out.println("O resultado da soma é: " + somaNumero);

}

//====================================================================================
private static void Algoritmo12() {

    //Escreva um algoritmo para um programa que:
    //Dados o número de matrícula e a nota de cada aluno de um determinado curso.
    //Sabendo que este curso tem 100 alunos, determine e imprima as duas maiores notas, juntamente
    //com o número de matrícula do aluno que obteve cada uma delas.
    //Observação. Suponha que não exista dois ou mais alunos com a mesma nota.

    Scanner leia = new Scanner(System.in);

    int matricula = 0;
    int maiorMatric1 = 0;
    int maiorMatric2 = 0;
    double nota = 0;
    double maiorNota1 = 0;
    double maiorNota2 = 0;

    for (int i = 1; i <= 100; i++) {

        System.out.println("digite o número da matricula");

        matricula = leia.nextInt();

        System.out.println("digite o número da nota");

        nota = leia.nextDouble();

        if (nota > maiorNota2 && nota < maiorNota1) {

            maiorNota2 = nota;
            maiorMatric2 = matricula;

        } else if (nota > maiorMatric1) {

            maiorNota1 = nota;
            maiorMatric1 = matricula;
        }

    }

    System.out.println("As maiores notas foram de " + maiorMatric1 + " com " + maiorNota1 + " pontos\n" +
            " e " + maiorMatric2 + " com " + maiorNota2 + " pontos!");

}

