/**
 * Created by Zsuzska on 2016. 12. 14..
 */
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DatabaseTable(tableName = "accounts")
public class Account {
    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;
    @DatabaseField(foreign = true)
    public Address address;
    public Account() {}
    public Account(String name, String password ) {
        this.name = name;
        this.password = password;
    }
    public Account(String name, String password, Address address){
        this.name = name;
        this.password = password;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "Address: " + address.toString();
    }
}