package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Libro;

public class JPARemove {
    public static void main(String[] args) {
        //referncias
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //referencia un libro
        Libro libro=em.find(Libro.class, "A3");

        //eliminar libro
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

}
