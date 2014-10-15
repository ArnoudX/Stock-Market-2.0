
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
object fatherPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[controllers.CRUDerPaths,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/()(implicit paths: controllers.CRUDerPaths):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),_display_(Seq[Any](/*3.2*/main("Father - Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
	<div class="centered">
		"""),_display_(Seq[Any](/*5.4*/navigator())),format.raw/*5.15*/("""
	
	<div>
			 <ul>
					<a href=""""),_display_(Seq[Any](/*9.16*/paths/*9.21*/.create)),format.raw/*9.28*/("""" class="main">
						<h3>Create New FATHER!</h3>
					</a>
			</ul>					
		</div>
	
	<table id="father_table">
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
		$(document).ready(function() """),format.raw/*28.32*/("""{"""),format.raw/*28.33*/("""

			//Using dataTable (jQuery plugin: http://datatables.net/)

			oTable = $("#father_table").dataTable("""),format.raw/*32.42*/("""{"""),format.raw/*32.43*/("""

				"iDisplayLength" : 20,
				"bProcessing" : true,
				"bAutoWidth" : false,
				"aaSorting" : [ [ 1, "asc" ] ],
				"fnRowCallback" : function(nRow, aData, iDisplayIndex) """),format.raw/*38.60*/("""{"""),format.raw/*38.61*/("""
					$('td:eq(0)', nRow).html('<a href=""""),_display_(Seq[Any](/*39.42*/paths/*39.47*/.edit)),format.raw/*39.52*/("""/' + aData[0] + '">' + aData[1] + '</a>');
					return nRow;
				"""),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""",
				"bServerSide" : true,
				"bJQueryUI" : true,
				"bRetrieve" : true,
				"sAjaxSource" : """"),_display_(Seq[Any](/*45.23*/routes/*45.29*/.FatherController.table())),format.raw/*45.54*/("""",
				"aoColumnDefs" : [ """),format.raw/*46.24*/("""{"""),format.raw/*46.25*/("""
					"bSearchable" : false,
					"bVisible" : false,
					"aTargets" : [ 0 ]
				"""),format.raw/*50.5*/("""}"""),format.raw/*50.6*/(""", """),format.raw/*50.8*/("""{"""),format.raw/*50.9*/("""
					"sWidth" : "20%",
					"aTargets" : [ 1 ]
				"""),format.raw/*53.5*/("""}"""),format.raw/*53.6*/(""" ]

			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/(""");

		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/(""")
	</script>
	
""")))})))}
    }
    
    def render(paths:controllers.CRUDerPaths): play.api.templates.HtmlFormat.Appendable = apply()(paths)
    
    def f:(() => (controllers.CRUDerPaths) => play.api.templates.HtmlFormat.Appendable) = () => (paths) => apply()(paths)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 15 13:57:52 CEST 2014
                    SOURCE: C:/Users/Arnoud/play-reactive-mongo/app/views/fatherPage.scala.html
                    HASH: 3b98d18d2b010043c37fa837636b9fd54d30493d
                    MATRIX: 578->1|715->44|752->47|781->68|820->70|882->98|914->109|983->143|996->148|1024->155|1310->413|1339->414|1472->519|1501->520|1705->696|1734->697|1812->739|1826->744|1853->749|1945->814|1973->815|2107->913|2122->919|2169->944|2223->970|2252->971|2361->1053|2389->1054|2418->1056|2446->1057|2525->1109|2553->1110|2587->1117|2615->1118|2648->1124|2676->1125
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|30->9|30->9|30->9|49->28|49->28|53->32|53->32|59->38|59->38|60->39|60->39|60->39|62->41|62->41|66->45|66->45|66->45|67->46|67->46|71->50|71->50|71->50|71->50|74->53|74->53|76->55|76->55|78->57|78->57
                    -- GENERATED --
                */
            