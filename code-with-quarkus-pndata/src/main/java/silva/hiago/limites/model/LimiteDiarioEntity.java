package silva.hiago.limites.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NamedQuery(name = "LimiteDiario.findByAgenciaAndConta", query = "SELECT li FROM LimiteDiarioEntity li WHERE li.agencia = :agencia AND li.conta= :conta and li.data = :data")
public class LimiteDiarioEntity extends PanacheEntity {

    @NotNull(message = "Informar o código da Agência.")
    @Schema(description = "Código da Agência")
    private Long agencia;
    @NotNull(message = "Informar o código da Conta.")
    @Schema(description = "Código da Conta")
    private Long conta;
    @Schema(description = "Data de Limite")
    @NotNull(message = "Data do Limite")
    private LocalDate data;
    @Schema(description = "Valor de Limite")
    @NotNull(message = "valor do limite.")
    private BigDecimal valor;

}
