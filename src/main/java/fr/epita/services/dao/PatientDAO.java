package fr.epita.services.dao;

import fr.epita.datamodel.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;

@Repository("patientDAO")
public class PatientDAO {

    @Inject
    @Named("session")
    SessionFactory sessionFactory;

    public void insert(Patient p){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(p);
        transaction.commit();
    }
    public void update(Patient p){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(p);
        transaction.commit();
    }
    public void delete(Patient p){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(p);
        transaction.commit();
    }

    public List<Patient> search(Patient patient) {
        String jpql = "select c from Patient c where c.pat_firstname = :fname";
        Session session = sessionFactory.openSession();
        Query<Patient> query = session.createQuery(jpql, Patient.class);
        query.setParameter("fname", patient.getPat_firstname());
        List<Patient> output = query.list();
        session.close();
        return output;
    }
}
