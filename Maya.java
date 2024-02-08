public class Maya implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Payment is Gcash\n";
        output += "You will receive 1% incentives";

        return output;
    }
}
