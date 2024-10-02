
package com.setorPessoal.services;

import com.setorPessoal.model.Funcionario;
import com.setorPessoal.repository.FuncionarioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    final FuncionarioRepository funcionarioRepository;
    
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    
    @Transactional
    public Funcionario save(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }
    
    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }
            
}
