public class SingleRideMetroCard extends MetroCard
{

    // INSTANCE VARIABLES (if any)
    boolean active;



    // CONSTRUCTOR(S)
    public SingleRideMetroCard(){
        active = true;
    }



    // METHODS (if any), including overridden methods
    @Override
    public boolean swipe(){
        if (active){
            active = false;
            return true;
        }
        return false;
    }

}
