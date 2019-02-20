package estudoindividual.estudo.Controller;

import com.sun.org.apache.regexp.internal.RE;

import estudoindividual.estudo.Service.ServiceInterface;
import estudoindividual.estudo.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
public class ControllerContato {
    @Autowired
    ServiceInterface serviceInterface;

    @GetMapping ("/contatos")
    public ResponseEntity<Object> getContato(){
        return new ResponseEntity<>(serviceInterface.getContato(), HttpStatus.OK);
    }
    @PostMapping("/contatos")
    public ResponseEntity<Object> createContato(@RequestBody Contato contato){
        serviceInterface.createContato(contato);
        return  new ResponseEntity<>("Contato criado com sucesso", HttpStatus.CREATED);

    }
    @PutMapping("/contatos/{id}")
    public ResponseEntity<Object> updateContato(@PathVariable("id") String id, @RequestBody Contato contato){
        serviceInterface.updateContato(id, contato);
        return new ResponseEntity<>("Contato atualizado com sucesso", HttpStatus.OK);

    }
    @DeleteMapping("/contatos/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id, @RequestBody Contato contato){
        serviceInterface.deleteContato(id);
        return new ResponseEntity<>("Contato deletado com sucesso", HttpStatus.OK);
    }

}

