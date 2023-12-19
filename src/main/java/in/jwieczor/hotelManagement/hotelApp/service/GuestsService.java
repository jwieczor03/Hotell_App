package in.jwieczor.hotelManagement.hotelApp.service;

import in.jwieczor.hotelManagement.hotelApp.model.Guests;

import java.util.List;

public interface GuestsService {
    List<Guests> get();

    Guests get(int id);

    void save(Guests gust);

    void delete(int id);
}
