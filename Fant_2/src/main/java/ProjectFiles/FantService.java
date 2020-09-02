/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;
import ProjectFiles.Item;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author danie
 */


@Path("main")
@Stateless
public class FantService {
/**
* Public method that returns items with photos sold in the shop
     * @return 
*/
    @PersistenceContext
    EntityManager em;
    
    @GET
    @Path("scan")
    public List<Item> getAllItems() {
        return em.createNamedQuery(Item.FIND_ALL_ITEMS, Item.class).getResultList();
    }
    
    @POST
    @Path("item") 
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createItem (@FormParam("itemId") int id, 
                @FormParam("itemString") String itemString,
                @FormParam("creator") String creator){

            System.out.println("id " + id);
            System.out.println("itemString " + itemString);

            Item item = new  Item();
            item.setId(id);
            item.setItemString(itemString);
            item.setCreator(creator);

            em.persist(item);

        return Response.ok().build();
    

/**
* A registered user may purchase an Item. An email will be sent to the
* seller if the purchase is successful
*
* @param itemid unique id for item
* @return result of purchase request
*/
 /**
 * A registered user may remove an item and associated photos owned by the
 * calling user. An user with administrator privileges may remove any item
 * and associated photos.
 *
 * @param itemid unique id for item to be deleted
 * @return result of delete request
 */

}
/**
 * A registered user may add an item and photo(s) to Fant.
 *
 * @param title the title of Item
 * @param description the description of Item
 * @param price the price of Item
 * @param photos one or more photos associated with Item
 * @return result of the request. If successful, the request will include
 * the new unique ids of the Item and associated Photos
 */
 public Response addItem(String title, String description, BigDecimal price,
 FormDataMultiPart photos) {
     return null;
}
 /**
 * Streams an image to the browser (the actual compressed pixels). The image
 * will be scaled to the appropriate width if the width parameter is provided.
 * This is a public method available to all callers.
 *
 * @param name the filename of the image
 * @param width the required scaled with of the image
 *
 * @return the image in original format or in jpeg if scaled
 */
 public Response getPhoto(String name, int width) {
     return null;
}

    private static class FormDataMultiPart {

        public FormDataMultiPart() {
        }
    }
}
