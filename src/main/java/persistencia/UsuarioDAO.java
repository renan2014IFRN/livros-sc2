/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Usuario;

/**
 *
 * @author renan
 */
public class UsuarioDAO extends DAO<Usuario,Integer>{
    
    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    public boolean existeUsuario(Usuario usuario){
        String jpql = "select u from Usuario where u.email = :pemail and u.senha = :psenha";    
        Query query = getEntityManager().createQuery(jpql, Usuario.class);
        query.setParameter("pemail", usuario.getEmail());
        query.setParameter("psenha", usuario.getSenha());
        Usuario usuarioConsulta = (Usuario) query.getSingleResult();
        return usuarioConsulta != null;
    }
    
}
