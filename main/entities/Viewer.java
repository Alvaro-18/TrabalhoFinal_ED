package main.entities;

public class Viewer {
    
    private Integer seatNumber;
    private Double paymentPrice;
    private Boolean halfPrice;
    
    public Viewer(Integer seatNumber, Boolean halfPrice) {
        this.seatNumber = seatNumber;
        this.halfPrice = halfPrice;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean isHalfPrice() {
        return halfPrice;
    }

    public void setHalfPrice(Boolean halfPrice) {
        this.halfPrice = halfPrice;
    }

    public Double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    @Override
    public String toString() {
        return "Viewer [seatNumber=" + seatNumber + ", halfPrice=" + halfPrice + "]";
    }
}
