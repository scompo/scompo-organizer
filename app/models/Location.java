package models;

import play.data.validation.Constraints.*;
import play.db.ebean.*;

import javax.persistence.*;
import java.util.*;

/**
 * Item implements the model of a location in the collection.
 *
 * @author Mauro scomparin.
 * @version 1.0.
 */
@Entity
public class Location extends Model{

    /**
     * The id of the location.
     */
    @Id
    public Long id;

    /**
     * The name of the location.
     */
    @Required
    public String name;

    /**
     * Details about the location.
     */
    public String details;

    /**
     * toString method.
     *
     * @return a string representation of the object.
     */
    public String toString(){
        return name;
    }

    /**
     * List of the items.
     */
    @ManyToMany
    public List<Item> items;

    /**
     * Convenience Finder object.
     */
    public static Finder<Long, Model> find = new Finder<Long, Model>(Long.class, Model.class);
}
