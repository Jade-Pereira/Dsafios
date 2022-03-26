public class TesteN{

    public static void main(String[] args){
        //Funciona apenas na versão do Java 11 e superiores//

        int n = 6;
        
        for(int i = 1; i < n + 1; i++){
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i));

        }
    }
}