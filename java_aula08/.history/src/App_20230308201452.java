public class App {
    public static void main(String[] args) throws Exception {
        int foo = 45;
        String bar = "mensagem";
        System.out.println("Imprimindo bar abaixo"); //breakpoint
            bar = "outra mensagem";        
        bar = "mais uma mensagem";
        System.out.println(bar);
    }
}
