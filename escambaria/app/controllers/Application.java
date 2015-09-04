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

	public static Result getItems(String tag, String name) {
		
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "desc", "image", "url"));
		items.add(new Item(1, "desc", "image", "url"));
		items.add(new Item(1, "desc", "image", "url"));
		items.add(new Item(1, "desc", "image", "url"));
		
		Map<String, List<Item>> itemMap = new HashMap<String, List<Item>>();
		itemMap.put("items", items);
		
	    return ok(Json.toJson(itemMap));
	}

}