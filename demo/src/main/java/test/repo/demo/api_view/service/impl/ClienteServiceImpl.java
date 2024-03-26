package test.repo.demo.api_view.service.impl;

import org.springframework.stereotype.Service;

import test.repo.demo.api_view.model.Cliente;
import test.repo.demo.api_view.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
