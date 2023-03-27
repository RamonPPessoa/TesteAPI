package dio.primeirowebapi.controller;
import dio.primeirowebapi.model.Usuario;
import dio.primeirowebapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/users") /*(prefix) vai determinar qual URI comum para todos os recursos */
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/users")
    public List<Usuario> getUsers() {

        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public  void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);

    }
}