package com.chen.dubbo.examples.spi;

import java.util.ServiceLoader;

/**
 * @author cgb
 * @create 2018-11-15
 **/
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Command> serviceLoader = ServiceLoader.load(Command.class);

        for (Command command : serviceLoader){
            command.execute();
        }
    }
}
