package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.node.ObjectNode;

import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

import br.com.escambaria.model.Item;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	public static Result getItems() {
		ObjectNode result = Json.newObject();
		result.get("{\"items\": [{\"id\":1, \"desc\": \"teste\", \"type\": \"image\", \"url\": \"url\"}] }");
	    return ok(result);
	}

}