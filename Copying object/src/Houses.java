public class Houses {
    private String address;
    private String color;
    private int cost;

    Houses(String address, String color, int cost){
        setAddress(address);
        setColor(color);
        setCost(cost);
    }

    public String getAddress(){
        return this.address;
    }

    public String getColor(){
        return this.color;
    }

    public int getCost(){
        return this.cost;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void getAllDatas(){
        System.out.println(this.address);
        System.out.println(this.color);
        System.out.println(this.cost);
    }

    public void copy(Houses x){
        this.address = x.getAddress();
        this.color = x.getColor();
        this.cost = x.getCost();
    }
}
