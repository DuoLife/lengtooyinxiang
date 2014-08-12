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

import com.lengtoo.game.dao.po.LengtooGame;
import com.lengtoo.impress.dao.po.LengtooCard;
import com.lengtoo.impress.dao.po.LengtooWallpaper;

/**
 * <p>Title: TestMybatis.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public class TestGame {
	
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
		List<LengtooGame> list = session.selectList("LengtooGame.selectAll", 10); 
		for(LengtooGame card: list) {
			System.out.println(card);
		}
	}
}
