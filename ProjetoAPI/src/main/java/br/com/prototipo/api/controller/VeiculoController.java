package br.com.prototipo.api.controller;
import br.com.prototipo.api.entity.Veiculo; import br.com.prototipo.api.repository.VeiculoRepository;
import jakarta.validation.Valid; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController @RequestMapping("/api/veiculos")
public class VeiculoController {
 private final VeiculoRepository repo; public VeiculoController(VeiculoRepository repo){this.repo=repo;}
 @GetMapping public List<Veiculo> listar(){return repo.findAll();}
 @GetMapping("/{id}") public ResponseEntity<Veiculo> buscar(@PathVariable Long id){return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public Veiculo criar(@Valid @RequestBody Veiculo v){return repo.save(v);}
 @PutMapping("/{id}") public ResponseEntity<Veiculo> atualizar(@PathVariable Long id,@Valid @RequestBody Veiculo v){return repo.findById(id).map(atual->{v.setId(id);return ResponseEntity.ok(repo.save(v));}).orElse(ResponseEntity.notFound().build());}
 @DeleteMapping("/{id}") public ResponseEntity<Void> excluir(@PathVariable Long id){if(!repo.existsById(id))return ResponseEntity.notFound().build();repo.deleteById(id);return ResponseEntity.noContent().build();}
}
