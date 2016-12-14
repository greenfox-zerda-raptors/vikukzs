/**
 * Created by Zsuzska on 2016. 12. 14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/workshop02?user=root&password=jelszo&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        ArrayList<String> accountNames = new ArrayList<>(Arrays.asList("Captain America", "Iron Man", "Wolverine", "Hulk", "Loki"));
        ArrayList<String> accountPaswords = new ArrayList<>(Arrays.asList("uejnsd632**234.", "dfgad", "jhdksfn", "hfdjghjn", "khjd"));

        for (int i = 0; i < accountNames.size(); i++) {
            createAccountIfNotExists(accountDao, new Account(accountNames.get(i), accountPaswords.get(i)));
        }

        for (Account accountnames : accountDao) {
            System.out.println(accountnames.getName());
        }

        QueryBuilder<Account, String> accounts = accountDao.queryBuilder();

        List<Account> accountList = accounts.selectColumns("name").orderBy("name", true).query();

        for (Account acc : accountList) {
            System.out.println(acc.getName());
        }

    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}