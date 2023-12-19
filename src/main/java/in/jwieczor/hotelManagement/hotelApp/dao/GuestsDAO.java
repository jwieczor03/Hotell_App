package in.jwieczor.hotelManagement.hotelApp.dao;


import in.jwieczor.hotelManagement.hotelApp.model.Guests;

import java.util.List;

public interface GuestsDAO {
    List<Guests> get();

    Guests get(int id);

    void save(Guests guest);

    void delete(int id);

}
