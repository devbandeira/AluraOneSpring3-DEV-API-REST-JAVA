package med.voll.api.endereco;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.medico.endereco;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(endereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.numero();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }
}
