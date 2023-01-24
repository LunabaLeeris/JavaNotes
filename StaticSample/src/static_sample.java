public class static_sample {
    int number;
    static int range;
    // a static keyword will allow  an attribute to be  shared by all the object instances of that class.
    // this can be visualized like a global variable that is shared among all objects of a class once updated

    static_sample(int nums){
        this.number = nums;
        range++; // if it's static, you no longer need to add this
    }

    static void print_range(){
        System.out.println(range);
    }
}
