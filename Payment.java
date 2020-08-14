public class Payment {
    private String paymentType; 
    private int cardNum;
    private int expiryDate; //if-else
    
//	private static String setDiscountCode(){  }
//	private static String getDiscountCode(){  }

    public String getPaymentType() {
        return paymentType;
    }

    public int getCardNum() {
        return cardNum;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    
}
