package silva.hiago.pessoas.infrastructure;

import org.springframework.data.repository.CrudRepository;
import silva.hiago.pessoas.model.PessoaEntity;

public interface PessoaRepository extends CrudRepository<PessoaEntity, Long> {
}
