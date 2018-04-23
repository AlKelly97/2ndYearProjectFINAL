
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

object reviews extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""



"""),format.raw/*5.1*/("""<!doctype html>

<html>
<head>
    							<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href=""""),_display_(/*17.14*/routes/*17.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.61*/("""" rel="stylesheet">
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("javascripts/script.js")),format.raw/*18.63*/(""""></script>

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
      <li><a href="/reviews"class='active-page'>Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos">Videos</a></li>
      </ul>

  <h1> Reviews </h1>  
  <h2>Have a read from some reviews of your favourite games!</h2>
     
  </body>
  
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
                  DATE: Mon Apr 23 16:33:01 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/reviews.scala.html
                  HASH: bee82d270b109b7e246dae5168f3d355d56af068
                  MATRIX: 961->1|1081->26|1115->34|1595->487|1610->493|1672->534|1734->569|1749->575|1812->617
                  LINES: 28->1|33->1|37->5|49->17|49->17|49->17|50->18|50->18|50->18
                  -- GENERATED --
              */
          