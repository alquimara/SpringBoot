package estudoindividual.estudo.Service;

import estudoindividual.estudo.model.Contato;

import java.util.Collection;

public interface ServiceInterface{
   public abstract void createContato(Contato contato);
   public abstract void updateContato(String id, Contato contato);
   public abstract void deleteContato(String id);
   public abstract Collection<Contato> getContato();

}
