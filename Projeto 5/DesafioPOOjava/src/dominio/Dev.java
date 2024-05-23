package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    //atributos 

    private String nome;
    //quando for salvo vai ser colocado na msm ordem , é so adiciona uma vez(sem repetição)
    private Set<Conteudo> conteudiosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoCOncluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudiosIncritos() {
        return conteudiosIncritos;
    }
    public void setConteudiosIncritos(Set<Conteudo> conteudiosIncritos) {
        this.conteudiosIncritos = conteudiosIncritos;
    }
    public Set<Conteudo> getConteudoCOncluidos() {
        return conteudoCOncluidos;
    }
    public void setConteudoCOncluidos(Set<Conteudo> conteudoCOncluidos) {
        this.conteudoCOncluidos = conteudoCOncluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this ==o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudiosIncritos, dev.conteudiosIncritos) && Objects.equals(conteudoCOncluidos, conteudoCOncluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome,conteudiosIncritos,conteudoCOncluidos);
    }
    public void inscreverBootCamp(Bootcamp bootcamp) {
        this.conteudiosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevesInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudiosIncritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoCOncluidos.add(conteudo.get());
            this.conteudiosIncritos.remove(conteudo.get());
        }
        else{
            System.err.println("Vc não está matriculado em nenhum conteudo!");
        }
    }
    public double calcularTotalXp(){
        return this.conteudoCOncluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }
}
