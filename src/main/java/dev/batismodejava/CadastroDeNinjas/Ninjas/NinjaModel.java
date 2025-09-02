package dev.batismodejava.CadastroDeNinjas.Ninjas;

import dev.batismodejava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//Entity transforma uma classe em uma base do banco de dados
@Entity
@Table(name ="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name ="nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "rank")
    private String rank;


    @Column(name ="idade")
    private int idade;


    @ManyToOne
    @JoinColumn(name ="missoes_id") // chave estrangeira
    private MissoesModel missoes;


}
