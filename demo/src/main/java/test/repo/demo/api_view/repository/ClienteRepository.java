package test.repo.demo.api_view.repository;

import org.springframework.stereotype.Repository;

import test.repo.demo.api_view.model.Cliente;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
    

}
