package pe.edu.cibertec.queries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Libro;

import java.util.List;

public class JPAQuery {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // select
        // TypedQuery<Libro> query = em.createQuery("select l from Libro l = :autor", Libro.class);
        // query.setParameter("autor","Claudia");

        // select - where - Comparativos (> < =)
        // TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio > :precio", Libro.class);
        // query.setParameter("precio","50");


        // select - between
        // TypedQuery<Libro>  query = em.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
        // query.setParameter("inicio",30);
        // query.setParameter("fin",50);

        // select valores escaleras - upper
        // TypedQuery<String> query = em.createQuery("select distinct upper(l.autor) from Libro l where l.autor in ('Cesar','Claudia')", String.class);

        // select - order by
        TypedQuery<Libro> query = em.createQuery("select l from Libro l order by l.autor", Libro.class);


        //obtener resultados
        List<Libro> resultado = query.getResultList();
        resultado.forEach(System.out::println);
    }
}
