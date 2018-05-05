<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi pagina principal</title>
    <!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>

    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Bootstrap theme</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                    <li class="dropdown">
              			<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
              			<ul class="dropdown-menu">
                			<li><a href="#">Action</a></li>
                			<li><a href="#">Another action</a></li>
			                <li><a href="#">Something else here</a></li>
			                <li role="separator" class="divider"></li>
			                <li class="dropdown-header">Nav header</li>
			                <li><a href="#">Separated link</a></li>
			                <li><a href="#">One more separated link</a></li>
              			</ul>
            		</li>
                </ul>
            </div>
        </div>
    </div>
    
    
    
    <div class="container body-content">
        
		<div class="jumbotron">
		    <h1>Spring MVC</h1>
		    <p class="lead">Spring MVC is a free web framework for building great Web sites and Web applications using HTML, CSS and JavaScript.</p>
		    <p><a href="https://asp.net" class="btn btn-primary btn-lg">Learn more &raquo;</a></p>
		</div>

		<div class="row">
    		<div class="col-md-4">
        		<h2>Getting started</h2>
        		<p>
		            ASP.NET MVC gives you a powerful, patterns-based way to build dynamic websites that
		            enables a clean separation of concerns and gives you full control over markup
		            for enjoyable, agile development.
        		</p>
	      	  <p><a class="btn btn-default" href="https://go.microsoft.com/fwlink/?LinkId=301865">Learn more &raquo;</a></p>
	    	</div>
    	
		    <div class="col-md-4">
		        <h2>Get more libraries</h2>
		        <p>NuGet is a free Visual Studio extension that makes it easy to add, remove, and update libraries and tools in Visual Studio projects.</p>
		        <p><a class="btn btn-default" href="https://go.microsoft.com/fwlink/?LinkId=301866">Learn more &raquo;</a></p>
		    </div>
	    
		    <div class="col-md-4">
		        <h2>Web Hosting</h2>
		        <p>You can easily find a web hosting company that offers the right mix of features and price for your applications.</p>
		        <p><a class="btn btn-default" href="https://go.microsoft.com/fwlink/?LinkId=301867">Learn more &raquo;</a></p>
		    </div>

	        <hr />
	        
	        <footer>
	            <p>&copy; Mi aplicación ASP.NET</p>
	        </footer>
        
    	</div> <!-- ROW -->
    	
    </div> <!-- CONTAINER -->
    

    <!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		
</body>

</html>
