import java.util.Scanner;


public class prog{


    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite 3 numeros");
        String linha = leitor.nextLine();
        String[] valores = linha.split("\\s");
        int tam = Integer.parseInt(valores[0]);
        int k = Integer.parseInt(valores[1]);
        int m = Integer.parseInt(valores[2]);
        Vetor vet = new Vetor(tam);
        vet.prox=1; 
        vet.prev=tam;  
        while (vet.vetor.size() > 0) {

           vet.testaigualdade(vet.prox, k, vet.prev, m);
            
        }

        
        
    }
        

}
        



