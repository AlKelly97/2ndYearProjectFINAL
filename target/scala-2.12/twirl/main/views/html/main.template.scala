
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
  
    """),format.raw/*10.5*/("""<!doctype html>
  
    <html>
    <head>
                      <!-- Latest compiled and minified CSS -->
                      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
    <!-- jQuery library -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
    
    <!-- Latest compiled JavaScript -->
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     <link href=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("stylesheets/main.css")),format.raw/*22.66*/("""" rel="stylesheet">
     <script src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.versioned("javascripts/script.js")),format.raw/*23.68*/(""""></script>
    
    <meta charset="UTF-8">
    <title>TGN</title>
    </head>
    <body>
            
    <nav>
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
      <li><a href="/videos">Videos</a></li>
      
     
                   
    </ul>
                             
    </div>
    </nav>
<!-- Login / Logout -->
<li class="nav-item">
        <li """),_display_(/*53.14*/if(title == "Login")/*53.34*/ {_display_(Seq[Any](format.raw/*53.36*/("""class =="active"""")))}),format.raw/*53.53*/(""">
        """),_display_(/*54.10*/if(user !=null)/*54.25*/{_display_(Seq[Any](format.raw/*54.26*/("""
      """),format.raw/*55.7*/("""<a href=""""),_display_(/*55.17*/routes/*55.23*/.LoginController.logout()),format.raw/*55.48*/("""">Logout</a>
        """)))}/*56.11*/else/*56.16*/{_display_(Seq[Any](format.raw/*56.17*/("""
          """),format.raw/*57.11*/("""<a class="nav-link" href=""""),_display_(/*57.38*/routes/*57.44*/.LoginController.login()),format.raw/*57.68*/("""">Login</a>
        """)))}),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""</li>
  </ul> <!-- End of Nav list-->
     
 
      
    

     
      </ul>
      <h1> Tallaght Gaming News </h1>  
      <h2> For All Things Gaming </h2>	
        <style type="text/css">
            body """),format.raw/*71.18*/("""{"""),format.raw/*71.19*/("""background:#1f1c21 !important """),format.raw/*71.49*/("""}"""),format.raw/*71.50*/("""               
             """),format.raw/*72.14*/("""</style> 
        <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="my-slider" class="carousel slide" data-ride="carousel">
                           
                           
    
                            <!-- Wrapper For Slides -->
                            <div class="carousel-inner" role="listbox">   
                                <div class ="item active">
                                    <img src="assets/images/farcry5.jpg" alt"far cry 5" />
                                    <div class="carousel-caption">
                                        <h1> Check out Our Review Section!</h1>
                                        </div>
                               </div>
                               <div class ="item">
                                    <img src="assets/images/games.jpg" alt"far cry 5" />
                                    <div class="carousel-caption">
                                        <h1> Check out what's Trending</h1>
                                        </div>
                               </div>
                                </div>    
    
    
                            <!-- Navigation Controls -->
                            <a class="left carousel-control" href="#my-slider" role="button" data-slide="prev">
                                <span class=" glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            </a>
                            <a class="right carousel-control" href="#my-slider" role="button" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            </a>
                         
                                                                              
                   
                
                    
    
    
    
                        </div>
                    </div>
                </div>
            </div>
          
            <footer>
                <p>Second Year Project:
                Alan Kelly Anthony Koleoso Lee McDonnell
                </a></p>
              </footer>
            """))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 16:58:19 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/main.scala.html
                  HASH: 529ff07249ad8e6a19d4dffd42aea095781a938d
                  MATRIX: 1224->260|1373->316|1408->324|2232->1121|2247->1127|2309->1168|2375->1207|2390->1213|2453->1255|3257->2032|3286->2052|3326->2054|3374->2071|3412->2082|3436->2097|3475->2098|3509->2105|3546->2115|3561->2121|3607->2146|3648->2169|3661->2174|3700->2175|3739->2186|3793->2213|3808->2219|3853->2243|3905->2264|3937->2269|4171->2475|4200->2476|4258->2506|4287->2507|4344->2536
                  LINES: 33->7|38->8|40->10|52->22|52->22|52->22|53->23|53->23|53->23|83->53|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|87->57|88->58|89->59|101->71|101->71|101->71|101->71|102->72
                  -- GENERATED --
              */
          