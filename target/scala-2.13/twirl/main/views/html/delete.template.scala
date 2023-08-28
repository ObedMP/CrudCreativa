
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

object delete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Eliminar Producto")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <h2>Eliminar Producto</h2>
        <p>¿Estás seguro de que deseas eliminar el producto """"),_display_(/*6.63*/producto/*6.71*/.nombre),format.raw/*6.78*/(""""?</p>
        <form action=""""),_display_(/*7.24*/routes/*7.30*/.ProductosController.delete(producto.id)),format.raw/*7.70*/("""" method="post">
            <button type="submit" class="btn btn-danger">Eliminar</button>
            <a href=""""),_display_(/*9.23*/routes/*9.29*/.ProductosController.index()),format.raw/*9.57*/("""" class="btn btn-secondary">Cancelar</a>
        </form>
    </div>
""")))}),format.raw/*12.2*/("""


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/delete.scala.html
                  HASH: 5c3e3fae6f3201827b308ae60ee0bdbbebc6da34
                  MATRIX: 610->1|1013->19|1046->44|1085->46|1116->51|1263->172|1279->180|1306->187|1362->217|1376->223|1436->263|1576->377|1590->383|1638->411|1737->480
                  LINES: 23->1|33->3|33->3|33->3|34->4|36->6|36->6|36->6|37->7|37->7|37->7|39->9|39->9|39->9|42->12
                  -- GENERATED --
              */
          