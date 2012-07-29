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
class ListInt2D extends ArrayList<ArrayList<Integer>> {

    public ListInt2D() {
    }

    public ListInt2D(ArrayList<ArrayList<Integer>> list) {
	super(list);
    }

    public ArrayList<ArrayList<Integer>> toArrayList(){
	return this;
    }
}
