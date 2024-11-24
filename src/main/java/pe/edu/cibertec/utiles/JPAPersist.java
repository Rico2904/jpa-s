package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {
        //referncias
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //registrar libro
        em.getTransaction().begin();
        em.persist(new Libro("A3","Titulo 3","Autor 3", new Date(),100.5,null));
        em.getTransaction().commit();

    }

}
