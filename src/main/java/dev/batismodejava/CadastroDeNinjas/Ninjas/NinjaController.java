package dev.batismodejava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping ("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (create)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Mostrar todos os Ninjas (read)
    @GetMapping("/listar")
    public List<NinjaModel> listarTodosOsNinjas() {
        return ninjaService.listarNinjas();
    }

    //Mostar Ninja por ID (read)
    @GetMapping("/listarID")
    public String listarTodosOsNinjasPorId() {
        return "Listar todos os Ninjas por id";
    }

    //Alterar dados dos Ninjas (update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por id";
    }

    //Deletar Ninja (delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }
}
