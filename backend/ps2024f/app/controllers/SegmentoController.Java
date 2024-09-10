package controllers;

import models.Segmento;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class SegmentoController extends Controller {

    @Inject
    public SegmentoController() {}

    public Result list() {
        List<Segmento> segmentos = Segmento.find.all();
        return ok(play.libs.Json.toJson(segmentos));
    }

    public Result create() {
        // Implement logic to create a new Segmento
        return TODO;
    }

    public Result update(Long id) {
        // Implement logic to update a Segmento
        return TODO;
    }

    public Result delete(Long id) {
        // Implement logic to delete a Segmento
        return TODO;
    }
}
