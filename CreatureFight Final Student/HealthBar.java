import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    private final int WIDTH = 200;
    private final int HEIGHT = 30;

    private GreenfootImage frame;
    private GreenfootImage healthBar;

    private Color good;
    private Color warning;
    private Color danger;

    private int target;
    private int current;
    private int max;
    private int speed;

    public HealthBar()
    {
        frame = new GreenfootImage(WIDTH, HEIGHT);
        healthBar = new GreenfootImage(WIDTH, HEIGHT);

        frame.setColor( Color.GRAY );
        frame.fillRect(0, 0, WIDTH, HEIGHT);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;

        max = 1000;
        current = 600;
        target = current;
        speed = 1;

        updateBar();
    }

    public HealthBar(int c, int m, int s)
    {

        frame = new GreenfootImage(WIDTH, HEIGHT);
        healthBar = new GreenfootImage(WIDTH, HEIGHT);

        frame.setColor( Color.GRAY );
        frame.fillRect(0, 0, WIDTH, HEIGHT);

        good = Color.GREEN;
        warning = Color.YELLOW;
        danger = Color.RED;

        max = m;
        current = c;
        target = current;
        speed = s;

        updateBar();
    }

    public void act()
    {
        if( current > target )
        {
            current -= speed;

            if( current < target )
            {
                current = target;
            }
        }
        else
        {
            current += speed;

            if( current > target )
            {
                current = target;
            }
        }

        updateBar();
    }

    private void updateBar()
    {
        GreenfootImage text = new GreenfootImage(WIDTH, HEIGHT);
        double ratio = (double)current / (double)max;
        int healthWidth = (int)Math.round(ratio*frame.getWidth());
        
        if( current > max / 2 )
        {
            healthBar.setColor( good );
        }
        else if( current > max / 4 )
        {
            healthBar.setColor( warning );
        }
        else
        {
            healthBar.setColor( danger );
        }
        
        healthBar.clear();
        healthBar.fillRect( 0, 0, healthWidth, HEIGHT );
        
        text.clear();
        text.setColor( Color.BLACK );
        text.setFont( new Font( "Times New Roman", false, false, 20 ) );
        text.drawString(current + " / " + max, 0, HEIGHT-text.getFont().getSize()/2);
        
        frame.clear();
        frame.setColor( Color.GRAY );
        frame.fillRect(0, 0, WIDTH, HEIGHT);
        frame.drawImage( healthBar, 0, 0 );
        frame.drawImage( text, WIDTH/3, 0 );

        setImage( frame );
    }

    public void add( int change )
    {
        target += change;

        if( target > max )
        {
            target = max;
        }

        if( target < 0 )
        {
            target = 0;
        }
    }

    public void setTarget( int t )
    {
        target = t;
    }

    public void setCurrent( int c )
    {
        current = c;
    }

    public void setMax( int m )
    {
        max = m;
    }

    public void setSpeed( int s )
    {
        speed = s;
    }

    public int getMax()
    {
        return max;
    }

    public int getCurrent()
    {
        return current;
    }
    
    public int getTarget()
    {
        return target;
    }

}
