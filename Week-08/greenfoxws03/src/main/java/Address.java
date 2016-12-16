import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DatabaseTable(tableName = "address")
public class Address {
    @DatabaseField (generatedId = true)
    private Integer  address_id;
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
    @Override
    public String toString() {
        return getPostCode() + " " +  getCity()+ " " + getCountry() + " " + getStreet();
    }
}
