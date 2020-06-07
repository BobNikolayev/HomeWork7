public class Main {
    public static void main(String[] args) {

        //Cat cat = new Cat("Murzik", 10);
        Plate plate = new Plate(100);
//массив котов
        Animals[] animals = new Animals[5];
        animals[0] = new Cat("Barsik", 10,false);
        animals[1] = new Cat("Murzik", 90,false);
        animals[2] = new Cat("Mars", 20,false);
        animals[3] = new Cat("Tolik", 30,false);
        animals[4] = new Cat("Vasia",5, false);


        // animals[2].eat(plate);

        // plate.info();
//индикатор сытости

//            if (((animals[0].getFeegUp())) == true) {
//                System.out.println("Cat is feed up");
//            } else {
//                System.out.println("Cat is not feed up");
//            }


        //  plate.foodAdd(100);

        // plate.info();

        //цыкл едящих котов
        for (int i = 0; i < animals.length ; i++) {
            animals[i].eat(plate);
            plate.info();

        }

    }






}