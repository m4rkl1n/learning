package cmopositions;

public class Cpu {
    public Cpu(String name, int cores, int threads) {
        this.name = name;
        this.cores = cores;
        this.threads = threads;
    }

    private String name;
    private int cores;
    private int threads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
}
