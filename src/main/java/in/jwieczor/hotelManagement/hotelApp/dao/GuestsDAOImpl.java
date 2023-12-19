package in.jwieczor.hotelManagement.hotelApp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import in.jwieczor.hotelManagement.hotelApp.model.Guests;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@SuppressWarnings("JpaQlInspection")
@Repository
public class GuestsDAOImpl implements GuestsDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Guests> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Guests> query = currentSession.createQuery("from Guests", Guests.class);
        List<Guests> list = query.getResultList();
        return list;
    }

    @Override
    public Guests get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Guests guestObj = currentSession.get(Guests.class, id);
        return guestObj;
    }

    @Override
    public void save(Guests guest) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(guest);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Guests guestObj = currentSession.get(Guests.class, id);
        currentSession.delete(guestObj);
    }

}
