public class Ticket {
    private String ticketID; 
    private int ticketType; //input
    private int quantity; //input 
    private static double priceAdult = 300.00;
    private static double priceKid = 200.00;
    private static double pricepremium = 500.00;
    private String date;
    private String timeIN;
    private String timeOUT;

    public Ticket()
    {
        
    }
    public String getTicketID() {
        return ticketID;
    }

    public int getTicketType() {
        return ticketType;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double getPriceAdult() {
        return priceAdult;
    }

    public static double getPriceKid() {
        return priceKid;
    }

    public static double getPricepremium() {
        return pricepremium;
    }


    public String getDate() {
        return date;
    }

    public String getTimeIN() {
        return timeIN;
    }

    public String getTimeOUT() {
        return timeOUT;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void setPriceAdult(double priceAdult) {
        Ticket.priceAdult = priceAdult;
    }

    public static void setPriceKid(double priceKid) {
        Ticket.priceKid = priceKid;
    }

    public static void setPricepremium(double pricepremium) {
        Ticket.pricepremium = pricepremium;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimeIN(String timeIN) {
        this.timeIN = timeIN;
    }

    public void setTimeOUT(String timeOUT) {
        this.timeOUT = timeOUT;
    }
    
    
}
