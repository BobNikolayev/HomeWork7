public class Plate {

    boolean catFeed;
    private int food;

    public Plate (int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    //Кот седает из тарелки
    public boolean foodDecrease(int amount) {
        if (0 > ((getFood() - amount))){
            System.out.println("Cat cant eat because plate is empty...");
            return catFeed = false;
        }else{
            food -= amount;
            return catFeed = true;
        }
    }


    public void info(){
        System.out.println("Plate: " + food);
    }
    //Метод добавления еды в тарелку.
    public int foodAdd(int add){
        food = food + add;
        return food;
    }

}
