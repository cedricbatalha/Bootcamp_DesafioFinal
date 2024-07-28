package dio.desafioFinal.controller;

import dio.desafioFinal.model.Filme;
import dio.desafioFinal.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeRepository repository;

    //listar todos os filmes
    @GetMapping()
    public List<Filme> getFilmes(){
        return repository.findAll();

    }

    //buscar apenas 1 filme

    @GetMapping("/{filmename}")
    public Filme getOne(@PathVariable("filmename") String filmenome){
        return repository.findByFilmename(filmenome);
    }


    //Delete
    @DeleteMapping("/{id}")
    public void deleteFilme (@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    //Post
    @PostMapping()
    public void postFilme(@RequestBody Filme filme){
        repository.save(filme);
    }

    //Put
    @PutMapping()
    public void putUser(@RequestBody Filme filme){
        repository.save(filme);
    }

}
