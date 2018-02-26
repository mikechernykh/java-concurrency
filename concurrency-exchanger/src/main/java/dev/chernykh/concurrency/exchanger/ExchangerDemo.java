package dev.chernykh.concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        
        new UseString(exchanger);
        new MakeString(exchanger);
    }
}
