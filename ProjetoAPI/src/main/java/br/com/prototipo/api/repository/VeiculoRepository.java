package br.com.prototipo.api.repository;
import br.com.prototipo.api.entity.Veiculo; import org.springframework.data.jpa.repository.JpaRepository;
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> { boolean existsByPlaca(String placa); }
