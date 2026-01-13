public class Lampada {
    private int estado; // 0=apagada, 1=acesa, 2=meia-luz
    private String cor;
    private int potencia;
    
    public Lampada() {
        this.estado = 0; // Inicia apagada
        this.cor = "Branca";
        this.potencia = 60;
    }
    
    public void setEstado(int estado) {
        if (estado >= 0 && estado <= 2) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido! Use: 0=apagada, 1=acesa, 2=meia-luz");
        }
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setPotencia(int potencia) {
        if (potencia > 0 && potencia <= 200) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência deve ser entre 1 e 200W");
        }
    }
    
    public String getEstadoDescricao() {
        switch (estado) {
            case 0: return "Apagada";
            case 1: return "Acesa";
            case 2: return "Meia-luz";
            default: return "Desconhecido";
        }
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== LÂMPADA ===");
        System.out.println("Estado: " + getEstadoDescricao());
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");
    }
}