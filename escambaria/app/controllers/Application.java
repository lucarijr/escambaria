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

//	public static Result index() {
//		return ok(index.render());
//	}

	public static Result getItems() {
		
		System.out.println("chamou...");
		
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Guilherme", "desc", "http://www.youtube.com/embed/XGSy3_Czz8k?autoplay=1", "url"));
		items.add(new Item(1, "Guilherme", "desc", "http://www.youtube.com/embed/XGSy3_Czz8k?autoplay=1", "url"));
		items.add(new Item(1, "Guilherme", "desc", "http://www.youtube.com/embed/XGSy3_Czz8k?autoplay=1", "url"));
		items.add(new Item(1, "Guilherme", "desc", "http://www.youtube.com/embed/XGSy3_Czz8k?autoplay=1", "url"));
		
		Map<String, List<Item>> itemMap = new HashMap<String, List<Item>>();
		itemMap.put("items", items);
		
	    return ok(Json.toJson(itemMap));
	}

}