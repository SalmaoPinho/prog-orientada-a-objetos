public class Gato extends Animal {
    public Gato(String nome) {
        super(nome, 4, true, false, true, false);
    }
    
    @Override
    public void andar() {
        System.out.println(nome + " anda silenciosamente com " + pernas + " pernas");
    }
    
    @Override
    public void voar() {
        System.out.println(nome + " pula alto, mas não voa!");
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " come peixe com a boca");
    }
    
    @Override
    public void seLavar() {
        System.out.println(nome + " se lambe cuidadosamente");
    }
}