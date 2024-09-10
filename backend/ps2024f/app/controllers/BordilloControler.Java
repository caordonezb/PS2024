package controllers;

import models.Bordillo;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class BordilloController extends Controller {

    @Inject
    public BordilloController() {}

    public Result list() {
        List<Bordillo> bordillos = Bordillo.find.all();
        return ok(play.libs.Json.toJson(bordillos));
    }

    public Result create() {
        // Implement logic to create a new Bordillo
        return TODO;
    }

    public Result update(Long id) {
        // Implement logic to update a Bordillo
        return TODO;
    }

    public Result delete(Long id) {
        // Implement logic to delete a Bordillo
        return TODO;
    }
}
