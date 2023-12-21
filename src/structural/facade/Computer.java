package structural.facade;

// Subsystem 1: CPU
class CPU {
    public void powerOn() {
        System.out.println("CPU is powered on.");
    }

    public void executeInstructions() {
        System.out.println("CPU is executing instructions.");
    }
}

// Subsystem 2: Memory
class Memory {
    public void initialize() {
        System.out.println("Memory is initialized.");
    }
}

// Subsystem 3: GPU
class GPU {
    public void enableGraphics() {
        System.out.println("GPU graphics are enabled.");
    }
}

// Facade: Computer System
class ComputerSystemFacade {
    private final CPU cpu;
    private final Memory memory;
    private final GPU gpu;

    public ComputerSystemFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.gpu = new GPU();
    }

    public void startComputer() {
        System.out.println("Starting the computer...");
        cpu.powerOn();
        memory.initialize();
        gpu.enableGraphics();
        cpu.executeInstructions();
        System.out.println("Computer is ready to use.");
    }
}

