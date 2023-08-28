
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import models._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Productos],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(productos: List[Productos]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Lista de Productos")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <h2>Lista de Productos</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Descripcion</th>
                    <th>Fecha de Crecion</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*18.14*/for(producto <- productos) yield /*18.40*/ {_display_(Seq[Any](format.raw/*18.42*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td>"""),_display_(/*20.26*/producto/*20.34*/.id),format.raw/*20.37*/("""</td>
                    <td>"""),_display_(/*21.26*/producto/*21.34*/.nombre),format.raw/*21.41*/("""</td>
                    <td>"""),_display_(/*22.26*/producto/*22.34*/.precio),format.raw/*22.41*/("""</td>
                    <td>"""),_display_(/*23.26*/producto/*23.34*/.descripcion),format.raw/*23.46*/("""</td>
                    <td>"""),_display_(/*24.26*/producto/*24.34*/.fecha_creacion),format.raw/*24.49*/("""</td>
                    <td>"""),_display_(/*25.26*/if(producto.disponible)/*25.49*/ {_display_(Seq[Any](format.raw/*25.51*/(""" """),format.raw/*25.52*/("""Disponible """)))}/*25.65*/else/*25.70*/{_display_(Seq[Any](format.raw/*25.71*/(""" """),format.raw/*25.72*/("""No disponible """)))}),format.raw/*25.87*/("""</td>
                    <td>
                        <a href=""""),_display_(/*27.35*/routes/*27.41*/.ProductosController.edit(producto.id)),format.raw/*27.79*/("""" class="btn btn-primary">Editar</a>
                        <a href=""""),_display_(/*28.35*/routes/*28.41*/.ProductosController.delete(producto.id)),format.raw/*28.81*/("""" class="btn btn-danger">Eliminar</a>
                    </td>
                </tr>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""</tbody>
        </table>
        <a href=""""),_display_(/*34.19*/routes/*34.25*/.ProductosController.create()),format.raw/*34.54*/("""" class="btn btn-success">Crear Producto</a>
    </div>
""")))}))
      }
    }
  }

  def render(productos:List[Productos]): play.twirl.api.HtmlFormat.Appendable = apply(productos)

  def f:((List[Productos]) => play.twirl.api.HtmlFormat.Appendable) = (productos) => apply(productos)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 97d9eaa8d531103125f554c8586daf91ec55d9d0
                  MATRIX: 610->1|939->18|1061->48|1095->74|1134->76|1165->81|1626->515|1668->541|1708->543|1753->560|1810->590|1827->598|1851->601|1909->632|1926->640|1954->647|2012->678|2029->686|2057->693|2115->724|2132->732|2165->744|2223->775|2240->783|2276->798|2334->829|2366->852|2406->854|2435->855|2466->868|2479->873|2518->874|2547->875|2593->890|2685->955|2700->961|2759->999|2857->1070|2872->1076|2933->1116|3063->1215|3104->1228|3175->1272|3190->1278|3240->1307
                  LINES: 23->1|28->2|33->3|33->3|33->3|34->4|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|55->25|55->25|55->25|57->27|57->27|57->27|58->28|58->28|58->28|61->31|62->32|64->34|64->34|64->34
                  -- GENERATED --
              */
          