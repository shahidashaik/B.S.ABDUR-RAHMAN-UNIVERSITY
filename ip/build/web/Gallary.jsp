<%-- 
    Document   : Gallary
    Created on : Nov 15, 2015, 7:38:04 PM
    Author     : ~PRIYA~
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TBAK</title>
         <style>
 #section{
	background: url(images/h9.jpg) no-repeat top left;
	width: 1032px;
	height: 317px;
}
            #wrap{
	border: 22px solid #ffffff;
	width: 1032px;
	margin: 0 auto;
	background: #ffffff;
        height: 500px;
}
body{	
    font-family: Arial, Helvetica, sans-serif;
    font-size: 12px;
    line-height: 17px;
    color: #ffffff;
    background: #0a6a5b url(images/bg.jpg);
}
#slider a {
	border:0;
	display:block;
}

.nivo-controlNav {
	position:absolute;
	left:260px;
	bottom:-42px;
	display: none;
}
.nivoSlider {
	position:relative;
}
.nivo-controlNav a.active {
	background-position:0 -22px;
}
.nivo-directionNav a {
	display:block;
	width:30px;
	height:30px;
	background:url(images/arrows.png) no-repeat;
	text-indent:-9999px;
	border:0;
}
a.nivo-nextNav {
	background-position:-30px 0;
	right:15px;
}
a.nivo-prevNav {
	left:15px;
}
.nivo-caption {
    text-shadow:none;
    font-family: Helvetica, Arial, sans-serif;
}
.nivo-caption a { 
    color:#efe9d1;
    text-decoration:underline;
}
#slider-wrapper {
    background:url(images/top.jpg) no-repeat;
    width: 1032px;
    height: 317px;
    margin:0 auto;
}

#slider {
	position:relative;
    width: 1032px;
    height: 317px;
	background:url(images/loading.gif) no-repeat 50% 50%;
}
#header {
    background-color:black;
    color:white;
   
   
height:190px;
width: 100%;
}

#slider-wrapper {
    background:url(images/top.jpg) no-repeat;
    width: 1032px;
    height: 317px;
    margin:0 auto;
}
.nivoSlider {
	position:relative;
}
.nivoSlider img {
	position:absolute;
	top:0px;
	left:0px;
}
/* If an image is wrapped in a link */
.nivoSlider a.nivo-imageLink {
	position:absolute;
	top:0px;
	left:0px;
	width:100%;
	height:100%;
	border:0;
	padding:0;
	margin:0;
	z-index:60;
	display:none;
}
/* The slices in the Slider */
.nivo-slice {
	display:block;
	position:absolute;
	z-index:50;
	height:100%;
}
/* Caption styles */
.nivo-caption {
	position:absolute;
	left:0px;
	bottom:0px;
	background:#000;
	color:#fff;
	opacity:0.8; /* Overridden by captionOpacity setting */
	width:100%;
	z-index:89;
}
.nivo-caption p {
	padding:5px;
	margin:0;
}
.nivo-caption a {
	display:inline !important;
}
.nivo-html-caption {
    display:none;
}
/* Direction nav styles (e.g. Next & Prev) */
.nivo-directionNav a {
	position:absolute;
	top:45%;
	z-index:99;
	cursor:pointer;
}
.nivo-prevNav {
	left:0px;
}
.nivo-nextNav {
	right:0px;
}
/* Control nav styles (e.g. 1,2,3...) */
.nivo-controlNav a {
	position:relative;
	z-index:99;
	cursor:pointer;
}
.nivo-controlNav a.active {
	font-weight:bold;
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
   
  <!-- <img src="${pageContext.request.contextPath}\image\logo1.jpg" width="500px" height="100px"/>-->
   <img src="image/logo1.png" alt="" />
   <p align="right">
<a style="color:#0a6a5b;font-size: x-large;" href="login.jsp">Login</a><br><br>
<a style="color:#0a6a5b;font-size: x-large;" href="register.jsp">Register</a></p>
</div>
   <br>  <div id="wrap">
            <center>  <p style="color: #0a6a5b; font-size: xx-large;"><b>Gallary</b></p></center>
            <br><br>
    
        <div id="section">
				
				   
	<div id="wrapper">
			<div id="slider-wrapper">	        
					<div id="slider" class="nivoSlider">
						<img src="images/h1.jpg" alt="" />
						<img src="images/h3.jpg" alt=""/>
						<img src="image/indeximage.jpg" alt="" />
						<img src="images/h4.jpg" alt="" />
                                                <img src="images/h5.png" alt="" />
                                                <img src="images/h6.png" alt="" />
                                                <img src="images/h8.jpg" alt="" />
                                                <img src="images/h9.jpg" alt="" />
					</div>        
                        </div>                             
			</div>
			
<script type="text/javascript" src="lib/jquery-1.4.3.min.js"></script>
    <script type="text/javascript" src="lib/jquery.nivo.slider.pack.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>
				
				</div>
   </div><br>

<div id="footer">
Copyright ©tbakwomenshostel.com
</div>
    </body>
</html>
