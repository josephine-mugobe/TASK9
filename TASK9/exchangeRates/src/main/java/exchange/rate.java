package exchange;

public class rate {
    static final double UGX_to_USD = 1.0/3600;
    static final double USD_to_UGX = 3600;

    public static double displayRate(String from, String to) {
        if (from.equals("UGX")  && to.equals("USD") ) {
            return UGX_to_USD;
        } else if (from.equals("USD")  && to.equals("UGX")) {
            return USD_to_UGX;
        }
        else {
            System.out.println("It doesn't fit this conversion");
            return 0;
        }
    }
}
