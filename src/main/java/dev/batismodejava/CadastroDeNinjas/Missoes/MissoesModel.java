package dev.batismodejava.CadastroDeNinjas.Missoes;

import dev.batismodejava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_cadastro_de_missoes")

public class MissoesModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    private NinjaModel ninja;

    @OneToMany( mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nome, String dificuldade, NinjaModel ninja, List<NinjaModel> ninjas) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
        this.ninjas = ninjas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }
}
