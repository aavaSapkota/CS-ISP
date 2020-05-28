
public class Vars {
    private int screen;
    private boolean win; 
    private boolean correct; 
    public Vars(int s){
        screen=s; 
    }  
    public Vars(boolean w){
        win=w; 
    }

    public Vars(boolean w, String type){
        correct = w; 
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

    public boolean getCorrect(){
        return win; 
    }

    public void setCorrect(boolean w){
        win = w; 
    }

    
}