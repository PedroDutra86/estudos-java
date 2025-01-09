// Este é um exemplo de código em Java com comentários explicativos sobre os operadores.

public class Operadores {
  public static void main(String[] args) {
      // Operadores Aritméticos
      int a = 10;
      int b = 5;
      System.out.println("Adicao: " + (a + b)); // Soma
      System.out.println("Subtracao: " + (a - b)); // Subtração
      System.out.println("Multiplicacao: " + (a * b)); // Multiplicação
      System.out.println("Divisao: " + (a / b)); // Divisão
      System.out.println("Modulo: " + (a % b)); // Resto da divisão

      // Operadores de Atribuição
      int c = 20;
      c += 5; // Equivalente a c = c + 5
      System.out.println("Atribuicao (+=): " + c);

      // Operadores de Comparacao
      System.out.println("Igualdade: " + (a == b)); // Verifica se a é igual a b
      System.out.println("Diferenca: " + (a != b)); // Verifica se a é diferente de b
      System.out.println("Maior que: " + (a > b)); // Verifica se a é maior que b
      System.out.println("Menor que: " + (a < b)); // Verifica se a é menor que b

      // Operadores Logicos
      boolean x = true;
      boolean y = false;
      System.out.println("AND logico: " + (x && y)); // Retorna true se ambos forem true
      System.out.println("OR logico: " + (x || y)); // Retorna true se pelo menos um for true
      System.out.println("NOT logico: " + (!x)); // Inverte o valor booleano

      // Operadores Unarios
      int d = +a; // Indica que o valor é positivo
      int e = -b; // Inverte o sinal do valor
      System.out.println("Valor positivo: " + d);
      System.out.println("Valor negativo: " + e);

      // Operadores de Incremento e Decremento
      int f = 10;
      System.out.println("Incremento pre-fixado: " + (++f)); // Incrementa antes de usar o valor
      System.out.println("Incremento pos-fixado: " + (f++)); // Usa o valor e depois incrementa
      System.out.println("Valor atual: " + f);

      int g = 10;
      System.out.println("Decremento pre-fixado: " + (--g)); // Decrementa antes de usar o valor
      System.out.println("Decremento pos-fixado: " + (g--)); // Usa o valor e depois decrementa
      System.out.println("Valor atual: " + g);
  }
}
