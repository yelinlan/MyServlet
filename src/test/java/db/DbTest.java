package db;

import com.yll.servlet.utils.DbUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *@项目名称: MyServlet
 *@类名称: main
 *@类描述:
 *@创建人: yll
 *@创建时间: 2022/11/9 20:34
 **/
public class DbTest {
	@Test
	public void test01() {
		Connection connection = null;
		PreparedStatement sql;
		try {
			connection = DbUtils.getConnection();
			connection.setAutoCommit(false);
			sql = connection.prepareStatement("insert into student(name, pwd, sex, birthday, address, email, money)\n"
					+ "VALUES ('aaaaa','a','a','a','a','a',0)");
			int a = sql.executeUpdate();
			assert a == 1;
//			int i = 1 / 0;
			connection.commit();
		} catch (SQLException throwables) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			throwables.printStackTrace();
		} finally {
			try {
				assert connection != null;
				connection.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
	}
}