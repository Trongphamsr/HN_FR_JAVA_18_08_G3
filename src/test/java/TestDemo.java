import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.fsoft.project.dao.MemberDao;
import com.fsoft.project.dao.impl.MemberDaoImpl;
import com.fsoft.project.db.DbHelper;
import com.fsoft.project.entity.Member;
import com.opensymphony.xwork2.interceptor.annotations.Before;

public class TestDemo {

	MemberDao memberDao; 
	
	@Before
	public void setUp() throws Exception {
		memberDao=new MemberDaoImpl();
	}
	
	@Test
    public void db() {
		Connection conn = DbHelper.getConnection();
		assertNotNull(conn);
    }
	
	@Test
	public void addMemberSuccess(){
		Member member =new Member("pham", "van trong", "ha noi", "0978657463", false, "anh@gmail.com","hanoi");
		int actual,expected;
		try {
			actual = memberDao.registerMember(member.getFirstName(), member.getLastName(), member.getAddress(), member.getPhone(), false, member.getEmail(), member.getPassword());
		    expected=1;
			assertEquals(expected, actual);
		} catch (SQLException e) {
			
			System.out.println("loi gi day" +e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
