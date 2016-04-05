/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.other;

/**
 *
 * @author Joshua
 */
public class UserSettings {
    private String font;
    private String fontColor;
    private int fontSize;
    private String windowColor;

    /**
     * Default constructor for UserSettings.
     */
    public UserSettings(){
        font = "Tahoma";
        fontColor = "Black";
        fontSize = 12;
        windowColor = "White";
    }
    
    
    /**
     * @return the font
     */
    public String getFont() {
        return font;
    }

    /**
     * @param font the font to set
     */
    public void setFont(String font) {
        this.font = font;
    }

    /**
     * @return the fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * @param fontColor the fontColor to set
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * @return the fontSize
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return the windowColor
     */
    public String getWindowColor() {
        return windowColor;
    }

    /**
     * @param windowColor the windowColor to set
     */
    public void setWindowColor(String windowColor) {
        this.windowColor = windowColor;
    }
    
    
}

