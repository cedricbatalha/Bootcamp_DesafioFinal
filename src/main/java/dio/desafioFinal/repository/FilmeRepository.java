package dio.desafioFinal.repository;

import dio.desafioFinal.handler.BusinessException;
import dio.desafioFinal.handler.CampoObrigatorioException;
import dio.desafioFinal.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmeRepository {
    public void save(Filme filme){
        if(filme.getTitulo()==null)
            throw new CampoObrigatorioException("titulo");
        //nova classe

        if(filme.getDescription()==null)
            throw new BusinessException("O campo descrição é obrigatório!");
        //se for RuntimeException, dá 500 e Internal Server Error (genérica)

        if(filme.getId()==null)
            System.out.println("SAVE - Recebendo o filme na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o filme na camada de repositório");

        System.out.println(filme);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um filme", id));
        System.out.println(id);
    }
    public List<Filme> findAll(){
        System.out.println("LIST - Listando os filmes do sistema");
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Avangers","Marvel - Descrição 001"));
        filmes.add(new Filme("Liga da Justiça","DC - Descrição 002"));
        return filmes;
    }
    public Filme findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um filme", id));
        return new Filme("Avangers","Marvel - Descrição 001");
    }
    public Filme findByFilmename(String filmenome){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", filmenome));
        return new Filme("Avangers","Marvel - Descrição 001");
    }
}
