public class Zoologico {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");
        Galo galo = new Galo("Carijó");
        Gaviao gaviao = new Gaviao("Águia");
        
        Animal[] animais = {cachorro, gato, galo, gaviao};
        
        for (Animal animal : animais) {
            animal.mostrarInfo();
            animal.andar();
            animal.voar();
            animal.comer();
            animal.seLavar();
            System.out.println();
        }
    }
}