/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

import InterfaceExamples.TipAmount;
import Interfaces.TipAmountInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TipAmountTest 
{
    
    public TipAmountTest() 
    {
        
    }
    
    @Test
    public void calcTip()
    {
        TipAmountInterface tipAmntInt = new TipAmount();
        
        double tipAmount = tipAmntInt.calcTip(375.80,10);
        Assert.assertEquals(37.58, tipAmount, 0.01);
        
    } 
    
}
