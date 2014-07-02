/**
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-6-27
* @version 1.0
*/
package test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lengtoo.impress.dao.ILengtooCardDao;
import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: TestMybatis_spring.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public class TestMybatis_spring {

	private static String path = "applicationContext.xml";
	private static ILengtooCardDao dao;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		dao = (ILengtooCardDao) context.getBean("cardDao");
		List<Map> l = dao.getAllCardMesg("");
		for(Map m: l) {
			System.out.println(m);
		}
	}
}
