public class App {
    public static void main(String[] args) throws Exception { 
        int foo = 45;
        String bar = "mensagem";
        System.out.println("Imprimindo bar abaixo");

        for (int i = 0; i < 100; i++) {
ybar        

        bar = "outra mensagem"; //breakpoint
        bar = "mais uma mensagem"; 
        System.out.println(bar);
        Teste.algo("Bolo de cenoura");
    }
}

class Teste{

    public static void algo(String mensagem){ //breakpoint
        System.out.println(mensagem);
    }

}
