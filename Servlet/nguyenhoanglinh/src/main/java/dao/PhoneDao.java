package dao;

import entity.PhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PhoneDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public List<PhoneEntity> getAll() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<PhoneEntity> list = em.createQuery("select p from PhoneEntity p", PhoneEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public void insertProduct(PhoneEntity phoneEntity) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phoneEntity);
        em.getTransaction().commit();
        em.close();
    }


}
