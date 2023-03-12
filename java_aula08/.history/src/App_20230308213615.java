public class App {
    public static void main(String[] args) throws Exception { 
        int foo = 45;
        String bar = "mensagem";
        System.out.println("Imprimindo bar abaixo");

        Teste.algo("Bolo de cenoura");
    }
}

class Teste{

    public static void algo(String mensagem){ //breakpoint
        System.out.println(mensagem);
    }

}
