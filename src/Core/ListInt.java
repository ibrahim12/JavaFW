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
class ListInt extends ArrayList<Integer> {

    public ListInt() {
    }

    public ListInt(ArrayList<Integer> list) {
	super(list);
    }
    public ArrayList<Integer> toArrayList(){
	return this;
    }
}