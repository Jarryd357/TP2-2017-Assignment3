/*
TP Assignment 2 : TDD
Jarryd Pretorius
206155247
 */

package Config;

import InterfaceExamples.TipAmount;
import Interfaces.TipAmountInterface;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig 
{
    @Bean(name = "calcTip")
    public TipAmountInterface getService()
    {
        return new TipAmount();
    }        
            
}
