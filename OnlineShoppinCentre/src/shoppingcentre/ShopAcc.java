package shoppingcentre;

public class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        super();
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    public void setCharges(float charges) {
        this.charges = charges;
    }

    public void bookProduct(float charges) {
        System.out.println("Book Product charges is " + charges);
    }

    public void items(float charges) {
        System.out.println("Other Items charges is: " + charges);
    }

    @Override
    public String toString() {
        return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges =" + getCharges() + "]";
    }
}