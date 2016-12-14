/**
 * Created by Zsuzska on 2016. 12. 14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=jelszo&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account accountCaptain = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, accountCaptain);

        accountCaptain = accountDao.queryForId("Captain America");
        System.out.println("Account: " + accountCaptain.toString());

        Account accountIron = new Account("Iron Man", "dkjfgnke");
        createAccountIfNotExists(accountDao, accountIron);

        accountIron = accountDao.queryForId("Iron Man");
        System.out.println("Account: " + accountIron.toString());

        Account accountWolverine = new Account("Wolverine", "dkjfgnke");
        createAccountIfNotExists(accountDao, accountWolverine);

        accountWolverine = accountDao.queryForId("Wolverine");
        System.out.println("Account: " + accountWolverine.toString());



    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}