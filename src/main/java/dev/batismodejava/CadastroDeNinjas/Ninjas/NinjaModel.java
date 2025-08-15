package dev.batismodejava.CadastroDeNinjas.Ninjas;

import dev.batismodejava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma base do banco de dados
@Entity
@Table(name = "tb_cadastro_de_ninjas")

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;


    public NinjaModel() {
    }

    public NinjaModel(String email, String nome, int idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }

    public NinjaModel(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
