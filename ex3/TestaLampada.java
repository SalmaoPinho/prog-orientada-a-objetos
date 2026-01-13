import java.util.Scanner;

public class TestaLampada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada();
        
        System.out.println("=== CONFIGURAR LÂMPADA ===");
        
        System.out.print("Digite a cor da lâmpada: ");
        lampada.setCor(scanner.nextLine());
        
        System.out.print("Digite a potência (W): ");
        lampada.setPotencia(scanner.nextInt());
        
        System.out.print("Digite o estado (0=apagada, 1=acesa, 2=meia-luz): ");
        lampada.setEstado(scanner.nextInt());
        
        lampada.mostrarInfo();
        scanner.close();
    }
}