public class Main {
    public static void main(String[] args) {

        Integer primeiroNumero = 50;
        int segundoNumero = 20;
        Integer soma = primeiroNumero + segundoNumero;

        String resultado = soma.toString();
        System.out.println("O valor somado é igual a: " + resultado);
        System.out.println("=======================================");

        Integer valorInicial = Integer.parseInt(resultado);
        Integer valorAdicionado = 100;

        int total = valorInicial + valorAdicionado;

        String valorFinal = String.valueOf(total);

        System.out.println("O valor total é igual a: " + valorFinal);
    }
}