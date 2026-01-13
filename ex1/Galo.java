public class Galo extends Animal {
    public Galo(String nome) {
        super(nome, 2, false, true, false, true);
    }
    
    @Override
    public void andar() {
        System.out.println(nome + " corre com " + pernas + " pernas e cisca o chão");
    }
    
    @Override
    public void voar() {
        System.out.println(nome + " bate as asas e voa baixo por curtas distâncias");
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " come milho com o bico");
    }
    
    @Override
    public void seLavar() {
        System.out.println(nome + " toma banho de areia e bate as asas");
    }
}