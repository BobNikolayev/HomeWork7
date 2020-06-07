import java.lang.reflect.Constructor;

public class Animals {
    int eat;
    String name;
    boolean feedUp;

    public int getEat(){
        return eat;
    }

    public boolean getFeegUp(){
        return feedUp;
    }


    public boolean eat(Plate plate){
        System.out.println(name + " eat...");
        plate.foodDecrease(getEat());

//проверка на сытость
        if((plate.getFood() < getEat()) == false){
            System.out.println("cat is feed up.");
            return feedUp = true;
        }
        else{
            System.out.println("cat is not feed up");
            return feedUp = false;
        }
    }

}
