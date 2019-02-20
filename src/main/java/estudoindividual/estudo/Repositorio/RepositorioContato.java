package estudoindividual.estudo.Repositorio;

import estudoindividual.estudo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RepositorioContato extends JpaRepository<Contato, Integer> {
    Contato findByNome(String nome);

}
