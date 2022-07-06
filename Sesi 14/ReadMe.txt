Dynamic web module 5
Target runtuime ->new -> apache v10-> centang create->next -> download & install/ browse apache-> pilih jre jdk 17
com.belajar.model itu new folder 


<welcome-file-list>  
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
       <servlet-name>LoginServlet</servlet-name>
       <servlet-class>com.welcome.web.LoginController</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>LoginServlet</servlet-name>
       <url-pattern>/doLogin</url-pattern>
   </servlet-mapping>
   
  <servlet>
    <description></description>
    <display-name>HelloServlet</display-name>
    <servlet-name>HelloServlet</servlet-name>
    <servlet-class>com.welcome.web.HelloServlet</servlet-class>
  </servlet>  
  <servlet-mapping>
    <servlet-name>HelloServlet</servlet-name>
    <url-pattern>/HelloServlet</url-pattern>
  </servlet-mapping>
  
  
  <session-config>
	 <session-timeout>
	     30
	 </session-timeout>
  </session-config>
