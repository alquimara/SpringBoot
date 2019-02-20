package estudoindividual.estudo.Service;

import estudoindividual.estudo.Repositorio.RepositorioContato;
import estudoindividual.estudo.model.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@Service
public class ServiceContato implements ServiceInterface {

    @Autowired
    RepositorioContato repositorioContato;

    public void createContato(Contato contato){
        repositorioContato.save(contato);


    }

    @Override
    public  void updateContato(String id, Contato contato){


    }
    @Override
    public void deleteContato( String id){

    }
    @Override
    public Collection<Contato> getContato(){
        return null;

    }





}
