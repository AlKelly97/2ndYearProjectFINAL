
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object videos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<!doctype html>

<html>
<head>
  	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href=""""),_display_(/*15.14*/routes/*15.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.61*/("""" rel="stylesheet">
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.versioned("javascripts/script.js")),format.raw/*16.63*/(""""></script>

<meta charset="UTF-8">

<title> TGN </title>
</head>
<body>
    
	
    <nav>
        <a href="/">
            <div class="navbar-header">
                <a class="navbar-brand" href="/"><img src="assets/images/tgn.png" alt="tgn"></a>
            
 
    </a>
    </nav>
 
    <ul>
          
      <li><a href="/support">Support</a></li>
      <li><a href="/reviews">Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos"class='active-page'>Videos</a></li>
    </ul>  

  <h1> Videos </h1>  
  <h2>Check out some clips from the latest games!</h2>

  <h3>Far Cry 4 Flying Goat Glitch Encountered</h3>
  <br>

  <iframe width="560" height="315" src="https://www.youtube.com/embed/TeamT1k54Do" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
  
  <h4>This strange glitch is was encountered in Ubisoft's Far Cry 4. Forget "when pigs fly", Now its When goats fly eh..? <h4>
        <style type=text/css>
            h4 """),format.raw/*52.16*/("""{"""),format.raw/*52.17*/("""color: #ffffff; """),format.raw/*52.33*/("""}"""),format.raw/*52.34*/("""
            """),format.raw/*53.13*/("""</style>

    <h3>Youtuber "Aurateur" Beats Unique Super Mario Maker Level </h3>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/FuF4DRKva-c" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>        
      
    <h4>Aurateur is an American Youtuber whos specialises in challenging tough Super Mario Maker Levels. In this video, he takes a shot at a very unique 
        level which involves some sort of mirror aspect. Nonetheless, it makes for an interesting watch!
    </h4>

    <footer>
            <p>Second Year Project:
            Alan Kelly Anthony Koleoso
            </a></p>
          </footer>
     
          						
							"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 16:50:13 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/videos.scala.html
                  HASH: a36f55788dbc421d5d13353f77171ff7ada5024e
                  MATRIX: 960->1|1080->26|1110->30|1582->475|1597->481|1659->522|1721->557|1736->563|1799->605|2848->1626|2877->1627|2921->1643|2950->1644|2992->1658
                  LINES: 28->1|33->1|35->3|47->15|47->15|47->15|48->16|48->16|48->16|84->52|84->52|84->52|84->52|85->53
                  -- GENERATED --
              */
          