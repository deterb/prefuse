package edu.berkeley.guir.prefuse.action;

import java.awt.Color;
import java.awt.Paint;
import java.util.Iterator;

import edu.berkeley.guir.prefuse.GraphItem;
import edu.berkeley.guir.prefuse.ItemRegistry;

/**
 * Simple ColorFunction which returns "black" for the draw color and
 * "gray" for the fill color when a color is requested. Subclasses 
 * should override the getColor() and getFillColor() methods to provide
 * custom color selection functions.
 * 
 * @version 1.0
 * @author <a href="http://jheer.org">Jeffrey Heer</a> prefuse(AT)jheer.org
 */
public class ColorFunction extends AbstractAction {
    
	public void run(ItemRegistry registry, double frac) {
		Iterator itemIter = registry.getItems();
		while ( itemIter.hasNext() ) {
			GraphItem item = (GraphItem)itemIter.next();
            Paint c = getColor(item), o = item.getColor();
			if ( o == null ) item.setColor(getInitialColor(item));			
			item.updateColor(c);			
			item.setColor(c);
			
			c = getFillColor(item); o = item.getFillColor();
			if ( o == null ) item.setFillColor(getInitialFillColor(item));
			item.updateFillColor(c);			
			item.setFillColor(c);
		}
	} //

	protected Paint getInitialColor(GraphItem item) {
		return getColor(item);
	} //
	
	protected Paint getInitialFillColor(GraphItem item) {
		return getFillColor(item);
	} //

	public Paint getColor(GraphItem item) {
		return Color.BLACK;
	} //

	public Paint getFillColor(GraphItem item) {
		return Color.GRAY;
	} //
    
    public static Color calcIntermediateColor(Color c1, Color c2, double frac) {
        return new Color(
                (int)Math.round(frac*c2.getRed()   + (1-frac)*c1.getRed()),
                (int)Math.round(frac*c2.getGreen() + (1-frac)*c1.getGreen()),
                (int)Math.round(frac*c2.getBlue()  + (1-frac)*c1.getBlue()));
    } //

} // end of class ColorFunction
