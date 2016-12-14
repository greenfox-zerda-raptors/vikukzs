/**
 * Created by Zsuzska on 2016. 12. 14..
 */
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Zsuzska on 2016. 12. 14..
 */

@DatabaseTable(tableName = "accounts")
public class Account {
    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;
    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    public Address address;
    public Account() {
// ORMLite needs a no-arg constructor
    }
    public Account(String name, String password ) {
        this.name = name;
        this.password = password;
    }

    public Account(String name, String password, Address address){
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "Address: " + address.toString();
    }
}