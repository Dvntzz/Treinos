package explicacoes;

import java.util.Scanner;

public class bomba {
   public static void main(String[] args) throws InterruptedException {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Digite a senha da bomba para ativar: ");
	   int senha1 = sc.nextInt();
	   int senha2 = 7355608;
	   
	   
	   if(senha1 ==  senha2) {
		   for(int i=0;i<=30;i++) {
			   System.out.println("Deton��o em " + i);
			   Thread.sleep(1000);
			   
		   }
		   } else {
			   System.out.print("Senha incorreta");
	   }
	   
	   
	   
	   sc.close();
   }
}
