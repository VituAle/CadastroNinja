package dev.batismodejava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar todos os Ninjas";
    }

    //Mostar Ninja por ID (read)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar todos os Ninjas por id";
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
