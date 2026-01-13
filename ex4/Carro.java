public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;
    private char marcha; // R, 1, 2, 3, 4, 5, P
    
    public Carro() {
        this.velocidade = 0;
        this.marcha = 'P';
    }
    
    // Getters e Setters com validação
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public int getVelocidade() { return velocidade; }
    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 300) {
            // Valida compatibilidade com marcha
            if (isVelocidadeCompativel(velocidade, this.marcha)) {
                this.velocidade = velocidade;
            } else {
                System.out.println("Velocidade " + velocidade + " incompatível com marcha " + marcha);
            }
        } else {
            System.out.println("Velocidade deve ser entre 0 e 300 km/h");
        }
    }
    
    public char getMarcha() { return marcha; }
    public void setMarcha(char marcha) {
        char marchaUpper = Character.toUpperCase(marcha);
        if (marchaUpper == 'R' || marchaUpper == 'P' || 
            (marchaUpper >= '1' && marchaUpper <= '5')) {
            
            // Valida compatibilidade com velocidade atual
            if (isVelocidadeCompativel(this.velocidade, marchaUpper)) {
                this.marcha = marchaUpper;
            } else {
                System.out.println("Marcha " + marchaUpper + " incompatível com velocidade " + this.velocidade + " km/h");
            }
        } else {
            System.out.println("Marcha inválida! Use: R, P, 1, 2, 3, 4, 5");
        }
    }
    
    // Método para validar compatibilidade velocidade/marcha
    private boolean isVelocidadeCompativel(int velocidade, char marcha) {
        switch (marcha) {
            case 'P': return velocidade == 0;
            case 'R': return velocidade >= 0 && velocidade <= 20;
            case '1': return velocidade >= 0 && velocidade <= 30;
            case '2': return velocidade >= 20 && velocidade <= 50;
            case '3': return velocidade >= 40 && velocidade <= 80;
            case '4': return velocidade >= 60 && velocidade <= 120;
            case '5': return velocidade >= 80 && velocidade <= 300;
            default: return false;
        }
    }
    
    // Método para acelerar
    public void acelerar(int incremento) {
        int novaVelocidade = this.velocidade + incremento;
        setVelocidade(novaVelocidade);
    }
    
    // Método para frear
    public void frear(int decremento) {
        int novaVelocidade = Math.max(0, this.velocidade - decremento);
        setVelocidade(novaVelocidade);
    }
    
    @Override
    public String toString() {
        return String.format("Carro: %s %s | Velocidade: %d km/h | Marcha: %c",
                marca, modelo, velocidade, marcha);
    }
}