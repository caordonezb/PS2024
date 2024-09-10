package controllers;

import models.Calzada;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class CalzadaController extends Controller {

    @Inject
    public CalzadaController() {}

    public Result list() {
        List<Calzada> calzadas = Calzada.find.all();
        return ok(play.libs.Json.toJson(calzadas));
    }

    public Result create() {
        // Implement logic to create a new Calzada
        return TODO;
    }

    public Result update(Long id) {
        // Implement logic to update a Calzada
        return TODO;
    }

    public Result delete(Long id) {
        // Implement logic to delete a Calzada
        return TODO;
    }
}
