public class TextBox {
    // we are getting text value from the below methods
    // if we didn't initialise this text we may get NULL pointer exception
    // public String text; //Fields
    public String text = ""; // Now we wont get NullPointer Exception
    // we are using void because we are not expecting any return value
    // methods
    public void setText(String text) {
        this.text = text;
    }
    public void clear(){
        this.text = "";
    }

}
