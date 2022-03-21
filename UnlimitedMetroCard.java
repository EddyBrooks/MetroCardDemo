public class UnlimitedMetroCard extends MetroCard{
    int days;

    public UnlimitedMetroCard(int moneyPaid){
        if (moneyPaid == 33){
            days = 7;
        }
        else if (moneyPaid == 127){
            days = 30;
        }
        else {
            days = 0;
        }
    }

    @Override
    public boolean swipe(){
        if (days > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void newDay(){
        days--;
    }
}
