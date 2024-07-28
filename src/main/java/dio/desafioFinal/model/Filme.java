package dio.desafioFinal.model;

import javax.persistence.*;

public class Filme {
    private Integer id;
    private String titulo;
    private String description;
    public Filme(){}
    public Filme(String titulo, String description){
        this.titulo = titulo;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "Título='" + titulo + '\'' +
                ", Descrição='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
