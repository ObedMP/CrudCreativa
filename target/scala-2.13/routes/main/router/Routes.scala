// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductosController_0: controllers.ProductosController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductosController_0: controllers.ProductosController
  ) = this(errorHandler, ProductosController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductosController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos""", """controllers.ProductosController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos/nuevo""", """controllers.ProductosController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos""", """controllers.ProductosController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos/editar/""" + "$" + """id<[^/]+>""", """controllers.ProductosController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos/editar/""" + "$" + """id<[^/]+>""", """controllers.ProductosController.update(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productos/eliminar/""" + "$" + """id<[^/]+>""", """controllers.ProductosController.delete(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductosController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos")))
  )
  private[this] lazy val controllers_ProductosController_index0_invoker = createInvoker(
    ProductosController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "index",
      Nil,
      "GET",
      this.prefix + """productos""",
      """ Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductosController_create1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos/nuevo")))
  )
  private[this] lazy val controllers_ProductosController_create1_invoker = createInvoker(
    ProductosController_0.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "create",
      Nil,
      "GET",
      this.prefix + """productos/nuevo""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductosController_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos")))
  )
  private[this] lazy val controllers_ProductosController_save2_invoker = createInvoker(
    ProductosController_0.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "save",
      Nil,
      "POST",
      this.prefix + """productos""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductosController_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductosController_edit3_invoker = createInvoker(
    ProductosController_0.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """productos/editar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductosController_update4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos/editar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductosController_update4_invoker = createInvoker(
    ProductosController_0.update(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "update",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """productos/editar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProductosController_delete5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productos/eliminar/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductosController_delete5_invoker = createInvoker(
    ProductosController_0.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductosController",
      "delete",
      Seq(classOf[Integer]),
      "POST",
      this.prefix + """productos/eliminar/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductosController_index0_route(params@_) =>
      call { 
        controllers_ProductosController_index0_invoker.call(ProductosController_0.index())
      }
  
    // @LINE:7
    case controllers_ProductosController_create1_route(params@_) =>
      call { 
        controllers_ProductosController_create1_invoker.call(ProductosController_0.create())
      }
  
    // @LINE:8
    case controllers_ProductosController_save2_route(params@_) =>
      call { 
        controllers_ProductosController_save2_invoker.call(ProductosController_0.save())
      }
  
    // @LINE:9
    case controllers_ProductosController_edit3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductosController_edit3_invoker.call(ProductosController_0.edit(id))
      }
  
    // @LINE:10
    case controllers_ProductosController_update4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductosController_update4_invoker.call(ProductosController_0.update(id))
      }
  
    // @LINE:11
    case controllers_ProductosController_delete5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductosController_delete5_invoker.call(ProductosController_0.delete(id))
      }
  }
}
