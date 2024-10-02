
package com.setorPessoal.controller;

import com.setorPessoal.model.Funcionario;
import com.setorPessoal.services.FuncionarioService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Funcionario")
public class funcionarioController {
    
    final FuncionarioService funcionarioService;
    
    public funcionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }
    
    @PostMapping 
    public ResponseEntity<Object> saveFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.save(funcionario));
    }
    
    @GetMapping
    public ResponseEntity<List<Funcionario>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findAll());
    }
    
    
}
