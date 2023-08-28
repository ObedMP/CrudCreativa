package controllers;

import models.Productos;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.create;
import views.html.index;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProductosController extends Controller {
    private final FormFactory formFactory;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    String mensaje="";
    public Result index() {
        List<Productos> productos = Productos.find.all();
        return ok(index.render((scala.collection.immutable.List<Productos>) productos));
    }
    @Inject
    public ProductosController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }




    public Result create() {
        return ok(create.render());
    }

    public Result save() throws ParseException {
        DynamicForm form = formFactory.form().;

        String nombre = form.get("nombre");
        Double precio = Double.parseDouble(form.get("precio"));
        String descripcion = form.get("descripcion");
        boolean disponible = Boolean.parseBoolean(form.get("disponible"));

        Productos producto = new Productos();
        producto.nombre = nombre;
        producto.precio = precio;
        producto.descripcion = descripcion;
        producto.fecha_creacion = new Date();
        producto.disponible = disponible;

        try {
            producto.save();
            mensaje="Producto guardado exitosamente.";
        } catch (PersistenceException e) {
            mensaje="Error al guardar el producto.";
        }

        return redirect(routes.ProductosController.index());
    }

    public Result edit(Integer id) {
        Productos producto = Productos.find.byId(id);
        if (producto == null) {
            return notFound();
        }
        return ok(views.html.edit.render());
    }

    public Result update(Integer id) throws ParseException {
        DynamicForm form = formFactory.form().bindFromRequest();

        Productos producto = Productos.find.byId(id);
        if (producto == null) {
            return notFound();
        }

        producto.id=Integer.parseInt( form.get("id"));
        producto.nombre = form.get("nombre");
        producto.precio = Double.parseDouble(form.get("precio"));
        producto.descripcion = form.get("descripcion");
        producto.fecha_creacion= dateFormat.parse(form.get("fecha_creacion"));
        producto.disponible = Boolean.parseBoolean(form.get("disponible"));

        try {
            producto.update();

        } catch (PersistenceException e) {

        }

        return redirect(routes.ProductosController.index());
    }

    public Result delete(Integer id) {
        Productos producto = Productos.find.byId(id);
        if (producto == null) {
            return notFound();
        }

        try {
            producto.delete();

        } catch (PersistenceException e) {

        }

        return redirect(routes.ProductosController.index());
    }


}
