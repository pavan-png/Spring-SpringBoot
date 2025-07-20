package in.orcas.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import in.orcas.model.StudentBO;

public class StudentDAOImpl {
    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory; // Add this
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
        this.sessionFactory = sessionFactory; // Add this
    }
    
    public void save(StudentBO bo) {
        // Use SessionFactory directly for write operations
        Session session = sessionFactory.getCurrentSession();
        session.save(bo);
    }
    public void update(StudentBO bo) {
        Session session = sessionFactory.getCurrentSession();
        session.update(bo);
    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        StudentBO bo = session.get(StudentBO.class, id);
        if (bo != null) {
            session.delete(bo);
        }
    }
    public StudentBO fetchById(int id) {
        return hibernateTemplate.get(StudentBO.class, id);
    }
    
    public List<StudentBO> fetchAll() {
        // Use HibernateTemplate for read operations (this works fine)
        return hibernateTemplate.loadAll(StudentBO.class);
    }
}