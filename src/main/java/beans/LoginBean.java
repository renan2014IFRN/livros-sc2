/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import modelo.Usuario;

/**
 *
 * @author renan
 */
@Named
@RequestScoped
public class LoginBean {
    
    @Inject
    private Usuario usuario;
    
    public void realizarLogin() {
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
            
    
    
    
}
