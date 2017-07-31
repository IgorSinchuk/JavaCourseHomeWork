package prog.kiev.ua.homework.Module3.Hardware;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igorsinchuk on 7/29/17.
 */
public class Runner {

    public static void main(String[] args) {
        HDD hdd = new HDD();
        RAM ram = new RAM();
        CPU cpu = new CPU();
        ODD odd = new ODD();
        Computer computer = new Computer(hdd, odd, ram, cpu);
        System.out.println(computer.computerIsOn());
        computer.powerOn();
        System.out.println(computer.computerIsOn());
        System.out.println("Virus: " + computer.virusCheck() + "value");
        computer.virusRemove();
        System.out.println("Virus: " + computer.virusCheck() + "value");
        computer.printToConsole();

        }


    }

