package br.edu.uniesp.api.service;

<<<<<<< HEAD
import br.edu.uniesp.api.model.Filme;
=======
>>>>>>> df10d785d63a446c477ed3baacbea24d0dedfaa8
import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> df10d785d63a446c477ed3baacbea24d0dedfaa8
@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero){
<<<<<<< HEAD

        return repository.save(genero);
    }
    public Genero atualizar(Genero genero) throws Exception {
        if(genero.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(genero);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }



=======
        return repository.save(genero);
    }
>>>>>>> df10d785d63a446c477ed3baacbea24d0dedfaa8
}
