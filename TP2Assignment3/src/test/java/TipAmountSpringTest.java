/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

import Config.AppConfig;
import InterfaceExamples.TipAmount;
import Interfaces.TipAmountInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class TipAmountSpringTest 
{
    
    public TipAmountSpringTest() 
    {
        
    }
    
    private TipAmountInterface tipAmntInt;
    
    @Before
    public void setUp() throws Exception 
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tipAmntInt = (TipAmountInterface)ctx.getBean("calcTip");
    }
    
    @After
    public void tearDown() throws Exception 
    {
 
    }
    
    @Test
    public void testCalcTip() throws Exception 
    {
        double tipAmount = tipAmntInt.calcTip(375.80,10);
        Assert.assertEquals(37.58, tipAmount, 0.01);
    }
    
}
