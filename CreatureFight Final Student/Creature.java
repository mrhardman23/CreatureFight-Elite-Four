import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends Actor
{
    private HealthBar creatureBar;
    private int healthNumber;
    private int playerOwnership;
    private String type;

    /**
     * Default constructor for objects of the Creature class
     * 
     * @param There are no parameters
     * @return an object of the Creature class
     */
    public Creature()
    {
        healthNumber = 500;
        playerOwnership = 0;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
    }

    /**
     * Constructor that allows customization of objects of the Creature class
     * 
     * @param health is the amount of health the Creature object will have
     * @param whichPlayer discusses whether the creature belongs to player 1 or player 2
     * @param creatureType is the characteristic group that the Creature belongs to
     * @return an object of the Creature class
     */
    public Creature( int health, int whichPlayer, String creatureType )
    {
        healthNumber = health;
        playerOwnership = whichPlayer;
        type = creatureType;
        creatureBar = new HealthBar(healthNumber, healthNumber, 10);
    }
    
    /**
     * act will complete actions that the Creature object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        //empty method to be overridden by subclasses
    } 

    /**
     * attack takes away health from the enemy Creature using one of
     * two predefined attacks
     * 
     * @param idx is the index of the attack option selected
     * @return Nothing is returned
     */
    public void attack(int idx)
    {
        //empty method that will get overriden in subclasses
    }

    /**
     * TODO (2): Declare a switchCreature method that will be accessed by other
     *          classes, has no return type, and one parameter called idx
     *          
     *          Leave this method empty, it will be overriden by subclasses
     */
    

    /**
     * TODO (3): Declare a switchedIn method that will be accessed by other
     *          classes, has no return type, and has no parameters
     *          
     *          Leave this method empty, it will be overriden by subclasses
     */
    

    /**
     * getHealthBar returns the health bar for this creature
     * for use in other parts of the code or for the user's information
     * 
     * @param There are no parameters
     * @return A HealthBar object that corresponds to the health bar
     *         for this creature
     */
    protected HealthBar getHealthBar()
    {
        return creatureBar;
    }

    /**
     * getPlayerOwner states whether the creature is owned by player
     * one or player two
     * 
     * @param There are no parameters
     * @return An integer that represents which player this Creature belongs to
     */
    public int getPlayerOwner()
    {
        return playerOwnership;
    }

    /**
     * getType returns the characteristic group that this Creature
     * belongs to for use in other parts of the code or for the user's
     * information
     * 
     * @param There are no parameters
     * @return A String that states the Creature's characteristic group
     */
    protected String getType()
    {
        return type;
    }  

}
