/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim
 */
class ListString extends ArrayList<String> {

    public ListString() {
    }

    public ListString(ArrayList<String> list) {
	super(list);
    }
    public ArrayList<String> toArrayList(){
	return this;
    }
}
