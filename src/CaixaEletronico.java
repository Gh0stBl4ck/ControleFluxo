public class CaixaEletronico{
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSoliitado = 22.0;

        if(valorSoliitado < saldo){
            saldo = saldo - valorSoliitado;
            System.out.println("Novo saldo " + saldo);
        }else
        System.out.println("Saldo Insuficiente");
    

        
    }
}