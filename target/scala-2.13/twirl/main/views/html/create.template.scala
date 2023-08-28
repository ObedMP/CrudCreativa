
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
/*1.2*/import helper._
/*2.2*/import models._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*5.2*/main("Crear Producto")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<div class="container">
        <h2>Crear Producto</h2>
        """),_display_(/*8.10*/form(action = routes.ProductosController.save(), 'class -> "form")/*8.76*/ {_display_(Seq[Any](format.raw/*8.78*/("""
            """),format.raw/*9.13*/("""<div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            <div class="form-group">
                <label for="precio">Precio</label>
                <input type="number" class="form-control" id="precio" name="precio" required>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción</label>
                <textarea class="form-control" id="descripcion" name="descripcion" rows="3"></textarea>
            </div>
            <div class="form-group">
                <label for="fecha_creacion">Fecha de Creacion</label>
                <input type="datetime-local" class="form-control" id="fecha_creacion" name="fecha_creacion" required>
            </div>
            <div class="form-group">
                <label for="disponible">Disponible</label>
                <input type="checkbox" class="form-check-input" id="disponible" name="disponible">
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</div>
""")))}),format.raw/*32.2*/("""

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
                  SOURCE: app/views/create.scala.html
                  HASH: a964fd3e5c0a6e701bd2ba87d6ed99f973341ca8
                  MATRIX: 610->1|633->18|1036->37|1066->59|1105->61|1136->66|1227->131|1301->197|1340->199|1380->212|2562->1363|2594->1368|2632->1376
                  LINES: 23->1|24->2|34->5|34->5|34->5|35->6|37->8|37->8|37->8|38->9|59->30|60->31|61->32
                  -- GENERATED --
              */
          