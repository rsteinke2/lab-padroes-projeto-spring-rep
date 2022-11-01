package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
/*
 Interface que define o padrão "Strategy" no domínio de cliente. Com
 isso, se necessário, podemos ter multiplas implementações dessa mesma
 interface.
 Implementações de buscar a todos, buscar por Id, inserir, atualizar e deletar.
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
