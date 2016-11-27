/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind2;


import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author laurin.agostini
 */
class ComboBoxRenderer extends JLabel implements ListCellRenderer {
    ComboBoxRenderer() {
        setOpaque(true);
    }
    
/*
     * This method finds the image and text corresponding
     * to the selected value and returns the label, set up
     * to display the text and image.
     */
        private Color charToColor(char key){
        switch(key){
            case '0':
                return Color.RED;
            case '1':
                return Color.BLUE;
            case '2':
                return Color.GREEN;
            case '3':
                return Color.ORANGE;
            case '4':
                return Color.CYAN;
            case '5':
                return Color.MAGENTA;
            case '6':
                return Color.YELLOW;
            case '7':
                return Color.PINK;
            case '8':
                return Color.DARK_GRAY;
            case '9':
                return Color.GRAY;
            case 'a':
                return Color.LIGHT_GRAY;
            case 'b':
                return Color.WHITE;
            case 'c':
                return Color.BLACK;
            case 'd':
                return new Color(63, 127, 191);
            case 'e':
                return new Color(127, 31, 0);
            default: 
                return null;
        }
    }
       
        
    
    public Component getListCellRendererComponent(
                                       JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus) {
        //Get the selected index. (The index param isn't
        //always valid, so just use the value.)
        setText((String)value);
        
        setBackground(charToColor(((String)value).charAt(0)));

        /*
        if (isSelected) {
        setBackground(list.getSelectionBackground());
        setForeground(list.getSelectionForeground());
        } else {
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        }
        
        //Set the icon and text.  If icon was null, say so.
        ImageIcon icon = images[selectedIndex];
        String pet = petStrings[selectedIndex];
        setIcon(icon);
        if (icon != null) {
        setText(pet);
        setFont(list.getFont());
        } else {
        setUhOhText(pet + " (no image available)",
        list.getFont());
        }
        */

        return this;
    }
}
