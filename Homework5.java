class PersonalComputer{
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer){
        this.monitor = monitor;
        this.computer = computer;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printinfo(){
        computer.printinfo();
        monitor.printinfo();
    }

}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor");
    }

    public void printinfo(){
        System.out.println("The spec of monitor");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer");
    }

    public void printinfo(){
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}


public class Homework5 {
    public static void main(String[] args) {
        Monitor mymoni = new Monitor("32 인치", "검은색", "45W");
        Computer mycom = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");
        PersonalComputer myPerCom = new PersonalComputer(mymoni, mycom);
        myPerCom.turnOn();
        myPerCom.printinfo();
    }
}
