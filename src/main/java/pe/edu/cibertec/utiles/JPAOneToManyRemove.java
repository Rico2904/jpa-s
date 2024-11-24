package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Categoria;

public class JPAOneToManyRemove {
    public static void main(String[] args) {
        //referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //referenciar a alguna categoria
        Categoria categoria = em.find(Categoria.class, "C2");

        //remove aca tengo que cambiar el PERSIST PERSIST a REMOVE, mejor ponerlo entre llaves pesis y remove
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();
    }

}
