
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Game],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Game: List[models.Game], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home PAge", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
  """),format.raw/*3.3*/("""<h1>Gaming Reviews!</h1>
<html>
  <head>
                    <!-- Latest compiled and minified CSS -->
                    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  
  <!-- jQuery library -->
  <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
  
  <!-- Latest compiled JavaScript -->
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   <link href=""""),_display_(/*14.17*/routes/*14.23*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.64*/("""" rel="stylesheet">
   <script src=""""),_display_(/*15.18*/routes/*15.24*/.Assets.versioned("javascripts/script.js")),format.raw/*15.66*/(""""></script>
  
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
    <h1> Tallaght Gaming News </h1>  
    <h2> For All Things Gaming </h2>	
      <style type="text/css">
          body """),format.raw/*44.16*/("""{"""),format.raw/*44.17*/("""background:#1f1c21 !important"""),format.raw/*44.46*/("""}"""),format.raw/*44.47*/("""
                
                          
           """),format.raw/*47.12*/("""</style> 
      <div class="container">
              <div class="row">
                  <div class="col-sm-12">
                      <div id="my-slider" class="carousel slide" data-ride="carousel">
                         
                         
  
                          <!-- Wrapper For Slides -->
                          <div class="carousel-inner" role="listbox">   
                              <div class ="item active">
                                 <img src="assets/images/farcry5.jpg" alt"far cry 5" href="/reviews" />
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
        
  <p class="lead">Reviews</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>categories</h4>
      <ul class="list-group">
        <a href=""""),_display_(/*96.19*/routes/*96.25*/.HomeController.index(0)),format.raw/*96.49*/("""" class="list-group-item">All categories</a>

"""),_display_(/*98.2*/for(c <- categories) yield /*98.22*/{_display_(Seq[Any](format.raw/*98.23*/("""
  """),format.raw/*99.3*/("""<li class"list-group-item">"""),_display_(/*99.31*/c/*99.32*/.getName),format.raw/*99.40*/("""
    """),format.raw/*100.5*/("""<span class="badge">???</span>
  </li>
""")))}),format.raw/*102.2*/("""
        
      """),format.raw/*104.7*/("""</ul>
    </div>
  </div>


  """),_display_(/*109.4*/if(flash.containsKey("success"))/*109.36*/ {_display_(Seq[Any](format.raw/*109.38*/("""
    """),format.raw/*110.5*/("""<div class="alert alert-success">
    """),_display_(/*111.6*/flash/*111.11*/.get("success")),format.raw/*111.26*/("""
    """),format.raw/*112.5*/("""</div>
    """)))}),format.raw/*113.6*/("""

"""),format.raw/*115.1*/("""<p>
  <a href=""""),_display_(/*116.13*/routes/*116.19*/.HomeController.addGame()),format.raw/*116.44*/("""">
    <button class="btn btn-primary">Add a game</button>
  </a>
</p>

<td>
  <<a href="#???" class="button-xs btn-danger">#
    <span class="glyphicon-pencil"></span>
  </a>
</td>

""")))}),format.raw/*127.2*/("""
"""))
      }
    }
  }

  def render(Game:List[models.Game],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(Game,categories,user)

  def f:((List[models.Game],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (Game,categories,user) => apply(Game,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 17:27:47 IST 2018
                  SOURCE: /home/wdd/Documents/newestRep-master/app/views/index.scala.html
                  HASH: e522de61859d4aeb03c844f2494599183bb11b0f
                  MATRIX: 999->1|1178->88|1209->111|1248->113|1277->116|2083->895|2098->901|2160->942|2224->979|2239->985|2302->1027|2995->1692|3024->1693|3081->1722|3110->1723|3194->1779|5340->3898|5355->3904|5400->3928|5473->3975|5509->3995|5548->3996|5578->3999|5633->4027|5643->4028|5672->4036|5705->4041|5776->4081|5820->4097|5878->4128|5920->4160|5961->4162|5994->4167|6060->4206|6075->4211|6112->4226|6145->4231|6188->4243|6218->4245|6262->4261|6278->4267|6325->4292|6540->4476
                  LINES: 28->1|33->2|33->2|33->2|34->3|45->14|45->14|45->14|46->15|46->15|46->15|75->44|75->44|75->44|75->44|78->47|127->96|127->96|127->96|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|133->102|135->104|140->109|140->109|140->109|141->110|142->111|142->111|142->111|143->112|144->113|146->115|147->116|147->116|147->116|158->127
                  -- GENERATED --
              */
          