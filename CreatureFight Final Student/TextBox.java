import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    private GreenfootImage img;
    private String text;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public TextBox(String s, int fs, boolean b, Color fg, Color bg){
        super();
        fontSize = fs;
        foreground = fg;
        background = bg;
        text = s;
        img = new GreenfootImage(text, fontSize, foreground, background);
        border = b;
        display();
    }
    
    public void setText(String s){
        text = s;
        img = new GreenfootImage(text, fontSize, foreground, background);
        display();
    }
    
    public void display(){
        setImage(img);
        if(border == true){
            img.setColor(Color.BLACK);
            img.drawRect(0, 0, img.getWidth() - 1, img.getHeight()-1);
            setImage(img);
        }
    }
    
    public String getText()
    {
        return text;
    }
}
