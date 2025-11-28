package JPA;

import Entidades.Usuario;
import Repository.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class UsuarioRepositoryJPA implements UsuarioRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public Usuario criacaoUsuarioAdmin(Usuario usuario){
        usuario.setNome("Admin");
        usuario.setLogin("admin");
        usuario.setSenha("admin");
        return usuario;
    }

    public boolean verificacaoExistenciaUsuario(Usuario usuario){
        if(em.contains(usuario)){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    @Transactional
    public void editarNome(Usuario usuario, String novoNome) {
        usuario.setNome(novoNome);
        em.merge(usuario); 
    }

    @Override
    @Transactional
    public void alterarSenha(Usuario usuario, String novaSenha) {
        usuario.setSenha(novaSenha);
        em.merge(usuario); 
    }

    @Override
    @Transactional
    public void cadastrar(Usuario usuario) {
        em.persist(usuario);
    }
    
    
}
