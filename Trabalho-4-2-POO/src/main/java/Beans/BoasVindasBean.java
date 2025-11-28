package Beans;

import Entidades.Usuario;
import JPA.UsuarioRepositoryJPA;
import jakarta.inject.Inject;

public class BoasVindasBean {

    @Inject
    UsuarioRepositoryJPA repository;

    Usuario usuario;

    public void criarUsuarioAdmin() {
        usuario = repository.criacaoUsuarioAdmin(usuario);
    }

    public String fazerCadastro() {
        if (repository.verificacaoExistenciaUsuario(usuario)) {
            return "CadastroJSF.xhtml";
        } else {
            repository.cadastrar(usuario);
            return "CadastroJSF.xhtml";
        }
    }

    public String fazerLogin() {
        if (repository.verificacaoExistenciaUsuario(usuario)) {
            return "LoginJSF.xhtml";
        } else {
            repository.cadastrar(usuario);
            return "LoginJSF.xhtml";
        }
    }

}
