public class Empresa {
    public static void main(String[] args) {
        // Criando 7 funcionários
        Funcionario[] funcionarios = {
            new Funcionario("João Silva", "111.222.333-44", "Contador", 4500.0),
            new Funcionario("Maria Santos", "222.333.444-55", "Psicólogo", 3800.0),
            new Funcionario("Pedro Oliveira", "333.444.555-66", "Economista", 5200.0),
            new Funcionario("Ana Costa", "444.555.666-77", "Administrador", 6000.0),
            new Funcionario("Carlos Lima", "555.666.777-88", "Auxiliar de Contabilidade", 2800.0),
            new Funcionario("Juliana Pereira", "666.777.888-99", "Economista", 4800.0),
            new Funcionario("Roberto Alves", "777.888.999-00", "Psicólogo", 4000.0)
        };
        
        System.out.println("=== FUNCIONÁRIOS DA EMPRESA ===\n");
        
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ": " + funcionarios[i]);
        }
        
        // Demonstrando alteração de função
        System.out.println("\n=== ALTERAÇÃO DE FUNÇÃO ===");
        funcionarios[0].setFuncao("Administrador");
        System.out.println("João Silva agora: " + funcionarios[0]);
    }
}