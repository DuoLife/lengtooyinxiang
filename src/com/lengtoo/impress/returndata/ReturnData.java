/**
* <p>Title: ReturnData.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-2
* @version 1.0
*/
package com.lengtoo.impress.returndata;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * <p>Title: ReturnData.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-2
 * Email: vip6ming@126.com
 */
public class ReturnData {
	
	public static void returnData(HttpServletResponse response) {
		Map result = new HashMap();
		result.put("success", false);
		result.put("msg", 0);
		processjson(response, result);
	}
	
	public static void returnData(HttpServletResponse response, Map result) {
		processjson(response, result);
	}
	public static void returnData(HttpServletResponse response, Map result, int msg) {
		result.put("msg", msg);
		processjson(response, result);
	}
	public static void returnData(HttpServletResponse response, boolean success, int msg) {
		Map result = new HashMap();
		result.put("success", success);
		result.put("msg", msg);
		processjson(response, result);
	}
	public static void returnData(HttpServletResponse response, boolean success, int msg, String str) {
		Map result = new HashMap();
		result.put("success", success);
		result.put("msg", msg);
		result.put("str", str);
		processjson(response, result);
	}
	public static void returnData(HttpServletResponse response, boolean success) {
		Map result = new HashMap();
		result.put("success", success);
		processjson(response, result);
	}
	
	public static void returnData(HttpServletResponse response, Map result, boolean success, int msg) {
		result.put("success", success);
		result.put("msg", msg);
		processjson(response, result);
	}
	public static void processjson(HttpServletResponse response, Map result) {
		Gson g = new Gson();
		String json = g.toJson(result);
		//System.out.println(json);
		try {
			//return data
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().print(json);
			response.getWriter().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
