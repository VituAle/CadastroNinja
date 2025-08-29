package dev.batismodejava.CadastroDeNinjas.Ninjas;

import dev.batismodejava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {


    private long id;
    private String nome;
    private String email;
    private String rank;
    private int idade;
    private MissoesModel missoes;


}
