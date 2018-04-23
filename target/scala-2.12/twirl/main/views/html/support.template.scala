
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

object support extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
          
      <li><a href="/support"class='active-page'>Support</a></li>
      <li><a href="/reviews">Reviews</a></li>
      <li><a href="/news">News</a></li>
      <li><a href="/videos">Videos</a></li>

     </ul> 
  <h1> Support Page </h1>  
  <h2>Need a hand? Let us know!</h2>
     
  











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
                  DATE: Mon Apr 23 16:50:13 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/support.scala.html
                  HASH: 5abf78e30c42748926afd685b9bf6f42e20f5992
                  MATRIX: 961->1|1081->26|1111->30|1591->483|1606->489|1668->530|1730->565|1745->571|1808->613
                  LINES: 28->1|33->1|35->3|47->15|47->15|47->15|48->16|48->16|48->16
                  -- GENERATED --
              */
          