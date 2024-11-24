package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Curso;
import pe.edu.cibertec.domain.Estudiante;

import java.util.List;

public class JPAManyToMany {

    public static void main(String[] args) {
        //referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //amtes de crear las consultas tuve que generar nuevamente los datos, lo más probable que sea asi más adelante
        //obtner estudiante
        Estudiante estudiante =em.find(Estudiante.class, "E1");

        //obtener cursos
        List<Curso> cursos = estudiante.getCursos();

        //mostrar resultado
        cursos.forEach(System.out::println);

    }
}
