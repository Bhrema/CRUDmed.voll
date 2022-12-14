package med.voll.api.controller;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.MedicoRepository;
import med.voll.api.medico.dadosCadastroMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody dadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}
