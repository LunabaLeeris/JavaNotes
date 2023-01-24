package GenericClasses;

public class SecondGenericClass<T, V>{ // notice that inside <> Two parameters were inputted
    T firstVal;
    V secondVal;

    SecondGenericClass(T firstVal, V secondVal){
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    public String getValues(){
        return ""+firstVal+" and "+secondVal+"";
    }
}
