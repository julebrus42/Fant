/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import java.math.BigDecimal;
import java.util.List;
import javax.mail.FetchProfile.Item;
import javax.ws.rs.core.Response;

/**
 *
 * @author danie
 */
public class FantService {
/**
* Public method that returns items with photos sold in the shop
     * @return 
*/
public List<Item> getItems() {
    return null;
}

/**
* A registered user may purchase an Item. An email will be sent to the
* seller if the purchase is successful
*
* @param itemid unique id for item
* @return result of purchase request
*/
public Response purchase(Long itemid) {
    return null;
}
 /**
 * A registered user may remove an item and associated photos owned by the
 * calling user. An user with administrator privileges may remove any item
 * and associated photos.
 *
 * @param itemid unique id for item to be deleted
 * @return result of delete request
 */
public Response delete(Long itemid) {
    return null;
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
