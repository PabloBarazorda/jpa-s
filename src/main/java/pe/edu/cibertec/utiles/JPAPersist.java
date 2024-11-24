package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // registrar libro

        em.getTransaction().begin();

        em.persist(new Libro("A4", "Dune","Frank",new Date(), 100.3));
        em.getTransaction().commit();


    }
}
