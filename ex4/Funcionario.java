public class Funcionario {
    private String nome;
    private String cpf;
    private String departamento;
    private String funcao;
    private double salario;
    
    // Construtor
    public Funcionario(String nome, String cpf, String funcao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
        this.departamento = alocarDepartamento(funcao);
    }
    
    // Método para alocar departamento baseado na função
    private String alocarDepartamento(String funcao) {
        switch (funcao.toLowerCase()) {
            case "contador":
            case "auxiliar de contabilidade":
                return "Departamento de Contabilidade";
            case "psicólogo":
                return "RH";
            case "economista":
                return "Departamento Financeiro";
            case "administrador":
                return "Diretoria Administrativa";
            default:
                return "Departamento não definido";
        }
    }
    
    // Getters e Setters (Bean)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getDepartamento() { return departamento; }
    public void setFuncao(String funcao) { 
        this.funcao = funcao; 
        this.departamento = alocarDepartamento(funcao);
    }
    
    public String getFuncao() { return funcao; }
    
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    
    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Função: %s | Departamento: %s | Salário: R$ %.2f",
                nome, cpf, funcao, departamento, salario);
    }
}