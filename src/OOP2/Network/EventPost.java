package OOP2.Network;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.3
 */
public class EventPost extends Post
{
    private String eventType; // the type of event that this instance of object is

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The event type of this post.
     */
    public EventPost(String author, String text)
    {
        super(author);
        eventType = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return eventType;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
    	super.display();
    	System.out.println();
        System.out.println(eventType);
    }
}