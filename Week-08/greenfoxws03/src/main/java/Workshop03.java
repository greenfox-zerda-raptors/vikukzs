/**
 * Created by Zsuzska on 2016. 12. 14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class Workshop03 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=jelszo&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);

        Dao<Address, String> addressDao = DaoManager.createDao(connectionSource, Address.class);

        Address addressCaptain = new Address("Andrassy", "Budapest", "1061", "Hungary");

        Account account = new Account("Captain America", "uejnsd632**234.", addressCaptain);
        createAccountIfNotExists(accountDao, account);

        account = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account.toString());
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}