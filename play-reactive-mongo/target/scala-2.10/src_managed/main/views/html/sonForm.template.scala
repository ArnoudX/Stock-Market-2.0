
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
object sonForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[models.Son],RequestHeader,controllers.CRUDerPaths,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(gpform: Form[models.Son])(implicit request: RequestHeader, paths: controllers.CRUDerPaths):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.93*/("""

"""),format.raw/*4.1*/("""
<div class="centered">
	"""),_display_(Seq[Any](/*6.3*/navigator())),format.raw/*6.14*/("""
</ul>

"""),_display_(Seq[Any](/*9.2*/helper/*9.8*/.form(action = new play.api.mvc.Call("POST",paths.submit))/*9.66*/ {_display_(Seq[Any](format.raw/*9.68*/("""
	
     <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("stylesheets/main.css"))),format.raw/*11.91*/("""">
     <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.56*/routes/*12.62*/.Assets.at("images/favicon.png"))),format.raw/*12.94*/("""">
     <div class="centered form">
     
	    <ul>
	    	<li>
	    		"""),_display_(Seq[Any](/*17.9*/helper/*17.15*/.inputText(gpform("id")))),format.raw/*17.39*/("""
	    	</li>
	    	<li>
	    		"""),_display_(Seq[Any](/*20.9*/helper/*20.15*/.inputText(gpform("name")))),format.raw/*20.41*/("""
	    	</li>
	    	<li>
	    		"""),_display_(Seq[Any](/*23.9*/helper/*23.15*/.inputText(gpform("fa")))),format.raw/*23.39*/("""
	    		<label for="fa_field" class="little">Insert Id</label>
	    	</li>
	    	<li class="remove">
	    		<input id="remove" type="checkbox" name="remove" />
	    		<label for="remove"></label>
	    	</li>
	    </ul>
	    
	    <input type="submit" />
	    
     	<img src=""""),_display_(Seq[Any](/*34.18*/routes/*34.24*/.Assets.at("images/bart.png"))),format.raw/*34.53*/("""" />
    </div>
    
""")))})))}
    }
    
    def render(gpform:Form[models.Son],request:RequestHeader,paths:controllers.CRUDerPaths): play.api.templates.HtmlFormat.Appendable = apply(gpform)(request,paths)
    
    def f:((Form[models.Son]) => (RequestHeader,controllers.CRUDerPaths) => play.api.templates.HtmlFormat.Appendable) = (gpform) => (request,paths) => apply(gpform)(request,paths)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 15 13:57:52 CEST 2014
                    SOURCE: C:/Users/Arnoud/play-reactive-mongo/app/views/sonForm.scala.html
                    HASH: 954b898954db318df00dea9cb60b846ca8985859
                    MATRIX: 606->1|807->92|835->111|895->137|927->148|970->157|983->163|1049->221|1088->223|1177->276|1192->282|1248->316|1342->374|1357->380|1411->412|1517->483|1532->489|1578->513|1645->545|1660->551|1708->577|1775->609|1790->615|1836->639|2149->916|2164->922|2215->951
                    LINES: 19->1|23->1|25->4|27->6|27->6|30->9|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|38->17|38->17|38->17|41->20|41->20|41->20|44->23|44->23|44->23|55->34|55->34|55->34
                    -- GENERATED --
                */
            