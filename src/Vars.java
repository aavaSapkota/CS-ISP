
public class Vars {
    private int screen;
    private boolean skip; 
    public Vars(int s){
        screen=s; 
    }  
    public Vars(boolean w){
        skip=w; 
    }

    public Vars(boolean w, String type){
        skip = w; 
    }
    
    public int getScreen(){
        return screen; 
    }  

    public void setScreen(int s){
        screen=s; 
    }

    public boolean getSkip(){
        return skip; 
    }

    public void setSkip(boolean w){
        skip = w; 
    }

}