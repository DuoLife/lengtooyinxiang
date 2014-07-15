/**
* <p>Title: TestMybatis.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-6-27
* @version 1.0
*/
package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: TestMybatis.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public class TestMybatis {
	
	private static SqlSession session = null;
	
	static{
		SqlSessionFactory sf = null;
		String resource = "configration.xml";
		InputStream inputStream;
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sf.format(new Date());
		List<LengtooCard> list = session.selectList("LengtooCard.selectAll", "Mon Jul 14 19:03:57 CST 2014"); 
		for(LengtooCard card: list) {
			System.out.println(card);
		}
	}
}
