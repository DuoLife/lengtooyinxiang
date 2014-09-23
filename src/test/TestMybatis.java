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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
//		List<LengtooWallpaper> list = session.selectList("LengtooWallpaper.selectAll", "2014-10-22 16:03:06"); 
//		for(LengtooWallpaper card: list) {
//			System.out.println(card);
//		}
		Map paramsMap = new HashMap();
		paramsMap.put("emojiid", 1);
		try {
			int i = session.update("LengtooEmoji.numberofusePlus", paramsMap);
			session.commit();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
