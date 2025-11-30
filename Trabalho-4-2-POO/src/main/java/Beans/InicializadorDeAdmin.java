package Beans; // Crie um novo pacote ou use um existente

import Entidades.Usuario;
import Repository.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Startup // Garante que este EJB seja carregado na inicialização
@Singleton // Garante que haverá apenas uma instância no aplicativo
public class InicializadorDeAdmin {

    @Inject
    UsuarioRepository repository;

    @PostConstruct // O método será chamado imediatamente após a injeção de dependência
    public void init() {
        System.out.println("Verificando usuário Admin...");
        
        // Tentamos buscar o admin
        Usuario adminExistente = repository.buscarPorLogin("admin"); 

        if (adminExistente == null) {
            // Se o buscarPorLogin retornou null (ou lançou NoResultException, 
            // indicando que a lista estava vazia), nós o criamos.
            
            Usuario novoAdmin = new Usuario();
            novoAdmin.setNome("Admin");
            novoAdmin.setLogin("admin");
            novoAdmin.setSenha("admin");
            novoAdmin.setAdm(true); 
            
            repository.cadastrar(novoAdmin);
            System.out.println("Usuário Admin criado com sucesso!");
        } else {
            System.out.println("Usuário Admin já existe.");
        }
    }
}