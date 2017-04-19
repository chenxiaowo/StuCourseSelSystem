package org.action;

import java.io.*;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.dao.XgDao;
import org.dao.imp.XgDaoImp;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File upload;
	private String uploadFileName;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String execute() throws Exception {
		
		ActionContext ac = ActionContext.getContext();   
        ServletContext sc = (ServletContext) ac.get(ServletActionContext.SERVLET_CONTEXT);   
        String path = sc.getRealPath("/");  
        System.out.println("new path := " + path);  
		
		InputStream is = new FileInputStream(getUpload());
		OutputStream os = new FileOutputStream(path+"\\images\\" + uploadFileName);
		byte buffer[] = new byte[1024];
		int count = 0;
		while ((count = is.read(buffer)) > 0) {
			os.write(buffer, 0, count);
		}
		os.close();
		is.close();
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		xs.setZp("images/"+uploadFileName);
		session.put("xsxx",	xs);
		XgDao xg = new XgDaoImp();
		xg.xgXs(xs);
		
		session.put("xsxx", xs);
		return SUCCESS;
	}

}
