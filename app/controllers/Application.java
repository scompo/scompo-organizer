package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    /**
     * Index page.
     *
     * @return the index page.
     */
    public static Result index() {
        return ok(index.render("Hello!"));
    }

    /**
     * ---------------------
     * Routes for Locations.
     * ---------------------
     */

    /**
     * Get all locations.
     *
     * @return TODO.
     */
    public static Result getAllLocations(){
        return TODO;
    }

    /**
     * Creates a new location.
     *
     * @return TODO.
     */
    public static Result newLocation(){
        return TODO;
    }

    /**
     * Deletes a location.
     *
     * @param id the id of the location to delete.
     * @return TODO.
     */
    public static Result deleteLocation(Long id){
        return TODO;
    }

    /**
     * -----------------
     * Routes for Items.
     * -----------------
     */

    /**
     * Get all locations.
     *
     * @return TODO.
     */
    public static Result getAllItems(){
        return TODO;
    }

    /**
     * Creates a new location.
     *
     * @return TODO.
     */
    public static Result newItem(){
        return TODO;
    }

    /**
     * Deletes a location.
     *
     * @param id the id of the location to delete.
     * @return TODO.
     */
    public static Result deleteItem(Long id){
        return TODO;
    }
}
