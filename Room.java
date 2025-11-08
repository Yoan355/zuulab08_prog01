import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Room 
{
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;
    public Room upExit;
    public Room downExit;
    public HashMap<String,Room> exits;

    /**
     * Create a room described "description". Initially, it has no exits. 
     * "description" is something like "a kitchen" or "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        HashMap<String, Room> exits = new HashMap<>(); //q8

        this.description = description;

        exits= new HashMap<String, Room >();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west,Room up,Room down) 
    {
        if(north != null) {
            exits.put("north", north);
        }
        if(east != null) {
            exits.put("east", east);
        }
        if(south != null) {
            exits.put("south", south);
        }
        if(west != null) {
            exits.put("west", west);
        }

        if (up != null){ //q8,q7
            exits.put("up", up);
        }

        if(down != null){ //q8,q7
            exits.put("down", down);
        }

    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public Room getExit(String direction){
        if (direction.equals("north")){
            return northExit;

        }

        if (direction.equals("east")){
            return eastExit;

        }

        if (direction.equals("south")){
            return southExit;

        }

        if (direction.equals("west")){
            return westExit;

        }

        if (direction.equals ("up")){ //q8
            return upExit;
        }

        if (direction.equals ("down")){ //q8
            return downExit;
        }

        return null;

    }

    /** * Return a description of the room’s exits,
     * for example, "Exits: north west".
     * @return A description of the available exits. */

    public String getExitString() { // Q7
        String exitString = "Exits: ";
        if (northExit !=null){
            exitString += "north: ";
        }

        if (eastExit !=null){
            exitString += "east: ";
        }

        if (southExit !=null){
            exitString += "south: ";
        }

        if (westExit !=null){
            exitString += "west: ";
        }

        if(upExit != null){ //q8
            exitString +="up: ";

        }

        if (downExit != null){ //q8
            exitString += "down: ";

        }

        return exitString;

    }
}
