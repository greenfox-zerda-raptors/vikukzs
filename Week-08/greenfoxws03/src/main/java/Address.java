import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Zsuzska on 2016. 12. 14..
 */
@DatabaseTable(tableName = "address")
public class Address {
    @DatabaseField(generatedId = true)
    private int address_id;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private String postCode;
    @DatabaseField
    private String country;
    public Address(){}

    public Address(String street, String city, String postCode, String country){
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getPostCode() + getCity() + getCountry() + getStreet();
    }
}
