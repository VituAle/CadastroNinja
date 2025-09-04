package dev.batismodejava.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

<<<<<<< HEAD
    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;
=======
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

<<<<<<< HEAD
    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
=======
    //Listar todos os meus Ninjas
    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel>  ninjas = ninjaRepository.findAll();
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

<<<<<<< HEAD
    public NinjaDTO listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
=======
    // Listar todos os ninjas por id
    public NinjaDTO listarNinjasPorId(Long id) {
        Optional<NinjaDTO> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    //criar um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = new NinjaMapper().map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);

>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
    }

    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

<<<<<<< HEAD
=======
    // Atualizar ninja
>>>>>>> bcaa710f485a8b9d72729402fa6f4e2963500545
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

}
