<%-- 
    Document   : MDetails
    Created on : Nov 15, 2015, 7:43:23 PM
    Author     : ~PRIYA~
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TBAK</title>
    
        <style>
           table, td, th {
               border: 1px solid black;
}

th {
    background-color: black;
    color: white;
}
#header {
    background-color:black;
    color:white;
    text-align:center;
   
height:190px;
width: 100%;
}
body{	
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    line-height: 25px;
    color: #ffffff;
    background: #0a6a5b url(images/bg.jpg);
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   	 	 
}
</style>
</head>
<body>
    <div id="header">
   
   <img src="${pageContext.request.contextPath}/image/logo1.png" width="499px" height="111px"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
    <a style="color: #0a6a5b; font-size: x-large;" href="login.jsp">Login</a><br><br>
     
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
     <a style="color: #0a6a5b; font-size: x-large" href="register.jsp">Register</a><br>
</div>

   <div style="color: #0a6a5b"><br><br>
       <table cellpadding="5" width="70%" bgcolor="white" style="font-size: x-large; border-color: black; border-radius: 4px;" align="center" cellspacing="5">
           <tr style="font-weight: bold;">
            <th>Day </th>
            <th>Time</th>
            <th>Menu</th>
        </tr>
        <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Idly with onion chutney/coconut chutney</td>
        </tr>
        <tr>
            <td>Monday</td>
            <td>12:40-1:40(PM)</td>
            <td>Vegetable biriyani</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Bajji</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Onion Uthappam</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Pongal with coconut chutney</td>
        </tr>
        <tr>
            <td>Tuesday</td>
            <td>12:40-1:40(PM)</td>
            <td>Chicken Biriyani with egg</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Samosa</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Puri</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Poha</td>
        </tr>
        <tr>
            <td>Wednesday</td>
            <td>12:40-1:40(PM)</td>
            <td>Sambar rice</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Pani Puri</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Chappati</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Semiya Upma</td>
        </tr>
        <tr>
            <td>Thursday</td>
            <td>12:40-1:40(PM)</td>
            <td>Fried rice</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Sprouts sundal</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Dosa</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Maggie</td>
        </tr>
        <tr>
            <td>Monday</td>
            <td>12:40-1:40(PM)</td>
            <td>Full meals</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Bhel Puri</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Curd rice</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Idyappam</td>
        </tr>
        <tr>
            <td>Friday</td>
            <td>12:40-1:40(PM)</td>
            <td>Mutton rice</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Kesari</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Sevai</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Lemon rice</td>
        </tr>
        <tr>
            <td>Saturday</td>
            <td>12:40-1:40(PM)</td>
            <td>Egg biriyani/Mini meals</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Pakoda</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Idly with sambar</td>
        </tr>
         <tr>
            <td></td>
            <td>7:30-9:00(AM)</td>
            <td>Idly with onion chutney/coconut chutney</td>
        </tr>
        <tr>
            <td>Sunday</td>
            <td>12:40-1:40(PM)</td>
            <td>Fish rice/variety rice</td>
        </tr>
        <tr>
            <td></td>
            <td>6:30-7:00(PM)</td>
            <td>Kesari</td>
        </tr>
        <tr>
            <td></td>
            <td>8:00-9:30</td>
            <td>Tamarind rice</td>
        </tr>
       </table>

</div>

<div id="footer">
Copyright ©tbakwomenshostel.com
</div>
</body>
</html>
