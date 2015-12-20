/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 1070
 */
public class Success extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession hs=request.getSession();
            String name=(String)hs.getAttribute("name");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>TBAK</title>\n" +
"        <meta name=\"keywords\" content=\"\" />\n" +
"        <meta name=\"description\" content=\"\" />\n" +
"        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n" +
"		<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n" +
"        <meta name=\"viewport\" content=\"width=device-width\">\n" +
"        <style>\n" +
"            #section{\n" +
"	background: url(images/h1.png) no-repeat top left;\n" +
"	width: 1032px;\n" +
"	height: 317px;\n" +
"}\n" +
"            #wrap{\n" +
"	border: 22px solid #ffffff;\n" +
"	width: 1032px;\n" +
"	margin: 0 auto;\n" +
"	background: #ffffff;\n" +
"        height: 800px;\n" +
"}\n" +
"body{	\n" +
"    font-family: Arial, Helvetica, sans-serif;\n" +
"    font-size: 12px;\n" +
"    line-height: 17px;\n" +
"    color: #ffffff;\n" +
"    background: #0a6a5b url(images/bg.jpg);\n" +
"}\n" +
"#slider a {\n" +
"	border:0;\n" +
"	display:block;\n" +
"}\n" +
"\n" +
".nivo-controlNav {\n" +
"	position:absolute;\n" +
"	left:260px;\n" +
"	bottom:-42px;\n" +
"	display: none;\n" +
"}\n" +
".nivoSlider {\n" +
"	position:relative;\n" +
"}\n" +
".nivo-controlNav a.active {\n" +
"	background-position:0 -22px;\n" +
"}\n" +
".nivo-directionNav a {\n" +
"	display:block;\n" +
"	width:30px;\n" +
"	height:30px;\n" +
"	background:url(images/arrows.png) no-repeat;\n" +
"	text-indent:-9999px;\n" +
"	border:0;\n" +
"}\n" +
"a.nivo-nextNav {\n" +
"	background-position:-30px 0;\n" +
"	right:15px;\n" +
"}\n" +
"a.nivo-prevNav {\n" +
"	left:15px;\n" +
"}\n" +
".nivo-caption {\n" +
"    text-shadow:none;\n" +
"    font-family: Helvetica, Arial, sans-serif;\n" +
"}\n" +
".nivo-caption a { \n" +
"    color:#efe9d1;\n" +
"    text-decoration:underline;\n" +
"}\n" +
"#slider-wrapper {\n" +
"    background:url(images/top.jpg) no-repeat;\n" +
"    width: 1032px;\n" +
"    height: 317px;\n" +
"    margin:0 auto;\n" +
"}\n" +
"\n" +
"#slider {\n" +
"	position:relative;\n" +
"    width: 1032px;\n" +
"    height: 317px;\n" +
"	background:url(images/loading.gif) no-repeat 50% 50%;\n" +
"}\n" +
"#header {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"   \n" +
"   \n" +
"height:190px;\n" +
"width: 100%;\n" +
"}\n" +
"\n" +
"#slider-wrapper {\n" +
"    background:url(images/top.jpg) no-repeat;\n" +
"    width: 1032px;\n" +
"    height: 317px;\n" +
"    margin:0 auto;\n" +
"}\n" +
".nivoSlider {\n" +
"	position:relative;\n" +
"}\n" +
".nivoSlider img {\n" +
"	position:absolute;\n" +
"	top:0px;\n" +
"	left:0px;\n" +
"}\n" +
"/* If an image is wrapped in a link */\n" +
".nivoSlider a.nivo-imageLink {\n" +
"	position:absolute;\n" +
"	top:0px;\n" +
"	left:0px;\n" +
"	width:100%;\n" +
"	height:100%;\n" +
"	border:0;\n" +
"	padding:0;\n" +
"	margin:0;\n" +
"	z-index:60;\n" +
"	display:none;\n" +
"}\n" +
"/* The slices in the Slider */\n" +
".nivo-slice {\n" +
"	display:block;\n" +
"	position:absolute;\n" +
"	z-index:50;\n" +
"	height:100%;\n" +
"}\n" +
"/* Caption styles */\n" +
".nivo-caption {\n" +
"	position:absolute;\n" +
"	left:0px;\n" +
"	bottom:0px;\n" +
"	background:#000;\n" +
"	color:#fff;\n" +
"	opacity:0.8; /* Overridden by captionOpacity setting */\n" +
"	width:100%;\n" +
"	z-index:89;\n" +
"}\n" +
".nivo-caption p {\n" +
"	padding:5px;\n" +
"	margin:0;\n" +
"}\n" +
".nivo-caption a {\n" +
"	display:inline !important;\n" +
"}\n" +
".nivo-html-caption {\n" +
"    display:none;\n" +
"}\n" +
"/* Direction nav styles (e.g. Next & Prev) */\n" +
".nivo-directionNav a {\n" +
"	position:absolute;\n" +
"	top:45%;\n" +
"	z-index:99;\n" +
"	cursor:pointer;\n" +
"}\n" +
".nivo-prevNav {\n" +
"	left:0px;\n" +
"}\n" +
".nivo-nextNav {\n" +
"	right:0px;\n" +
"}\n" +
"/* Control nav styles (e.g. 1,2,3...) */\n" +
".nivo-controlNav a {\n" +
"	position:relative;\n" +
"	z-index:99;\n" +
"	cursor:pointer;\n" +
"}\n" +
".nivo-controlNav a.active {\n" +
"	font-weight:bold;\n" +
"}\n" +
"\n" +
"#menu{\n" +
"	background: url(images/menu_bg.jpg) repeat-x top;\n" +
"	height: 83px;\n" +
"}\n" +
"\n" +
"#menu ul{\n" +
"	padding-left: 0px;\n" +
"    list-style: none;\n" +
"	width: 800px;\n" +
"	margin: 0 auto;\n" +
"}\n" +
"\n" +
"#menu ul li{\n" +
"	display: inline;\n" +
"}\n" +
"\n" +
"#menu ul li a{\n" +
"	font: 24px  Arial, Helvetica, sans-serif;\n" +
"    color: #ffffff;\n" +
"	text-align: center;\n" +
"    font-weight: normal;\n" +
"    text-decoration: none;\n" +
"    display: block;\n" +
"    float: left;\n" +
"    width: 160px;\n" +
"    height: 83px;\n" +
"	line-height: 83px;\n" +
"}\n" +
"\n" +
"#menu ul li a:hover,  #menu ul li .active{\n" +
"	color: #ffffff;\n" +
"	background: url(images/hover.png) no-repeat center;\n" +
"}\n" +
"\n" +
"#column_box{\n" +
"	padding: 24px 32px 0px 32px;\n" +
"}\n" +
"\n" +
"#column1, #column2, #column3{\n" +
"	width: 260px;\n" +
"	float: left;\n" +
"	background: url(images/bg_col_top.jpg) no-repeat top left;\n" +
"	height: 168px;\n" +
"	padding: 32px 20px 14px 20px;\n" +
"}\n" +
"\n" +
"#column2{\n" +
"	margin: 0px 31px 0px 35px;\n" +
"}\n" +
"\n" +
"#column_box .read{\n" +
"	background: url(images/read.jpg) no-repeat top left;\n" +
"	width: 128px;\n" +
"	height: 34px;\n" +
"	display: block;\n" +
"	text-align: center;\n" +
"	font: 18px Arial, Helvetica, sans-serif;\n" +
"	color: #ffffff;\n" +
"	line-height: 34px;\n" +
"	font-weight: normal;\n" +
"	margin-top: 15px;\n" +
"}\n" +
"\n" +
"\n" +
"#footer {\n" +
"    background-color:black;\n" +
"    color:white;\n" +
"    clear:both;\n" +
"    text-align:center;\n" +
"   	 	 \n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"    \n" +
"\n" +
"<div id=\"header\">\n" +
"   \n" +
"						<img src=\"image/logo1.png\" alt=\"\" />\n" +
"<h2>"+name+"</h2><br> <br> \n" +

"</div>\n" +

"\n<br><br> "+
"<div id=\"wrap\">\n" +
"    \n" +
"        <div id=\"section\">\n" +
"				\n" +
"				   \n" +
"	<div id=\"wrapper\">\n" +
"				<div id=\"slider-wrapper\">        \n" +
"					<div id=\"slider\" class=\"nivoSlider\">\n" +
"						<img src=\"images/h1.jpg\" alt=\"\" />\n" +
"						<img src=\"images/h3.jpg\" alt=\"\"/>\n" +
"						<img src=\"image/indeximage.jpg\" alt=\"\" />\n" +
"						<img src=\"images/h4.jpg\" alt=\"\" />\n" +
"					</div>        \n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"<script type=\"text/javascript\" src=\"lib/jquery-1.4.3.min.js\"></script>\n" +
"    <script type=\"text/javascript\" src=\"lib/jquery.nivo.slider.pack.js\"></script>\n" +
"    <script type=\"text/javascript\">\n" +
"    $(window).load(function() {\n" +
"        $('#slider').nivoSlider();\n" +
"    });\n" +
"    </script>\n" +
"				\n" +
"				</div>\n" +
"    <br><br>\n" +
"    <div id=\"menu\">\n" +
"					<ul>\n" +
"						<li><a href=\"home.jsp\" class=\"active\">Home</a></li>\n" +
"                                                <li><a href=\"About.jsp\">About Us</a></li>\n" +
"                                                <li><a href=\"Gallary.jsp\">Gallery</a></li>\n" +
"						<li><a href=\"Book.jsp\">Booking</a></li>\n" +
"                                                <li><a href=\"Contact.jsp\">Contact Us</a></li>\n" +
"					</ul>\n" +
"					<div class=\"clear\"></div>\n" +
"				</div>\n" +
"    \n" +
"    <div id=\"column_box\">\n" +
"					<div id=\"column1\">\n" +
"						<h2>We are honoured</h2>\n" +
"						<p>\n" +
"Our Ladies Hostels are the pioneer in providing accommodation for working women and students in prime locations of chennai for the past 10 years.\n" +
"</p>\n" +
"    </a>\n" +
"					</div>\n" +
"					<div id=\"column2\">\n" +
"						<h2>Branches </h2>\n" +
"						<p>Our hostel has 5 other branches all over India(Hyderabad, Delhi, Kerala, Tamil Nadu and Calcutta) servicing with an intention of best hostage in India. </p>\n" +
"					\n" +
"					</div>\n" +
"					<div id=\"column3\">\n" +
"						<h2>Facilities</h2>\n" +
"                                                <ul>\n" +
"                                                    <li>Food</li>\n" +
"                                                    <li>Wifi</li>\n" +
"                                                    <li>Laundry</li>\n" +
"                                                    <li>Safety & Security</li>\n" +
"                                                    <li>Mediclaim</li>\n" +
"                                                    <li>Logistics</li>\n" +
"                                                    \n" +
"                                                </ul>\n" +
"					\n" +
"					</div>\n" +
"					<div class=\"clear\"></div>\n" +
"				</div>\n" +
"				\n" +
"   \n" +
"    </div>\n" +
"<div id=\"footer\">\n" +
"Copyright ©tbakwomenshostel.com\n" +
"</div>\n" +
"</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
