package com.pattern.example.demo.gof.structural.facade.src;

public class Application {

    public static void main(String[] args) {

        ComputerFacade computerFacade = new ComputerFacade(new Cpu(), new Memory(), new HardDrive());
        computerFacade.startComputer();

    }
}
