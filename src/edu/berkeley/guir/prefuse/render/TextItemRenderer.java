package edu.berkeley.guir.prefuse.render;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import edu.berkeley.guir.prefuse.GraphItem;

/**
 * Renders an item as a text string. The text string used by default is the
 * value of the "label" attribute. To use a different attribute, use the
 * <code>setTextAttributeName</code> method. To perform custom String
 * selection, simply subclass this Renderer and override the 
 * <code>getText</code> method.
 * 
 * @version 1.0
 * @author <a href="http://jheer.org">Jeffrey Heer</a> prefuse(AT)jheer.org
 */
public class TextItemRenderer extends ShapeRenderer {

	public static final int ALIGNMENT_LEFT   = 0;
	public static final int ALIGNMENT_RIGHT  = 1;
	public static final int ALIGNMENT_CENTER = 2;
	public static final int ALIGNMENT_BOTTOM = 1;
	public static final int ALIGNMENT_TOP    = 0;

	protected Graphics2D m_g;
	protected BufferedImage m_buff;
	protected String m_labelName = "label";
	protected int m_xAlign = ALIGNMENT_CENTER;
	protected int m_yAlign = ALIGNMENT_CENTER;
	protected int m_horizBorder = 3;
	protected int m_vertBorder = 0;
	
	protected RectangularShape m_textBox  = new Rectangle2D.Float();
	protected Font m_font = new Font("SansSerif", Font.PLAIN, 10);
	protected Point2D     m_tmpPoint = new Point2D.Float();

	public TextItemRenderer() {
		// TODO: this is hacky. Is there a better way to achieve this?
		m_buff = new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB);
		m_g = (Graphics2D)m_buff.getGraphics();
	} //

    /**
     * Sets the default font used by this Renderer. If calling getFont() on
     * a GraphItem returns a non-null value, the returned Font will be used
     * instead of this default one.
     * @param f the default font to use.
     */
	public void setFont(Font f) {
		m_font = f;
	} //
    
    /**
     * Rounds the corners of the bounding rectangle in which the text
     * string is rendered.
     * @param arcWidth the width of the curved corner
     * @param arcHeight the height of the curved corner
     */
    public void setRoundedCorner(int arcWidth, int arcHeight) {
        if ( (arcWidth == 0 || arcHeight == 0) && 
            !(m_textBox instanceof Rectangle2D) ) {
            m_textBox = new Rectangle2D.Float();
        } else {
            if ( !(m_textBox instanceof RoundRectangle2D) )
                m_textBox = new RoundRectangle2D.Float();
            ((RoundRectangle2D)m_textBox)
                .setRoundRect(0,0,10,10,arcWidth,arcHeight);                    
        }
    } //

	/**
	 * Get the attribute name of the text to draw.
	 * @return the text tattribute name
	 */
	public String getTextAttributeName() {
		return m_labelName;
	} //
	
	/**
	 * Set the attribute name for the text to draw.
	 * @param name the text attribute name
	 */
	public void setTextAttributeName(String name) {
		m_labelName = name;
	} //

	/**
	 * Returns the text to draw. Subclasses can override this class to
	 * perform custom text rendering.
	 * @param item the item to represent as a <code>String</code>
	 * @return a <code>String</code> to draw
	 */
	protected String getText(GraphItem item) {
		return (String)item.getAttribute(m_labelName);
	} //
	
	protected boolean isHyperlink(GraphItem item) {
		Boolean b = (Boolean)item.getVizAttribute(m_labelName + "_LINK");
		return ( b != null && Boolean.TRUE.equals(b) );
	} //

	/**
	 * @see edu.berkeley.guir.prefuse.render.ShapeRenderer#getRawShape(edu.berkeley.guir.prefuse.GraphItem)
	 */
	protected Shape getRawShape(GraphItem item) {
		if ( m_g == null ) { return null; }
		
		String s = getText(item);
		if ( s == null ) { s = ""; }
        Font font = item.getFont();
        if ( font == null ) { font = m_font; }
		FontMetrics fm = m_g.getFontMetrics(font);
		int h = fm.getHeight() + 2*m_vertBorder;
		int w = fm.stringWidth(s) + 2*m_horizBorder;
		getAlignedPoint(m_tmpPoint, item, w, h, m_xAlign, m_yAlign);
		m_textBox.setFrame(m_tmpPoint.getX(),m_tmpPoint.getY(),w,h);
		return m_textBox;
	} //
	
	/**
	 * Helper method, which calculates the top-left co-ordinate of a node
	 * given the node's alignment.
	 */
	protected static void getAlignedPoint(Point2D p, GraphItem item, int w, int h, int xAlign, int yAlign) {
		double x = Math.round(item.getX()), y = Math.round(item.getY());
		if ( xAlign == ALIGNMENT_CENTER ) {
			x = x-(w/2);
		} else if ( xAlign == ALIGNMENT_RIGHT ) {
			x = x-w;
		}
		if ( yAlign == ALIGNMENT_CENTER ) {
			y = y-(h/2);
		} else if ( yAlign == ALIGNMENT_BOTTOM ) {
			y = y-h;
		}
		p.setLocation(x,y);
	} //

	/**
	 * @see edu.berkeley.guir.prefuse.render.Renderer#render(java.awt.Graphics2D, edu.berkeley.guir.prefuse.GraphItem)
	 */
	public void render(Graphics2D g, GraphItem item) {
		Paint fillColor = item.getFillColor();
		Paint itemColor = item.getColor();
		Shape shape = getShape(item);
		if (shape != null) {
			switch (getRenderType()) {
				case RENDER_TYPE_DRAW :
					g.setPaint(itemColor);
					g.draw(shape);
					break;
				case RENDER_TYPE_FILL :
					g.setPaint(fillColor);
					g.fill(shape);
					break;
				case RENDER_TYPE_DRAW_AND_FILL :
					g.setPaint(fillColor);
					g.fill(shape);
					g.setPaint(itemColor);
					g.draw(shape);
					break;
			}

			String s = getText(item);
			if ( s != null ) {			
				Rectangle r = shape.getBounds();
				g.setPaint(itemColor);
				Font font = item.getFont();
				if ( font == null ) { font = m_font; }
				g.setFont(font);
				FontMetrics fm = g.getFontMetrics();
				g.drawString(s, r.x+m_horizBorder, r.y+m_vertBorder+fm.getAscent());
				if ( isHyperlink(item) ) {
					int x = r.x + m_horizBorder;
					int y = r.y + m_vertBorder + fm.getHeight() - 1;
					g.drawLine(x, y, x + fm.stringWidth(s), y);
				}
			}
		}
	} //
	
	/**
	 * Get the horizontal alignment of this node with respect to it's
	 * location co-ordinate.
	 * @return the horizontal alignment
	 */
	public int getHorizontalAlignment() {
		return m_xAlign;
	} //
	
	/**
	 * Get the vertical alignment of this node with respect to it's
	 * location co-ordinate.
	 * @return the vertical alignment
	 */
	public int getVerticalAlignment() {
		return m_yAlign;
	} //
	
	/**
	 * Set the horizontal alignment of this node with respect to it's
	 * location co-ordinate.
	 * @param align the horizontal alignment
	 */	
	public void setHorizontalAlignment(int align) {
		m_xAlign = align;
	} //
	
	/**
	 * Set the vertical alignment of this node with respect to it's
	 * location co-ordinate.
	 * @param align the vertical alignment
	 */	
	public void setVerticalAlignment(int align) {
		m_yAlign = align;
	} //
	
} // end of class TextItemRenderer
