
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Crud Creativa </title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.66*/routes/*9.72*/.Assets.at("stylesheets/bootstrap/bootstrap.min.css")),format.raw/*9.125*/("""">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css")),format.raw/*12.90*/(""""/>
  </head>
  <body>
      """),_display_(/*15.8*/content),format.raw/*15.15*/("""
    """),format.raw/*16.5*/("""<script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.versioned("javascripts/main.js")),format.raw/*16.65*/("""" type="text/javascript"></script>
  </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: d70ee1616c3c163f88a499aa584830ef7a6d3428
                  MATRIX: 911->1|1034->31|1061->32|1336->281|1350->287|1424->340|1609->498|1624->504|1679->538|1735->568|1763->575|1795->580|1836->594|1851->600|1912->640
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|42->12|42->12|42->12|45->15|45->15|46->16|46->16|46->16|46->16
                  -- GENERATED --
              */
          