/*
TP Assignment 3 : Collections and Interfaces
Jarryd Pretorius
206155247
 */

package InterfaceExamples;
import Interfaces.TipAmountInterface;

public class TipAmount implements TipAmountInterface
{
    @Override
    public double calcTip(double amount, int percentage)
    {
        return(amount * (percentage/100.0));
    }
}
