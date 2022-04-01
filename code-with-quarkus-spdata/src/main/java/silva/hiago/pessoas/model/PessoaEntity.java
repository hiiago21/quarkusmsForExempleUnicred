package silva.hiago.pessoas.model;

import lombok.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "pessoas")
public class PessoaEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull(message = "Informar o código da Agência.")
    @Schema(description = "Código da Agência")
    private String nome;

    @Column
    @NotNull(message = "Informar o código da Agência.")
    @Schema(description = "Código da Agência")
    private String cpfCnpj;

    @NotNull(message = "Informar o código da Agência.")
    @Schema(description = "Código da Agência")
    private Long agencia;

    @NotNull(message = "Informar o código da Conta.")
    @Schema(description = "Código da Conta")
    private Long conta;

}
