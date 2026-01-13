public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome, 4, true, false, true, false);
    }
    
    @Override
    public void andar() {
        System.out.println(nome + " corre rapidamente com " + pernas + " pernas");
    }
    
    @Override
    public void voar() {
        System.out.println(nome + " não pode voar, apenas correr!");
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " come ração com a boca");
    }
    
    @Override
    public void seLavar() {
        System.out.println(nome + " se lambe para se lavar");
    }
}