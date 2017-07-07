/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author renan
 */
// jdskds
public class CriarAtualizarBanco {
    
    private CriarAtualizarBanco() {
        
    }
    
    public static void main(String[] args) {
        JPAUtil.fecharEntityManager(JPAUtil.getEntityManager());
        JPAUtil.fecharEntityManageFactory();
    }
    
}
