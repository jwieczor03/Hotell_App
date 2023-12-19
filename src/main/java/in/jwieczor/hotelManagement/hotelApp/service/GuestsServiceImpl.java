package in.jwieczor.hotelManagement.hotelApp.service;

import in.jwieczor.hotelManagement.hotelApp.dao.GuestsDAO;

import in.jwieczor.hotelManagement.hotelApp.model.Guests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GuestsServiceImpl implements GuestsService{

    @Autowired
    private GuestsDAO guestsDAO;

    @Transactional
    @Override
    public List<Guests> get() {
        return guestsDAO.get();
    }

    @Transactional
    @Override
    public Guests get(int id) {
        return guestsDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Guests guest) {
        guestsDAO.save(guest);
    }

    @Transactional
    @Override
    public void delete(int id) {
        guestsDAO.delete(id);
    }
}

