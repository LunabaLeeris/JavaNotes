public class Main {
    public static void main(String[] args) {
        /* object copying is the act of transferring the values of an object to another
        object of the same class
         */

        /* never do obj1 = obj2 as it only converts the address of obj1 to obj2 thus appearing like it has
        copied obj2 when in fact obj1 still exist in memory with all its previous values
        */

        /* to achieve this, we can create a copy method in our parent class */

        Houses house1 = new Houses("241 baker street", "blue", 30000);
        Houses house2 = new Houses("hamilton street", "red", 500000);
        house1.getAllDatas();
        house2.getAllDatas();

        house1.copy(house2); // copy
        System.out.println("--------------------------");

        house1.getAllDatas();
        house2.getAllDatas();

        System.out.println(house1);
        System.out.println(house2); // remains having different memory locations
    }
}


