// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseProductosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productos/editar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:7
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productos/nuevo")
    }
  
    // @LINE:10
    def update(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "productos/editar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:8
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "productos")
    }
  
    // @LINE:11
    def delete(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "productos/eliminar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productos")
    }
  
  }


}
