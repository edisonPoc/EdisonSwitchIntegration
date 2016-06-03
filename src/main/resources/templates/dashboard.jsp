 <!DOCTYPE HTML>
<html>
<head>
  <title>Switch implementation of Light Bulb demo</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style2.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>
<body>
 <div id="main">
    <header>
      <div id="logo"><h1>LIGHT BULB DEMO</h1></div>
      <nav>
        <ul class="lavaLampWithImage" id="lava_menu">
          <li class="current"><a href="dashboard.jsp">Home</a></li>
          <li><a href="getDeviceList">Switch Control</a></li>
          <li><a href="index.jsp">Logout</a></li>
        </ul>
      </nav>
    </header>
    <div id="site_content">
      <div id="sidebar_container">
        <div class="gallery">
          <ul class="images">
            <li class="show"><img width="450" height="450" src="images/img3.jpg" alt="img3" /></li>
            <li><img width="450" height="450" src="images/img2.jpg" alt="img3" /></li>
            <li><img width="450" height="450" src="images/img1.jpg" alt="img3" /></li>
          </ul>
        </div>
      </div>
      <div id="content">
        <h1>Welcome to the Switch implementation of Light Bulb demo</h1>
      </div>
    </div>
    <footer>
      <p><a href="index.jsp">Logout</a> | <a href="getDeviceList">Switch Control</a></p>
      <p>&copy; LedIotHub Dashboard | <a href="http://www.css3templates.co.uk">design from css3templates.co.uk</a></p>
    </footer>
  </div>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery.easing.min.js"></script>
  <script type="text/javascript" src="js/jquery.lavalamp.min.js"></script>
  <script type="text/javascript" src="js/image_fade.js"></script>
  <script type="text/javascript">
    $(function() {
      $("#lava_menu").lavaLamp({
        fx: "backout",
        speed: 700
      });
    });
  </script>
</body>
</html>
 
</div>
   
</body>
</html>