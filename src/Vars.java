
public class Vars {
    private int screen;
    private boolean win; 
    public Vars(int s){
        screen=s; 
    }  
    public Vars(boolean w){
        win=w; 
    }
    
    public int getScreen(){
        return screen; 
    }  

    public void setScreen(int s){
        screen=s; 
    }

    public boolean getWin(){
        return win; 
    }

    public void setWin(boolean w){
        win = w; 
    }

    
}