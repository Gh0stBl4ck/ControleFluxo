import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
      double mesada = 50.0;
      while (mesada >0) {
        double valorDoce = valorAleatorio();
        
        System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho. ");
            mesada = mesada - valorDoce;
      }
      
      System.out.println("Mesada: " + mesada);
      System.out.println("Marcelo gastou toda sua mesada em doces. ");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
