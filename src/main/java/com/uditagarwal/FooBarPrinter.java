package com.uditagarwal;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class FooBarPrinter implements Runnable{

    private final State state;
    private final FooBar cur;
    private final FooBar next;
    int curValue;
    int maxValue;

    public FooBarPrinter(State state,FooBar cur,FooBar next,int curValue,int maxValue)
    {
        this.state = state;
        this.cur = cur;
        this.next = next;
        this.curValue = curValue;
        this.maxValue = maxValue;
    }

    @SneakyThrows
    @Override
    public void run()
    {
        while(this.curValue<=this.maxValue)
        {
            synchronized(state)
            {
                while(state.getNextToPrint()!=cur)
                {
                    state.wait();
                }
               Thread.sleep(500);
                if(cur.name().equals("Bar"))
                    System.out.println(cur.name());
                else
                    System.out.print(cur.name());
                curValue = curValue + 1;
                state.setNextToPrint(next);
                state.notifyAll();
            }
        }

    }
}
