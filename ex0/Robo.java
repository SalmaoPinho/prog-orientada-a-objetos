import java.time.LocalTime;

public class Robo {
    private String nome;
    private String tipo;
    private int bateria;
    private String posicao;
    private boolean isActive;
    private static LocalTime horaRetornoBase = LocalTime.of(22, 0); // 22:00 horas

    public Robo(String nome, String tipo, int bateria, String posicao) {
        this.nome = nome;
        this.tipo = tipo;
        this.bateria = bateria;
        this.posicao = posicao;
        this.isActive = true;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Métodos estáticos corrigidos
    public static LocalTime getHoraRetornoBase() {
        return horaRetornoBase;
    }

    public static void setHoraRetornoBase(LocalTime novaHora) {
        horaRetornoBase = novaHora;
    }

    // toString corrigido para mostrar todos os atributos, incluindo o estático
    public String toString() {
        return "Robo [nome=" + this.nome + 
               ", tipo=" + this.tipo + 
               ", bateria=" + this.bateria + 
               ", posicao=" + this.posicao + 
               ", isActive=" + this.isActive + 
               ", horaRetornoBase=" + horaRetornoBase + "]";
    }
}