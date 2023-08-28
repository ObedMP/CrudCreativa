
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/main("Editar Producto")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<div class="container">
        <h2>Editar Producto</h2>
        """),_display_(/*7.10*/form(action = routes.ProductosController.update(Productos.id), 'class -> "form")/*7.90*/ {_display_(Seq[Any](format.raw/*7.92*/("""
            """),format.raw/*8.13*/("""<div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" value=""""),_display_(/*10.91*/producto/*10.99*/.nombre),format.raw/*10.106*/("""" required>
            </div>
            <div class="form-group">
                <label for="precio">Precio</label>
                <input type="number" class="form-control" id="precio" name="precio" value=""""),_display_(/*14.93*/producto/*14.101*/.precio),format.raw/*14.108*/("""" required>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción</label>
                <textarea class="form-control" id="descripcion" name="descripcion" rows="3">"""),_display_(/*18.94*/producto/*18.102*/.descripcion),format.raw/*18.114*/("""</textarea>
            </div>
            <div class="form-group">
                <label for="disponible">Disponible</label>
                <input type="checkbox" class="form-check-input" id="disponible" name="disponible" """),_display_(/*22.100*/if(producto.disponible)/*22.123*/ {_display_(Seq[Any](format.raw/*22.125*/("""checked""")))}),format.raw/*22.133*/(""">
            </div>
            <button type="submit" class="btn btn-primary">Actualizar</button>
        """)))}),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</div>
""")))}),format.raw/*27.2*/("""
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
                  SOURCE: app/views/edit.scala.html
                  HASH: 460e4092c2459279ee027ed3ebeecbb47fd2fc03
                  MATRIX: 610->1|633->18|1034->36|1065->59|1104->61|1135->66|1227->132|1315->212|1354->214|1394->227|1587->393|1604->401|1633->408|1871->619|1889->627|1918->634|2167->856|2185->864|2219->876|2473->1102|2506->1125|2547->1127|2587->1135|2726->1243|2758->1248|2796->1256
                  LINES: 23->1|24->2|34->4|34->4|34->4|35->5|37->7|37->7|37->7|38->8|40->10|40->10|40->10|44->14|44->14|44->14|48->18|48->18|48->18|52->22|52->22|52->22|52->22|55->25|56->26|57->27
                  -- GENERATED --
              */
          