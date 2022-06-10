package com.uditagarwal;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class OrderedPrinter implements Runnable{
    private final State state;
    private final PrintOrder cur;
    private final PrintOrder next;

    public OrderedPrinter(State state,PrintOrder cur,PrintOrder next)
    {
        this.state = state;
        this.cur = cur;
        this.next = next;
    }

    @SneakyThrows
    @Override
    public void run()
    {
//        if(!cur.name().equals("END")) {
//            synchronized (state) {
//                while (state.getNextToPrint() != cur) {
//                    state.wait();
//                }
//                System.out.println(cur.name());
//                state.setNextToPrint(next);
//                state.notifyAll();
//            }
//        }
    }
}
