/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Odontologist;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author diazj
 */
public class OdontologistJpaController implements Serializable {

    public OdontologistJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public OdontologistJpaController(){
        emf = Persistence.createEntityManagerFactory("DentalClinicPU");
    }
    public void create(Odontologist odontologist) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(odontologist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Odontologist odontologist) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            odontologist = em.merge(odontologist);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = odontologist.getId();
                if (findOdontologist(id) == null) {
                    throw new NonexistentEntityException("The odontologist with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Odontologist odontologist;
            try {
                odontologist = em.getReference(Odontologist.class, id);
                odontologist.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The odontologist with id " + id + " no longer exists.", enfe);
            }
            em.remove(odontologist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Odontologist> findOdontologistEntities() {
        return findOdontologistEntities(true, -1, -1);
    }

    public List<Odontologist> findOdontologistEntities(int maxResults, int firstResult) {
        return findOdontologistEntities(false, maxResults, firstResult);
    }

    private List<Odontologist> findOdontologistEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Odontologist.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Odontologist findOdontologist(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odontologist.class, id);
        } finally {
            em.close();
        }
    }

    public int getOdontologistCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Odontologist> rt = cq.from(Odontologist.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
