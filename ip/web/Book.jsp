<%-- 
    Document   : Book
    Created on : Nov 17, 2015, 12:33:49 PM
    Author     : ~PRIYA~
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TBAK</title>
   <script type="text/javascript" src="validate.js"></script>
     <style>
#header {
    background-color:black;
    color:white;
  
   
height:180px;
width: 100%;
}
body{	
    font-family: Arial, Helvetica, sans-serif;
    font-size: 20px;
    line-height: 25px;
    color: black;
    background: #0a6a5b url(images/bg.jpg);
}

 #wrap{
	border: 22px solid #ffffff;
	width: 1032px;
	margin: 0 auto;
	background: #fffff;
        height: 600px;
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   	 	 
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
                    <img src="${pageContext.request.contextPath}/image/logo1.png" width="499px" height="111px"/><br><br><br>
                    <h1><center>Booking</center></h1><br></div><br><br><br><br>
        <div id="wrap">
                    <form action="BookC"><br><br>
                       

                        <table cellpadding="20" width="80%" align="center" cellspacing="20">

		<tr>
		<td>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="text" style="font-size: 20px;" name="name1" size="30"></td>
		</tr>
		
		<tr>
		<td>MobileNo</td>
                <td><input type="text" name="number1" style="font-size: 20px;" size="30"></td>
		</tr>

		<tr>
		<td>Room type:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><select style="font-size: 20px" name="room1">
		<option value="select">select..</option>
		<option value="one">Single person</option>
                <option value="two">Two in a room</option>
		<option value="four">four in a rooom</option>
		<option value="oneac">Single person with AC</option>
		<option value="twoac">Two people with AC</option>
		</select></td>
		</tr>
		
                
                        </table><br><br>
                        <center>
                <input type="reset" style="font-size: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" style="font-size: 20px;" value="Register" /></center>
		
                
		
                
                    </form>	</div><br>
                    <div id="footer">
Copyright ©tbakwomenshostel.com
</div>
    </body>
</html>
