// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProductosController ProductosController = new controllers.ReverseProductosController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProductosController ProductosController = new controllers.javascript.ReverseProductosController(RoutesPrefix.byNamePrefix());
  }

}
