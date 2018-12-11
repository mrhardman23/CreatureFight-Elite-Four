import greenfoot.*;

/**
 * Write a description of class PlayerCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightCommands implements MenuCommands
{
    /**
     * execute executes the appropriate action based on which kind 
     * of menu is being used, which option is selected, and for which creature
     * the option is selected
     * 
     * @param idx is the index of the option chosen
     * @param c is the creature that is currently in play
     * @return Nothing is returned
     */
    public void execute(int idx, Creature c)
    {
        c.attack(idx);
    }
}
