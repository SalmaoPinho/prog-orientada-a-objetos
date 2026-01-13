public class Gaviao extends Animal {
    public Gaviao(String nome) {
        super(nome, 2, false, true, false, true);
    }
    
    @Override
    public void andar() {
        System.out.println(nome + " anda desajeitadamente com " + pernas + " pernas");
    }
    
    @Override
    public void voar() {
        System.out.println(nome + " voa alto planando nas correntes de ar");
    }
    
    @Override
    public void comer() {
        System.out.println(nome + " caça pequenos animais com o bico afiado");
    }
    
    @Override
    public void seLavar() {
        System.out.println(nome + " se limpa com o bico e toma banho em rios");
    }
}