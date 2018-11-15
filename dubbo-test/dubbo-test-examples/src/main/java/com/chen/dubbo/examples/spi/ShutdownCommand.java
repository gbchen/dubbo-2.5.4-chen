package com.chen.dubbo.examples.spi;

/**
 * @author cgb
 * @create 2018-11-15
 **/
public class ShutdownCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Shutdown...");
    }
}
