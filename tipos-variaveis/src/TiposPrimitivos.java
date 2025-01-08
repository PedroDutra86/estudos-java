/*
 * Tipos Primitivos em Java
 *
 * Java é uma linguagem fortemente tipada, o que significa que cada variável é associada a um tipo de dado.
 * Java possui 8 tipos primitivos, que são:
 *
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. char
 * 8. boolean
 */

 public class TiposPrimitivos {
    public static void main(String[] args) {
        // byte: ocupa 1 byte de memória, armazena valores de -128 a 127
        byte byteVar = 100;

        // short: ocupa 2 bytes, armazena valores de -32.768 a 32.767
        short shortVar = 10000;

        // int: ocupa 4 bytes, armazena valores de -2^31 a 2^31-1
        int intVar = 100000;

        // long: ocupa 8 bytes, armazena valores de -2^63 a 2^63-1
        long longVar = 10000000000L;

        // float: ocupa 4 bytes, é um tipo de ponto flutuante de precisão simples
        float floatVar = 20.5f;

        // double: ocupa 8 bytes, é um tipo de ponto flutuante de precisão dupla
        double doubleVar = 20.5;

        // char: ocupa 2 bytes, armazena um único caractere Unicode
        char charVar = 'A';

        // boolean: ocupa 1 bit (na prática, usa 1 byte), armazena true ou false
        boolean booleanVar = true;

        // Exibindo os valores dos tipos primitivos
        System.out.println("Valor de byteVar: " + byteVar);
        System.out.println("Valor de shortVar: " + shortVar);
        System.out.println("Valor de intVar: " + intVar);
        System.out.println("Valor de longVar: " + longVar);
        System.out.println("Valor de floatVar: " + floatVar);
        System.out.println("Valor de doubleVar: " + doubleVar);
        System.out.println("Valor de charVar: " + charVar);
        System.out.println("Valor de booleanVar: " + booleanVar);

        // Variáveis e Constantes
        // Variáveis: são espaços na memória do computador que podem armazenar dados e cujo valor pode ser alterado durante a execução do programa.
        int variavel = 50;  // Exemplo de variável
        System.out.println("Valor da variável: " + variavel);
        
        // Constantes: são variáveis cujo valor, uma vez definido, não pode ser alterado durante a execução do programa. Em Java, usamos a palavra-chave 'final' para declarar uma constante.
        final int CONSTANTE = 100;  // Exemplo de constante
        System.out.println("Valor da constante: " + CONSTANTE);

        // CONSTANTE = 200;  // Isso geraria um erro de compilação porque o valor de uma constante não pode ser alterado.
    }
}
