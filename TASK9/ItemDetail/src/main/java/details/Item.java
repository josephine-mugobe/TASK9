package details;

import exchange.rate;

public class Item {
    String ItemName;
    int ItemId;
    double ItemPrice;
    String Expired_date;

    public Item(String ItemName, int ItemId, double ItemPrice, String Expired_date ){
        this.ItemName=ItemName;
        this.ItemId=ItemId;
        this.ItemPrice=ItemPrice;
        this.Expired_date=Expired_date;
    }
    public double GetItemCost(int numberOfItem){
        double cost= ItemPrice*numberOfItem;
        return cost;
    }
}
