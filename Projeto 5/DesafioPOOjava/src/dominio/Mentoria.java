package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //atributos 
    private LocalDate data;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override 
    public String toString() {
        return "Curso{" + 
        "titulo='" + getTitulo() +  '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", Data='" + data + '\'' +
        '}';

    }
}
