package br.edu.uniesp.api.resource;

<<<<<<< HEAD
import br.edu.uniesp.api.model.Favoritos;
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
=======
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> df10d785d63a446c477ed3baacbea24d0dedfaa8

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
<<<<<<< HEAD

        return service.salvar(genero);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }


    @GetMapping
    public List<Genero> listar(){
        return service.listar();
    }


    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }


=======
        return service.salvar(genero);
    }
>>>>>>> df10d785d63a446c477ed3baacbea24d0dedfaa8
}
