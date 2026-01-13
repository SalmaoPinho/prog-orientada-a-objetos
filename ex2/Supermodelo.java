/**
 * PROBLEMA DO SUPERMODELO:
 * Tentar criar uma classe que represente TODAS as pessoas é complicado porque:
 * 
 * 1. ATRIBUTOS CONFLITANTES: Alguns atributos são mutuamente exclusivos
 * 2. MEMÓria INEFICIENTE: Objetos carregam atributos que não usam
 * 3. COMPLEXIDADE: Validações ficam muito complexas
 * 4. VIOLAÇÃO DE PRINCÍPIOS: Viola o princípio da responsabilidade única
 */

// EXEMPLO DO PROBLEMA:
public class PessoaSuperModelo {
    // Atributos de estudante
    private String matricula;
    private String curso;
    private double nota;
    
    // Atributos de funcionário
    private String cargo;
    private double salario;
    private String departamento;
    
    // Atributos de aposentado
    private double aposentadoria;
    private int anosContribuicao;
    
    // Atributos de criança
    private String nomeResponsavel;
    private String escolaInfantil;
    
    // PROBLEMAS:
    // - Uma criança não tem aposentadoria
    // - Um aposentado não tem matrícula
    // - Um funcionário não precisa de responsável
    // - Muitos campos ficam null sem necessidade
}

// SOLUÇÃO CORRETA - HERANÇA:
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
}

public class Estudante extends Pessoa {
    private String matricula;
    private String curso;
    private double nota;
}

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String departamento;
}

public class Aposentado extends Pessoa {
    private double aposentadoria;
    private int anosContribuicao;
}