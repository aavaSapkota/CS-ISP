/**
 * Creators: Aava Sapkota and Sarah Zhao
 * Class: ICS4UO-1
 * Teacher: Ms.Krasteva
 * Project: ISP
 */

public class Vars {
    //variable declarations
    private int screen;
    private boolean skip; 
 
    //Vars default constructor
    public Vars(int s){
        screen=s; 
    }  
 
    //Vars overloaded constructor 
    public Vars(boolean w){
        skip=w; 
    }
 
    //Vars overloaded constructor
    public Vars(boolean w, String type){
        skip = w; 
    }
    
    //get screen method
    public int getScreen(){
        return screen; 
    }  
 
    //set screen method
    public void setScreen(int s){
        screen=s; 
    }
 
    //get skip method
    public boolean getSkip(){
        return skip; 
    }
 
    //set skip method
    public void setSkip(boolean w){
        skip = w; 
    }
 
}
