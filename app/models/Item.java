package models;

import play.data.format.Formats.*;
import play.data.validation.Constraints.*;
import play.db.ebean.*;

import javax.persistence.*;
import java.util.*;

/**
 * Item implements the model of an item in the collection.
 *
 * @author Mauro scomparin.
 * @version 1.0.
 */
@Entity
public class Item extends Model {

    /**
     * The id of the item.
     */
    @Id
    public Long id;

    /**
     * The name of the item.
     */
    @Required
    public String name;

    /**
     * quantity of the item.
     */
    public long quantity;

    /**
     * Additional fields of the item.
     */
    public List<String> additionalFields;

    /**
     * Location where you can find the item.
     */
    @ManyToMany
    public Location location;

    /**
     * To string method.
     *
     * @return the string representation of the object.
     */
    public String toString(){
        return name + " - " + quantity + " - " + location;
    }

    /**
     * Convenience Finder object.
     */
    public static Finder<Long, Item> find = new Finder<Long, Item>(Long.class, Item.class);

}
