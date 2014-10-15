
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
object granPaForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[models.GranPa],RequestHeader,controllers.CRUDerPaths,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(gpform: Form[models.GranPa])(implicit request: RequestHeader, paths: controllers.CRUDerPaths):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*4.1*/("""
<div class="centered">
	"""),_display_(Seq[Any](/*6.3*/navigator())),format.raw/*6.14*/("""
</ul>

"""),_display_(Seq[Any](/*9.2*/helper/*9.8*/.form(action = new play.api.mvc.Call("POST",paths.submit))/*9.66*/ {_display_(Seq[Any](format.raw/*9.68*/("""
     <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("stylesheets/main.css"))),format.raw/*10.91*/("""">
     <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.56*/routes/*11.62*/.Assets.at("images/favicon.png"))),format.raw/*11.94*/("""">
     
     <div class="centered form">
	    <ul>
	    	<li>
	    		"""),_display_(Seq[Any](/*16.9*/inputText(gpform("id")))),format.raw/*16.32*/("""
	    	</li>
	    	<li>
	    		"""),_display_(Seq[Any](/*19.9*/inputText(gpform("name")))),format.raw/*19.34*/("""
	    	</li>
	    	<li>
	    		"""),_display_(Seq[Any](/*22.9*/inputText(gpform("sons")))),format.raw/*22.34*/("""
	    		<label for="sons_field" class="little">Please, insert elements like a JSON array (i.e. ["526f9c77e4b083eec04dee31", "526e9709e4b054fb03a1574c"])</label>
	    	</li>
	    	<li class="remove">
	    		<input id="remove" type="checkbox" name="remove" />
	    		<label for="remove"></label>
	    	</li>
	    
	    </ul>
	    
	    <input type="submit" />
     	<img src=""""),_display_(Seq[Any](/*33.18*/routes/*33.24*/.Assets.at("images/abe.png"))),format.raw/*33.52*/("""" />
    </div>
""")))})))}
    }
    
    def render(gpform:Form[models.GranPa],request:RequestHeader,paths:controllers.CRUDerPaths): play.api.templates.HtmlFormat.Appendable = apply(gpform)(request,paths)
    
    def f:((Form[models.GranPa]) => (RequestHeader,controllers.CRUDerPaths) => play.api.templates.HtmlFormat.Appendable) = (gpform) => (request,paths) => apply(gpform)(request,paths)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 15 16:40:14 CEST 2014
                    SOURCE: C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/app/views/granPaForm.scala.html
                    HASH: 937562579fdaae8e5f57fe474a2cac289623e42d
                    MATRIX: 612->1|816->95|844->114|904->140|936->151|979->160|992->166|1058->224|1097->226|1184->277|1199->283|1255->317|1349->375|1364->381|1418->413|1524->484|1569->507|1636->539|1683->564|1750->596|1797->621|2208->996|2223->1002|2273->1030
                    LINES: 19->1|23->1|25->4|27->6|27->6|30->9|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|37->16|37->16|40->19|40->19|43->22|43->22|54->33|54->33|54->33
                    -- GENERATED --
                */
            