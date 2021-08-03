package DBO;

import org.apache.tinkerpop.gremlin.structure.T;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 11;
        List<Integer> list = new ArrayList<>();
        int a;
        do {
            a = x + (int) (Math.random() * ((y - x) + 1));
            if (!list.contains(a)) {
                list.add(a);
                System.out.println("Добавили: "+a);
            }
        }
        while (list.size() <= 10);
        System.out.println(list);


        // EntityManager entityManager = HibernateUtil.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();

//        entityManager.persist(courses);
//        entityManager.getTransaction().commit();
//        entityManager.close();

//        entityManager.getTransaction().begin();
//        Teacher teacher1 = new Teacher();
//        Teacher teacher2 = new Teacher();
//        Courses courses = new Courses();
//
//        courses.setName("Java");
//        courses.setTask("task 1: create maven project");
//        courses.setId(1);
//
//        teacher1.setId(1);
//        teacher1.setName("Ирина");
//        teacher1.setReview("Отлично!");
//        teacher1.setCourses(courses);
//
//        Student student = new Student();
//        student.setName("Илья");
//        student.setMark("5");
//        Set<Courses> set = new HashSet<>();
//        Set<Teacher> set1 = new HashSet<>();
//        Set<Student> set2 = new HashSet<>();
//        set2.add(student);
//        set1.add(teacher1);
//        set.add(courses);
//        student.setCoursesSet(set);
//        student.setTeacherSet(set1);
//        teacher1.setStudents(set2);
//        entityManager.persist(teacher1);
//        entityManager.persist(student);
//        entityManager.getTransaction().commit();
//        entityManager.close();
        //teacher2.setId(1);


//
//        teacher2.setName("Андрей");
//        teacher1.setCourses("JAVA EE");
//        teacher2.setCourses("JAVA SE");


//        Person1 person1 = new Person1();
//        person1.setName("Илья");
//        person1.setSuname("Кечко");
//        entityManager.persist(person1);
    }
}
