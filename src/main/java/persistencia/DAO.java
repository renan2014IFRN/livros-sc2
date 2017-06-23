/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author João
 * @param <T>
 * @param <I>
 */
public class DAO <T,I>{
    
    private Class<T> classe;
    private EntityManager entityManager;

    public DAO(Class<T> classe, EntityManager entityManager) {
        this.classe = classe;
        this.entityManager = entityManager;
    }
    
    public void salvar(T t){
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();        
    }
    
    public void atualizar(T t){
        entityManager.getTransaction().begin();
        entityManager.merge(t);
        entityManager.getTransaction().commit();
    }
    
    public T buscar(I id){
        return entityManager.find(classe, id);
    }
    
    public void remove(T t){
        entityManager.getTransaction().begin();
        entityManager.remove(t);
        entityManager.getTransaction().commit();        
    }
    
    public List<T> listar(){
        String jpql = "select a from " + classe.getSimpleName() + " a";
        return entityManager.createQuery(jpql, classe).getResultList();
    }
}
