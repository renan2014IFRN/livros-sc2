/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author João
 */

@ApplicationScoped
public class JPAUtil {
    
    private static EntityManagerFactory entityManagerFactory;
    
    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    }
    
    @Produces
    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
    @PreDestroy
    public static void fecharEntityManageFactory(){
        if (entityManagerFactory.isOpen())
            entityManagerFactory.close();
    } 
    
    public static void fecharEntityManager(@Disposes EntityManager entityManager){
        if (entityManager.isOpen())
            entityManager.close();
    }
    
}
