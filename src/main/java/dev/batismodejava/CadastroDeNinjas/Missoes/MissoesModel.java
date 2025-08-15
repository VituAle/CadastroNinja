package dev.batismodejava.CadastroDeNinjas.Missoes;

import dev.batismodejava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_cadastro_de_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class MissoesModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    private NinjaModel ninja;

    @OneToMany( mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
