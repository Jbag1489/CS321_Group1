package cs321.other;
/**
 * UserSettings class will allow the user to have options to modify profile.
 * 
 * @author Group1
 * 04/18/16
 */
public class UserSettings {
    /**
     * Declared field variables that represent font, font color, font size
     * and the window color.
     */
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
     * Returns a font.
     * @return the font
     */
    public String getFont() {
        return font;
    }

    /**
     * Sets or updates the font that the user selected.
     * @param font the font to set
     */
    public void setFont(String font) {
        this.font = font;
    }

    /**
     * Returns a font color.
     * @return the fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Sets or updates the font color that the user selected.
     * @param fontColor the fontColor to set
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * Returns a font size.
     * @return the fontSize
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Sets or updates font size based on user's selection.
     * @param fontSize the fontSize to set
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Returns a background color of the window that the user
     * will see when typing an assignment.
     * @return the windowColor
     */
    public String getWindowColor() {
        return windowColor;
    }

    /**
     * Sets or updates the background window color
     * based on the user's selection.
     * @param windowColor the windowColor to set
     */
    public void setWindowColor(String windowColor) {
        this.windowColor = windowColor;
    }
    
    
}

