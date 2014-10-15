
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
object granPaPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[controllers.CRUDerPaths,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/()(implicit paths: controllers.CRUDerPaths):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),_display_(Seq[Any](/*3.2*/main("GranPa - Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
	
	<div class="centered">
		"""),_display_(Seq[Any](/*6.4*/navigator())),format.raw/*6.15*/("""
		
		<div>
			 <ul>
					<a href=""""),_display_(Seq[Any](/*10.16*/paths/*10.21*/.create)),format.raw/*10.28*/("""" class="main">
						<h3>Create New GRANPA!</h3>
					</a>
			</ul>					
		</div>
		
		<table id="granpa_table">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
			</tr>
		</thead>
		<tbody></tbody>
		</table>
		
	</div>

	<script>
		$(document).ready(function() """),format.raw/*29.32*/("""{"""),format.raw/*29.33*/("""

			//Using dataTable (jQuery plugin: http://datatables.net/)
			
			oTable = $("#granpa_table").dataTable("""),format.raw/*33.42*/("""{"""),format.raw/*33.43*/("""

				"iDisplayLength" : 20,
				"bProcessing" : true,
				"bAutoWidth" : false,
				"aaSorting" : [ [ 1, "asc" ] ],
				"fnRowCallback" : function(nRow, aData, iDisplayIndex) """),format.raw/*39.60*/("""{"""),format.raw/*39.61*/("""
					$('td:eq(0)', nRow).html('<a href=""""),_display_(Seq[Any](/*40.42*/paths/*40.47*/.edit)),format.raw/*40.52*/("""/' + aData[0] + '">' + aData[1] + '</a>');
					return nRow;
				"""),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""",
				"bServerSide" : true,
				"bJQueryUI" : true,
				"bRetrieve" : true,
				"sAjaxSource" : """"),_display_(Seq[Any](/*46.23*/routes/*46.29*/.GranpaController.table())),format.raw/*46.54*/("""",
				"aoColumnDefs" : [ """),format.raw/*47.24*/("""{"""),format.raw/*47.25*/("""
					"bSearchable" : false,
					"bVisible" : false,
					"aTargets" : [ 0 ]
				"""),format.raw/*51.5*/("""}"""),format.raw/*51.6*/(""", """),format.raw/*51.8*/("""{"""),format.raw/*51.9*/("""
					"sWidth" : "20%",
					"aTargets" : [ 1 ]
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/(""" ]

			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/(""");

		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/(""")
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
                    SOURCE: C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/app/views/granPaPage.scala.html
                    HASH: 46860991948f3d9384e0f6a99ec3c6f221c9df70
                    MATRIX: 578->1|715->44|752->47|781->68|820->70|884->100|916->111|988->147|1002->152|1031->159|1327->427|1356->428|1492->536|1521->537|1725->713|1754->714|1832->756|1846->761|1873->766|1965->831|1993->832|2127->930|2142->936|2189->961|2243->987|2272->988|2381->1070|2409->1071|2438->1073|2466->1074|2545->1126|2573->1127|2607->1134|2635->1135|2668->1141|2696->1142
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|31->10|31->10|31->10|50->29|50->29|54->33|54->33|60->39|60->39|61->40|61->40|61->40|63->42|63->42|67->46|67->46|67->46|68->47|68->47|72->51|72->51|72->51|72->51|75->54|75->54|77->56|77->56|79->58|79->58
                    -- GENERATED --
                */
            