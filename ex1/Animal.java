public class Animal {
    protected String nome;
    protected int pernas;
    protected boolean pelos;
    protected boolean penas;
    protected boolean boca;
    protected boolean bico;
    
    public Animal(String nome, int pernas, boolean pelos, boolean penas, 
                  boolean boca, boolean bico) {
        this.nome = nome;
        this.pernas = pernas;
        this.pelos = pelos;
        this.penas = penas;
        this.boca = boca;
        this.bico = bico;
    }
    
    public void andar() {
        System.out.println(nome + " está andando");
    }
    
    public void voar() {
        System.out.println(nome + " está tentando voar");
    }
    
    public void comer() {
        System.out.println(nome + " está comendo");
    }
    
    public void seLavar() {
        System.out.println(nome + " está se lavando");
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== " + nome + " ===");
        System.out.println("Pernas: " + pernas);
        System.out.println("Pelos: " + pelos);
        System.out.println("Penas: " + penas);
        System.out.println("Boca: " + boca);
        System.out.println("Bico: " + bico);
    }
}