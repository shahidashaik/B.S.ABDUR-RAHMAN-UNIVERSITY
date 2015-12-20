<%-- 
    Document   : register
    Created on : Oct 27, 2015, 4:13:27 PM
    Author     : 1070
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        height: 700px;
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
                    <h1><center>Register Your Identity</center></h1><br></div><br><br><br><br>
        <div id="wrap">
                    <form action="RegisterC"><br><br>
                       

                        <table cellpadding="10" width="80%" align="center" cellspacing="10">

		<tr>
		<td>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="text" style="font-size: 20px;" name="name1" size="30"></td>
		</tr>

		<tr>
		<td>Password</td>
		<td><input type="password" name="password1" style="font-size: 20px;" size="30"></td>
		</tr>
		
		<tr>
		<td>Sex&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><input type="radio" name="sex1" style="font-size: 20px;" value="male" size="10">Male
		<input type="radio" name="sex1" style="font-size: 20px;" value="Female" size="10">Female</td>
		</tr>


		<tr>
		<td>Address&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><input type="text" name="address1" style="font-size: 20px;" size="50"></td>
		</tr>

		

		<!--<tr>
		<td>State</td>
		<td><select Name="state1">
		<option value="-1" selected>select..</option>
		<option value="New Delhi">NEW DELHI</option>
		<option value="Mumbai">MUMBAI</option>
		<option value="Tamilnadu">TAMILNADU</option>
		<option value="Bihar">BIHAR</option>
		<option value="MahaRASTRA">MAHARASTRA</option>
		</select></td>
		</tr>-->
                <tr>
                    <td>State:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="text" name="state1" style="font-size: 20px;" size="50"></td>
                </tr>

		

		<tr>
		<td>EmailId</td>
		<td><input type="text" name="emailid1" style="font-size: 20px;" size="30"></td>
		</tr>		

		<tr>
		<td>MobileNo</td>
                <td><input type="text" name="number1" style="font-size: 20px;" size="30"></td>
		</tr>

		<!--<tr>
		<td>Course&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td><select name="course1">
		<option value="-1" selected>select..</option>
		<option value="B.Tech">B.TECH</option>
                <option value="B.Tech">B.ARCH</option>
		<option value="MCA">MCA</option>
		<option value="MBA">MBA</option>
		<option value="BCA">BCA</option>
		</select></td>
		</tr>-->
                <tr>
                    <td>Course:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="text" name="course1" style="font-size: 20px;" size="50"></td>
                </tr>
		
		<!--<tr>
		<td>Year</td>
		<td><select Name="year1">
		<option value="select" selected>select..</option>
		<option value="I">I year</option>
		<option value="II">II year</option>
		<option value="III">III year</option>
		<option value="IV">IV year</option>
		<option value="V">V year</option>
		</select></td>
		</tr>-->
                <tr>
                    <td>Year:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="text" name="year1" style="font-size: 20px;" size="50"></td>
                </tr>
                
		</table>
                        <center>
                <input type="reset" style="font-size: 20px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" style="font-size: 20px;" value="Register" /></center>
		
                
		
                
                    </form>	</div><br>
                    <div id="footer">
Copyright ©tbakwomenshostel.com
</div>
	</body>
</html>
