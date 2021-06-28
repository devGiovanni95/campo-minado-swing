package br.com.cadastro.alunos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alunos")
public class AlunosController extends Alunos{

    private final List<Alunos> alunos;

    public AlunosController(List<Alunos> alunos) {
        super();
        this.alunos = new ArrayList<>();
    }

    @GetMapping
    public List<Alunos> findAll(@RequestParam(required = false) Integer id, String nome, Integer idade){
        if (alunos != null){
            return  alunos.stream().collect(Collectors.toList());
        }
        return alunos;

    }

    @GetMapping("/{id}")
    public Alunos findById(@PathVariable("id") Integer id){
        return this.alunos.stream()
                .filter(alunoId -> alunoId.getId().equals(id))
                .findFirst().orElse(null);
    }

//
//    @PostMapping
//    public  ResponseEntity<Integer> add(RequestBody  Integer id, String nome, Integer idade ){
//        if (findById().getId() == null){
//            Alunos.
//        }
//    }


    @PostMapping
    public  ResponseEntity<Alunos> add(@RequestBody Alunos aluno){
        if (aluno.getId() == null && aluno.getIdade() == null && aluno.getNome() == null ){
            aluno.setId(alunos.size() + 1);
            aluno.setIdade();
            aluno.setNome();
        }
        alunos.add(aluno);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
