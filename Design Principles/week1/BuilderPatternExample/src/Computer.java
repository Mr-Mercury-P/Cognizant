public class Computer
{
    int cpu, ram, storage;
    Computer(Builder builder)
    {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }
    public int getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public static class Builder
    {
        public Builder setCpu(int cpu) {
            this.cpu = cpu;
            return this;
        }
        private int cpu;
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        private int ram;
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }
        private int storage;
        public Computer build()
        {
            return new Computer(this);
        }
    }

}
