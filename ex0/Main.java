import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ROBÔS ===\n");
        
        // Criando instâncias de robôs
        Robo robo1 = new Robo("R2-D2", "Exploração", 85, "(10, 15)");
        Robo robo2 = new Robo("C-3PO", "Assistente", 92, "(5, 8)");
        
        // Exibindo atributos iniciais
        System.out.println("=== ATRIBUTOS INICIAIS ===");
        System.out.println("Robô 1: " + robo1);
        System.out.println("Robô 2: " + robo2);
        System.out.println("Hora de retorno base: " + Robo.getHoraRetornoBase());
        
        // Alterando o atributo estático
        System.out.println("\n=== ALTERANDO ATRIBUTO ESTÁTICO ===");
        Robo.setHoraRetornoBase(LocalTime.of(20, 30));
        System.out.println("Hora de retorno alterada para: 20:30");
        
        // Exibindo atributos após alteração
        System.out.println("\n=== APÓS ALTERAÇÃO ===");
        System.out.println("Robô 1: " + robo1);
        System.out.println("Robô 2: " + robo2);
        System.out.println("Hora de retorno base: " + Robo.getHoraRetornoBase());
        
        // Demonstrando que é compartilhado
        System.out.println("\n=== DEMONSTRANDO COMPARTILHAMENTO ===");
        Robo robo3 = new Robo("WALL-E", "Limpeza", 78, "(12, 3)");
        System.out.println("Novo robô criado: " + robo3);
        
        // Mostrando que todos compartilham o mesmo atributo estático
        System.out.println("\n=== VERIFICAÇÃO FINAL ===");
        System.out.println("Acesso pela classe: " + Robo.getHoraRetornoBase());
        System.out.println("Acesso por robo1: " + robo1.getHoraRetornoBase());
        System.out.println("Acesso por robo2: " + robo2.getHoraRetornoBase());
        System.out.println("Acesso por robo3: " + robo3.getHoraRetornoBase());
                System.out.println("=== SISTEMA DE ALUNOS ===");
        System.out.println("Instituição: " + Aluno.getNomeInstituicao());
        System.out.println("========================\n");
        
        // Criando 4 objetos com construtores distintos
        
        // 1. Construtor Básico
        System.out.println("1. ALUNO CRIADO COM CONSTRUTOR BÁSICO:");
        Aluno aluno1 = new Aluno("João Silva", 20);
        aluno1.exibirInformacoes();
        
        // 2. Construtor Completo
        System.out.println("2. ALUNO CRIADO COM CONSTRUTOR COMPLETO:");
        Aluno aluno2 = new Aluno("Maria Santos", 22, "2023001", 8.5, "Engenharia de Software");
        aluno2.exibirInformacoes();
        
        // 3. Construtor com Matrícula Automática
        System.out.println("3. ALUNO CRIADO COM CONSTRUTOR DE MATRÍCULA AUTOMÁTICA:");
        Aluno aluno3 = new Aluno("Pedro Oliveira", 19, "Ciência da Computação");
        aluno3.exibirInformacoes();
        
        // 4. Construtor de Cópia
        System.out.println("4. ALUNO CRIADO COM CONSTRUTOR DE CÓPIA:");
        Aluno aluno4 = new Aluno(aluno2, "2023002");
        aluno4.setNome("Ana Costa"); // Alterando o nome para diferenciar
        aluno4.exibirInformacoes();
        
        // Demonstração do atributo estático
        System.out.println("=== DEMONSTRAÇÃO DO ATRIBUTO ESTÁTICO ===");
        System.out.println("Instituição atual: " + Aluno.getNomeInstituicao());
        
        // Alterando o atributo estático
        System.out.println("\nAlterando o nome da instituição...");
        Aluno.setNomeInstituicao("Faculdade Tecnológica Java");
        
        System.out.println("\n=== APÓS ALTERAÇÃO DA INSTITUIÇÃO ===");
        System.out.println("Nova instituição: " + Aluno.getNomeInstituicao());
        
        // Mostrando que todos os alunos foram afetados
        System.out.println("\nTodos os alunos agora pertencem à nova instituição:");
        System.out.println("Aluno 1 - Instituição: " + aluno1.getNomeInstituicao());
        System.out.println("Aluno 2 - Instituição: " + aluno2.getNomeInstituicao());
        System.out.println("Aluno 3 - Instituição: " + aluno3.getNomeInstituicao());
        System.out.println("Aluno 4 - Instituição: " + aluno4.getNomeInstituicao());
        
        // Criando um novo aluno após a alteração
        System.out.println("\n=== NOVO ALUNO CRIADO APÓS ALTERAÇÃO ===");
        Aluno aluno5 = new Aluno("Carlos Lima", 21, "Sistemas de Informação");
        aluno5.exibirInformacoes();
    }
}
