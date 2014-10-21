
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
    
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 17 10:03:03 CEST 2014
                    SOURCE: C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/app/views/index.scala.html
                    HASH: cc9e215d7772c42b189d307ed9606d6ab5319530
                    MATRIX: 549->1|644->3|681->6|723->40|762->42|1909->1158
                    LINES: 19->1|22->1|24->3|24->3|24->3|53->32
                    -- GENERATED --
                */
            