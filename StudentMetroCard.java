public class StudentMetroCard extends MetroCard
{
    // INSTANCE VARIABLES (if any)
    int remainingSwipes;


    // CONSTRUCTOR(S)
    public StudentMetroCard(){
        remainingSwipes = 3;
    }


    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe(){
        if (remainingSwipes > 0){
            remainingSwipes--;
            return true;
        }
        return false;
    }
    public void resetSwipes(){
        remainingSwipes = 3;
    }


}