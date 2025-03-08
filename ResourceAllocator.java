import java.util.*;

class VirtualMachine {
    int id;
    int cpuCores;
    int ram;
    boolean allocated = false;

    public VirtualMachine(int id, int cpuCores, int ram) {
        this.id = id;
        this.cpuCores = cpuCores;
        this.ram = ram;
    }
}

class ResourceAllocator {
    private List<VirtualMachine> vms = new ArrayList<>();

    public void addVM(VirtualMachine vm) {
        vms.add(vm);
    }

    public VirtualMachine allocateVM() {
        for (VirtualMachine vm : vms) {
            if (!vm.allocated) {
                vm.allocated = true;
                return vm;
            }
        }
        return null;
    }
}
