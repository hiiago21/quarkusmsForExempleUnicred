package silva.hiago.limites.business;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import silva.hiago.limites.infrastructure.LimiteDiarioRepository;
import silva.hiago.limites.model.LimiteDiarioEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@ApplicationScoped
public class LimiteDiarioService {

    @ConfigProperty(name = "limite.valorTotal")
    BigDecimal valorTotal;

    @Inject
    LimiteDiarioRepository limiteDiarioRepository;


    @Transactional
    public LimiteDiarioEntity inserirLimiteDiario(LimiteDiarioEntity newLimiteDiario) {

        var limiteDiario = new LimiteDiarioEntity();
        limiteDiario.setValor(newLimiteDiario.getValor());
        limiteDiario.setAgencia(newLimiteDiario.getAgencia());
        limiteDiario.setConta(newLimiteDiario.getConta());
        limiteDiario.setData(LocalDate.now());
        PanacheEntityBase.persist(limiteDiario);

        return limiteDiario;

    }


    public Optional<LimiteDiarioEntity> buscarLimiteDiario(final Long codigoAgencia, final Long codigoConta) {
        return limiteDiarioRepository.buscarLimiteDiario(codigoAgencia, codigoConta);
    }

}
