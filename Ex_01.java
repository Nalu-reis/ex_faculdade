import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex_01 {

    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.##");

    System.out.print("Informe sua altura em metros: ");
    double altura = entrada.nextDouble();
    System.out.print("Informe seu peso: ");
    double peso = entrada.nextDouble();

//CONTA

    double imc = peso/Math.pow(altura, 2);
    System.out.println("Seu IMC é: " + df.format(imc));
    if (imc<18.5) {
        System.out.println("Abaixo do Peso");
    }else if (imc>18.5 && imc<24.9){
            System.out.println("Peso Normal");
    }else if (imc>25 && imc<29.9){
        System.out.println("Pré-obesidade");
    }else if (imc>30 && imc<34.9){
        System.out.println("Obesidade Grau I");
    } else if (imc>35 && imc<39.9) {
        System.out.println("Obesidade Grau II");        
    } else{
        System.out.println("Obesidade Grau III");
    }
    }
    }
