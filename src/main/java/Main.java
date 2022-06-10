import com.uditagarwal.*;
import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final State state = new State(FooBar.Foo);


        final OrderedPrinter first = new OrderedPrinter( state,PrintOrder.FIRST,PrintOrder.SECOND);
        final OrderedPrinter second = new OrderedPrinter( state,PrintOrder.SECOND,PrintOrder.THIRD);
        final OrderedPrinter third = new OrderedPrinter( state,PrintOrder.THIRD,PrintOrder.END);

        final FooBarPrinter foo = new FooBarPrinter(state,FooBar.Foo,FooBar.Bar,1,5);
        final FooBarPrinter bar = new FooBarPrinter(state,FooBar.Bar,FooBar.Foo,1,5);;
        final Printer oddPrinter = new Printer(1, 2, state, PrinterType.ODD, PrinterType.EVEN, 50);
        final Printer evenPrinter = new Printer(2, 2, state, PrinterType.EVEN, PrinterType.ODD, 50);

        final Thread oddThread = new Thread(oddPrinter);
        final Thread evenThread = new Thread(evenPrinter);

        final Thread firstThread = new Thread(first);
        final Thread secondThread = new Thread(second);
        final Thread thirdThread = new Thread(third);

        final Thread fooThread = new Thread(foo);
        final Thread barThread = new Thread(bar);
//        fooThread.start();
//         Thread.sleep(500);
//        barThread.start();
//        firstThread.start();
//        secondThread.start();
//        thirdThread.start();

//        oddThread.start();
//        evenThread.start();
        FixxBuzzModel fixxBuzzModel = new FixxBuzzModel(15);
        FizzBuzzPrinter fizz = new FizzBuzzPrinter(FizzBuzz.Fizz.name(),fixxBuzzModel);
        FizzBuzzPrinter buzz = new FizzBuzzPrinter(FizzBuzz.Buzz.name(),fixxBuzzModel);
        FizzBuzzPrinter fizzBuzz = new FizzBuzzPrinter(FizzBuzz.FizzBuzz.name(),fixxBuzzModel);
        FizzBuzzPrinter number = new FizzBuzzPrinter(FizzBuzz.Number.name(),fixxBuzzModel);
        Thread t1 = new Thread(fizz);
        Thread t2 = new Thread(buzz);
        Thread t3 = new Thread(fizzBuzz);
        Thread t4 = new Thread(number);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
