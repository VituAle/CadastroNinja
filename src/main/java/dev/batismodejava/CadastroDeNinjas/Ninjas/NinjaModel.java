package dev.batismodejava.CadastroDeNinjas.Ninjas;

import dev.batismodejava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
=======
import lombok.*;

import java.util.List;
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545

//Entity transforma uma classe em uma base do banco de dados
@Entity
@Table(name ="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@ToString
=======
@Getter
@Setter
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private long id;

    @Column(name ="nome")
    private String nome;

    @Column(unique = true)
    private String email;

<<<<<<< HEAD
    @Column(name ="rank")
    private String rank;
    
=======
    @Column (name = "rank")
    private String rank;

>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545

    @Column(name ="idade")
    private int idade;


    @ManyToOne
    @JoinColumn(name ="missoes_id") // chave estrangeira
    private MissoesModel missoes;

<<<<<<< HEAD
    public long getId(long id) {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
=======

>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
}

