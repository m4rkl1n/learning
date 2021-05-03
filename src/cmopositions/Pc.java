package cmopositions;

public class Pc {
    private int ram;
    private String GPU;
    private int storage;
    private Cpu cpu;

    public Pc(int ram, String GPU, int storage, Cpu cpu) {
        this.ram = ram;
        this.GPU = GPU;
        this.storage = storage;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
