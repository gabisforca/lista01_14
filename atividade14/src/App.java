import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double pesodopeixe;
    double excesso;
    double multa;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite os kilos pescados:");
    pesodopeixe = teclado.nextDouble();
    
    if (pesodopeixe <= 50) {
        System.out.println ("Não tem excesso de peixe");
    } 
    else {
        if (pesodopeixe > 50) {
        excesso = (pesodopeixe - 50);
        multa = (excesso * 4);
        System.out.println("o excesso é:" + excesso);
        System.out.println("a multa é R$" + multa);
        }
    }  
  }
}
