package in.jwieczor.hotelManagement.hotelApp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Guests", schema = "dbo", catalog = "dbad_s485704")
public class GuestsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "id_card_series")
    private String idCardSeries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCardSeries() {
        return idCardSeries;
    }

    public void setIdCardSeries(String idCardSeries) {
        this.idCardSeries = idCardSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestsEntity that = (GuestsEntity) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(email, that.email) && Objects.equals(idCardSeries, that.idCardSeries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, email, idCardSeries);
    }
}
