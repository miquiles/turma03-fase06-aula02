package moderna.primeiroprojeto.controller;

import moderna.primeiroprojeto.model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping("/exibe-texto")
    public String retornaUmTexto(){
        return "Olá mundo";
    }

    @GetMapping("/exibe-pessoa")
    public Pessoa exibePessoa(){
        Pessoa p1 = new Pessoa();
        p1.setId(1L);
        p1.setNome("Adriano");
        p1.setDocumento("111.111.114.11");
        return p1;
    }

    @GetMapping("/exibe-pessoas")
    public List<Pessoa> exibePessoas(){
        Pessoa p1 = new Pessoa();
        p1.setId(1L);
        p1.setNome("Adriano");
        p1.setDocumento("111.111.114.11");

        Pessoa p2 = new Pessoa();
        p2.setId(2L);
        p2.setNome("Zandra");
        p2.setDocumento("888.111.114.11");

        Pessoa p3 = new Pessoa();
        p3.setId(3L);
        p3.setNome("Fernanda");
        p3.setDocumento("777.111.114.11");

        List listaPessoa = new ArrayList();

        listaPessoa.add(p1);
        listaPessoa.add(p2);
        listaPessoa.add(p3);

        return listaPessoa;

    }

    @GetMapping("/soma/{numero1}/{numero2}")
    public int soma(@PathVariable("numero1") int n1, @PathVariable("numero2") int n2){
        return n1 + n2;
    }

}
