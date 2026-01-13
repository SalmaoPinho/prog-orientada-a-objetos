public class Aluno {
    // Atributos de instância
    private String nome;
    private int idade;
    private String matricula;
    private double nota;
    private String curso;
    
    // Atributo estático - útil para controlar algo comum a todos os alunos
    private static String nomeInstituicao = "Universidade Java";
    
    // Construtor 1: Básico - apenas nome e idade
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = "Sem matrícula";
        this.nota = 0.0;
        this.curso = "Não definido";
    }
    
    // Construtor 2: Completo - todos os atributos
    public Aluno(String nome, int idade, String matricula, double nota, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.nota = nota;
        this.curso = curso;
    }
    
    // Construtor 3: Com matrícula automática
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = gerarMatriculaAutomatica();
        this.nota = 0.0;
    }
    
    // Construtor 4: Cópia de outro aluno (com nova matrícula)
    public Aluno(Aluno outroAluno, String novaMatricula) {
        this.nome = outroAluno.nome;
        this.idade = outroAluno.idade;
        this.matricula = novaMatricula;
        this.nota = outroAluno.nota;
        this.curso = outroAluno.curso;
    }
    
    // Método privado para gerar matrícula automática
    private String gerarMatriculaAutomatica() {
        return "AUTO" + System.currentTimeMillis() % 10000;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Métodos estáticos para o atributo estático
    public static String getNomeInstituicao() {
        return nomeInstituicao;
    }
    
    public static void setNomeInstituicao(String novaInstituicao) {
        nomeInstituicao = novaInstituicao;
    }
    
    // Método para exibir todos os atributos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println("Curso: " + curso);
        System.out.println("Instituição: " + nomeInstituicao);
        System.out.println("------------------------");
    }
    
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", nota=" + nota +
                ", curso='" + curso + '\'' +
                '}';
    }
}