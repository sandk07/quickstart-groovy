 <%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="org.wipro.com.UserDetails"
   %>
-
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">

   <html>

      <head>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   User Logged Successfully </title>
   <style>
   #display-frm {
   background-color: #efefef;
   padding: 20px;
}
         #output {
   background-color: #A2F9A2;
   display: block;
   padding: 10px 0px;
   text-align: center;
   width: 500px;
   margin-left: auto;
   margin-right: auto;
   }
   </style>
      </head>

      <body>
         <br><br><br>
        <div class="container" id="output">
         <br><br>
         <form id="display-frm">
           <% UserDetails currentUser = (UserDetails)(session.getAttribute("currentSessionUser"));%>
   		<%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
        </form>
        <br><br>
   </div>
      </body>

   </html>