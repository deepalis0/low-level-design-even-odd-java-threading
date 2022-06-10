package com.uditagarwal;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class FizzBuzzPrinter implements Runnable{

    private final String curValue;
    private final FixxBuzzModel fixxBuzzModel;

    public FizzBuzzPrinter(String curValue,FixxBuzzModel fixxBuzzModel)
    {
       this.curValue = curValue;
       this.fixxBuzzModel = fixxBuzzModel;

    }



    @SneakyThrows
    @Override
    public void run()
    {
        if("Fizz".equals(curValue))
        {
            fixxBuzzModel.isDivisibleBy3();
        }
        else if("Buzz".equals(curValue))
        {
            fixxBuzzModel.isDivisibleBy5();
        }
        else if("FizzBuzz".equals(curValue))
        {
            fixxBuzzModel.isDivisibleBy3_5();
        }
        else {
            fixxBuzzModel.isDivisibleByNone();
        }
    }


}
