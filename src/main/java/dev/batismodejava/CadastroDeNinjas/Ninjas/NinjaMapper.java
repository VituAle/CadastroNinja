package dev.batismodejava.CadastroDeNinjas.Ninjas;

<<<<<<< HEAD
=======
import lombok.Getter;
import lombok.Setter;
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
<<<<<<< HEAD

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.getId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
=======
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setIdade(ninjaDTO.getIdade());
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
        ninjaModel.setMissoes(ninjaDTO.getMissoes());

        return ninjaModel;
    }

<<<<<<< HEAD
    public NinjaDTO map(NinjaModel ninjaModel) {

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId(ninjaDTO.getId()));
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        ninjaDTO.setRank(ninjaModel.getRank());

        return ninjaDTO;
    }
=======


        public NinjaDTO map(NinjaModel ninjaModel) {

            NinjaDTO ninjaDTO = new NinjaDTO();
            ninjaDTO.setId(ninjaModel.getId());
            ninjaDTO.setNome(ninjaModel.getNome());
            ninjaDTO.setEmail(ninjaModel.getEmail());
            ninjaDTO.setRank(ninjaModel.getRank());
            ninjaDTO.setIdade(ninjaModel.getIdade());
            ninjaDTO.setMissoes(ninjaModel.getMissoes());

            return ninjaDTO;


        }
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
}
