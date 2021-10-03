import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("Primeiro codigo! ");
// para não haver quebra de linha use o print só em vez do println 
		System.out.println("Bom dia!");		
// exemplo do usso do int e do double, atribuise um valor e depois se chama o valor como abaixo		
		int y = 32;
		System.out.println(y);
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
// para reduzir o numero de casas decimais use %.2f%n sendo o 2 o numero de casas decimais que quer deixar apos a ,
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
// para configurar a localização do programa segue abaixo, mudar a , pelo . padrão Brasil e padrão USA
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
// para concatenar segue abaixo	
		System.out.println("Resultado = " + x + " Metros");
// e com o %.f segue abaixo
		System.out.printf("Resultado = %.2f metros%n", x);
// concatenando varias variaveis
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
