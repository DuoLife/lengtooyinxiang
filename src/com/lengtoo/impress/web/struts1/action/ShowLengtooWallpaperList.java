/**
* <p>Title: ShowLengtooWallpaperList.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-22
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;
import com.lengtoo.impress.returndata.ReturnData;
import com.lengtoo.impress.service.ILengtooWallpaperService;

/**
 * <p>Title: ShowLengtooWallpaperList.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-22
 * Email: vip6ming@126.com
 */
public class ShowLengtooWallpaperList extends Action{

	private ILengtooWallpaperService service;
	public void setService(ILengtooWallpaperService service) {
		this.service = service;
	}
	
	private static final String url = "http://lengtucao.com/lengtooyinxiang";
	//private static final String url = "http://192.168.2.101:2103/lengtooyinxiang";
	//Logger log = Logger.getLogger("abc");
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		boolean refresh = Boolean.parseBoolean(request.getParameter("refresh"));
		String date = null;
		if(refresh) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sf.format(new Date());
		}else {
			date = request.getParameter("date");
		}
		paramsMap.put(date, date);
		//paramsMap.put("refresh", refresh);
		List<Map> list =  service.getAllWallpaperMesg(date);
		for (Map m: list) {
			String bStr = (String) m.get("Big_imgurl");
			String sStr = (String) m.get("Small_imgurl");
			m.put("Big_imgurl", url + bStr); 
			m.put("Small_imgurl", url + sStr); 
		}
		result.put("lengtoocardlist", list);
		Gson g = new Gson();
		String json = g.toJson(list);
		ReturnData.returnData(response, result);
		return null;
	}

}