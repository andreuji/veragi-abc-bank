package br.com.accesstage.veragi.platform.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_agenda_agen")
public class VeragiBancoABC {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_veragi_banco_abc")
    @SequenceGenerator(name = "sq_veragi_banco_abc_vabc", sequenceName = "sq_veragi_banco_abc", allocationSize = 1)
    @Column(name = "id_veragi_banco_abc", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long idOperationBank;

    @Column(nullable = false)
    private Long idOperationVeragi;
}
