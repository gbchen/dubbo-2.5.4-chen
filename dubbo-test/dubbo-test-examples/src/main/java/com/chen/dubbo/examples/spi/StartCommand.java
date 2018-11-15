package com.chen.dubbo.examples.spi;

/**
 * @author cgb
 * @create 2018-11-15
 **/
public class StartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Start...");
    }
}
