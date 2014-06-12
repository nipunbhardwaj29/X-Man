/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package x.man;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author nipun
 */
//public enum Shape { RECTANGLE, OVAL, LINE }
// //========================================================= drawCurrentShape
//    private void drawCurrentShape(Graphics2D g2) {
//        g2.setColor(_color);            // Set the color.
//        _shape.draw(g2, _start, _end);  // Draw the shape.
//    }

////////////////////////////////////////////////////////////////////////// Shape
public enum Shape {
    RECTANGLE {
        void draw(Graphics2D g2, Point from, Point to) {
            g2.fillRect(from.x, from.y, to.x - from.x, to.y - from.y);
        }
    },
    OVAL {
        void draw(Graphics2D g2, Point from, Point to) {
            g2.fillOval(from.x, from.y, to.x - from.x, to.y - from.y);
        }
    },
    LINE {
        void draw(Graphics2D g2, Point from, Point to) {
            g2.drawLine(from.x, from.y, to.x, to.y);
        }
    };
    
    //... Must define methods implemented by all constants as abstract.
    //    Note semicolon after last enum constant above.
    abstract void draw(Graphics2D g2, Point from, Point to);
}
