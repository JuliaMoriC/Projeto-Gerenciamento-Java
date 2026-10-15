package br.com.prototipo.api.controller;
import br.com.prototipo.api.entity.Servico; import br.com.prototipo.api.repository.ServicoRepository;
import jakarta.validation.Valid; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/servicos")
public class ServicoController {
 private final ServicoRepository repo; public ServicoController(ServicoRepository repo){this.repo=repo;}
 @GetMapping public List<Servico> listar(){return repo.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Servico> buscar(@PathVariable Long id){return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Servico criar(@Valid @RequestBody Servico s){return repo.save(s);}
 @PutMapping("/{id}") public ResponseEntity<Servico> atualizar(@PathVariable Long id,@Valid @RequestBody Servico s){return repo.findById(id).map(atual->{s.setId(id);return ResponseEntity.ok(repo.save(s));}).orElse(ResponseEntity.notFound().build());}
 @DeleteMapping("/{id}") public ResponseEntity<Void> excluir(@PathVariable Long id){if(!repo.existsById(id))return ResponseEntity.notFound().build();repo.deleteById(id);return ResponseEntity.noContent().build();}
}
