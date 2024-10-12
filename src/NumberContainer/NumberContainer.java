package NumberContainer;

public class NumberContainer{
    private String Name;
    private float Num1;
    private float Num2;
    private float Result;
    private OperatorType Operator;
    public NumberContainer(String name, float num1, float num2, OperatorType operator){
        this.Name = name;
        this.Num1 = num1;
        this.Num2 = num2;
        this.Operator = operator;
    }
    public String GetOperatorString() {
        switch (Operator) {
            case OperatorType.ADDITION:
                return "+";
            case OperatorType.SUBTRACTION:
                return "-";
            case OperatorType.MULTIPLICATION:
                return "*";
            case OperatorType.DIVISION:
                return "/";
            case OperatorType.MODULO:
                return "%";
        }
        return "";
    }
    public void Calculate(){
        switch(Operator){
            case OperatorType.ADDITION:
                this.Result = this.Num1 + this.Num2;
                break;
            case OperatorType.SUBTRACTION:
                this.Result = this.Num1 - this.Num2;
                break;
            case OperatorType.MULTIPLICATION:
                this.Result = this.Num1 * this.Num2;
                break;
            case OperatorType.DIVISION:
                this.Result = this.Num1 / this.Num2;
                break;
            case OperatorType.MODULO:
                this.Result = this.Num1 % this.Num2;
                break;
        }
    }
    public String toString(){

        String returnText = " ";
        returnText += this.Name;
        returnText += ":              ";
        returnText += this.Num1;
        returnText += GetOperatorString();
        returnText += this.Num2;
        returnText += "=";
        double roundOff = Math.round(this.Result * 100.0) / 100.0;
        returnText += roundOff;
        return returnText;
    }
}
