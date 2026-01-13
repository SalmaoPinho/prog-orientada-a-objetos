public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        
        System.out.println("=== TESTANDO CARRO ===");
        System.out.println(carro);
        
        // Testando mudanças de marcha e velocidade
        System.out.println("\n--- Acelerando ---");
        carro.setMarcha('1');
        carro.acelerar(20);
        System.out.println(carro);
        
        System.out.println("\n--- Mudando marcha ---");
        carro.setMarcha('2');
        carro.acelerar(30);
        System.out.println(carro);
        
        System.out.println("\n--- Tentativa inválida ---");
        carro.setMarcha('P'); // Não deve funcionar (velocidade alta)
        carro.setVelocidade(300); // Não deve funcionar (marcha baixa)
        
        System.out.println("\n--- Freando ---");
        carro.frear(40);
        carro.setMarcha('1');
        System.out.println(carro);
        
        System.out.println("\n--- Parando ---");
        carro.frear(10);
        carro.setMarcha('P');
        System.out.println(carro);
    }
}