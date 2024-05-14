
package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Cliente;
import pe.edu.upeu.syscenterlife.repositorio.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;
    
    //c
    public Cliente guardarentidad(Cliente cliente){
    return repository.save(cliente);    
    }
    //r
    public List<Cliente> listarEntiendad(){
    return repository.findAll();
    
    }
    //u
    public Cliente actualizarEntidad (Cliente cliente){
    return repository.save(cliente);
    
    }
    //d
    public void eliminaEntidad(String dniruc){
        repository.delete(repository.findById(dniruc).get());
        
    }
    //b
    public Cliente buscarEntidad(String dniruc){
        return repository.findById(dniruc).get();
    }
}
