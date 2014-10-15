
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Create the Main Stock Page")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
    <div id="header">
        <div class="container">
            <div style="float: left; width: 33%;">
                <a href="localhost:9000">Home</a>
            </div>
            <div style="float: right; width: 33%;">
	           <a href="/login">
	               <input type="button" value="Sign Up/Login" />
                </a>
            </div>
            <div style="width: 34%; margin: 0 auto;">
	           <input id="addsymboltext" type="text" size="30" maxlength="100" class="span2" placeholder="Search Stock">
            </div>
        </div>
    </div>
    <br />
    <br />
    <div id="content">
        <div id="chartbuthead">
            <div id="chartbut" align="center"><input type="button" value="Snapshot" /></div>
            <div id="chartbut" align="center"><input id="magie" type="button" value="Charts" /></div>
            <div id="chartbut" align="center"><input type="button" value="Company" /></div>
            <div id="chartbut" align="center"><input type="button" value="Data Table" /></div>
        </div>
        <br />
        <div id="chartdiv"></div>
    </div>
		
		<!--<h1>Here's the little family: edit it and make it bigger!</h1>
		
    <div class="centered main">

    		<a href="/granpa" class="main">Granpa
    			<img src=""""),_display_(Seq[Any](/*37.19*/routes/*37.25*/.Assets.at("images/abe.png"))),format.raw/*37.53*/("""" />
    		</a>
    		<a href="/father" class="main">Father
    			<img src=""""),_display_(Seq[Any](/*40.19*/routes/*40.25*/.Assets.at("images/homer.png"))),format.raw/*40.55*/("""" />
    		</a>
    		<a href="/son" class="main">Son
    			<img src=""""),_display_(Seq[Any](/*43.19*/routes/*43.25*/.Assets.at("images/bart.png"))),format.raw/*43.54*/("""" />
    		</a>

    </div>-->
    
""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 15 16:40:14 CEST 2014
                    SOURCE: C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/app/views/index.scala.html
                    HASH: bc1bd1dae4a9ee6b03824a2af45868e0f05713e5
                    MATRIX: 549->1|644->3|681->6|723->40|762->42|2078->1322|2093->1328|2143->1356|2257->1434|2272->1440|2324->1470|2432->1542|2447->1548|2498->1577|2566->1614
                    LINES: 19->1|22->1|24->3|24->3|24->3|58->37|58->37|58->37|61->40|61->40|61->40|64->43|64->43|64->43|69->48
                    -- GENERATED --
                */
            