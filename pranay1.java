package apphw;

import com.opensymphony.xwork2.ActionSupport;

public class pranay1 extends ActionSupport{
 private static final long serialVersionUID = 1L;
 
 private String uname;
 
 public String getUname() {
 return uname;
 }
 
 public void setUname(String uname) {
 this.uname = uname;
 }
 
 public String execute()
 {
 if(uname.equals("pranay"))
 {
 return SUCCESS;
 
 }else
 return ERROR;
 }
 
}