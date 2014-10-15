
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
object sonPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[controllers.CRUDerPaths,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/()(implicit paths: controllers.CRUDerPaths):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),_display_(Seq[Any](/*3.2*/main("Son - Page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	
	<div class="centered">
	 """),_display_(Seq[Any](/*6.4*/navigator())),format.raw/*6.15*/("""
	
	<div>
			 <ul>
					<a href=""""),_display_(Seq[Any](/*10.16*/paths/*10.21*/.create)),format.raw/*10.28*/("""" class="main">
						<h3>Create New SON!</h3>
					</a>
			</ul>					
		</div>
	
	<table id="son_table">
	<thead>
		<tr>
			<th>id</th>
			<th>name</th>
		</tr>
	</thead>
	<tbody></tbody>
	</table>
	
	</div>
	</div>
	<script>
		
		$(document).ready(function() """),format.raw/*30.32*/("""{"""),format.raw/*30.33*/("""

			//Using dataTable (jQuery plugin: http://datatables.net/)

			oTable = $("#son_table").dataTable("""),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""

				"iDisplayLength" : 20,
				"bProcessing" : true,
				"bAutoWidth" : false,
				"aaSorting" : [ [ 1, "asc" ] ],
				"fnRowCallback" : function(nRow, aData, iDisplayIndex) """),format.raw/*40.60*/("""{"""),format.raw/*40.61*/("""
					$('td:eq(0)', nRow).html('<a href=""""),_display_(Seq[Any](/*41.42*/paths/*41.47*/.edit)),format.raw/*41.52*/("""/' + aData[0] + '">' + aData[1] + '</a>');
					return nRow;
				"""),format.raw/*43.5*/("""}"""),format.raw/*43.6*/(""",
				"bServerSide" : true,
				"bJQueryUI" : true,
				"bRetrieve" : true,
				"sAjaxSource" : """"),_display_(Seq[Any](/*47.23*/routes/*47.29*/.SonController.table())),format.raw/*47.51*/("""",
				"aoColumnDefs" : [ """),format.raw/*48.24*/("""{"""),format.raw/*48.25*/("""
					"bSearchable" : false,
					"bVisible" : false,
					"aTargets" : [ 0 ]
				"""),format.raw/*52.5*/("""}"""),format.raw/*52.6*/(""", """),format.raw/*52.8*/("""{"""),format.raw/*52.9*/("""
					"sWidth" : "20%",
					"aTargets" : [ 1 ]
				"""),format.raw/*55.5*/("""}"""),format.raw/*55.6*/(""" ]

			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/(""");

		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/(""")
	
	</script>
	
""")))})))}
    }
    
    def render(paths:controllers.CRUDerPaths): play.api.templates.HtmlFormat.Appendable = apply()(paths)
    
    def f:(() => (controllers.CRUDerPaths) => play.api.templates.HtmlFormat.Appendable) = () => (paths) => apply()(paths)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 15 16:40:14 CEST 2014
                    SOURCE: C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/app/views/sonPage.scala.html
                    HASH: 583efd4234c0f4587285da0861b73260b05c18f5
                    MATRIX: 575->1|712->44|749->47|775->65|814->67|878->97|910->108|980->142|994->147|1023->154|1312->415|1341->416|1471->518|1500->519|1704->695|1733->696|1811->738|1825->743|1852->748|1944->813|1972->814|2106->912|2121->918|2165->940|2219->966|2248->967|2357->1049|2385->1050|2414->1052|2442->1053|2521->1105|2549->1106|2583->1113|2611->1114|2644->1120|2672->1121
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|31->10|31->10|31->10|51->30|51->30|55->34|55->34|61->40|61->40|62->41|62->41|62->41|64->43|64->43|68->47|68->47|68->47|69->48|69->48|73->52|73->52|73->52|73->52|76->55|76->55|78->57|78->57|80->59|80->59
                    -- GENERATED --
                */
            