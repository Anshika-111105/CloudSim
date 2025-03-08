# Simulation of Inter VM Data Exchange in Cloud Computing using CloudSim

## Overview
This project simulates inter-VM (Virtual Machine) data exchange in a cloud computing environment using **CloudSim**. CloudSim is a powerful simulation framework that enables modeling, simulation, and experimentation with cloud infrastructures and services.

## Objective
The primary goal of this project is to:
- Simulate data exchange between multiple VMs in a cloud data center.
- Analyze network latency, bandwidth utilization, and data transfer efficiency.
- Understand the impact of VM placement strategies on data exchange performance.

## Features
✅ CloudSim-based environment for simulating VMs and cloud resources.  
✅ Efficient data transfer modeling between VMs.  
✅ Flexible configuration for VM allocation policies and network settings.  
✅ Performance analysis with metrics like latency, throughput, and resource utilization.  

## Technologies Used
- **Java** (Programming Language)
- **CloudSim** (Cloud Simulation Toolkit)
- **Eclipse IDE / IntelliJ IDEA** (Recommended IDE for development)

## Prerequisites
Before you begin, ensure you have the following installed:
- Java Development Kit (JDK)
- CloudSim 4.0 or later
- IDE (Eclipse, IntelliJ IDEA, or similar)

## Installation
1. **Clone the Repository**
```bash
git clone https://github.com/username/cloudsim-vm-data-exchange.git
cd cloudsim-vm-data-exchange
```

2. **Import Project in IDE**
- Open your IDE (e.g., Eclipse).
- Import the project as an existing Java project.

3. **Add CloudSim Library**
- Download CloudSim from [CloudSim GitHub Repository](https://github.com/Cloudslab/cloudsim).
- Add the CloudSim JAR file to your project's build path.

## Usage
1. Run the **Main.java** file to simulate inter-VM data exchange.
2. Configure VM specifications, data size, and network constraints in the code as required.

### Example Code Snippet
```java
DatacenterBroker broker = createBroker("Broker_1");
List<VM> vmList = createVM(broker.getId(), 4); // Creating 4 VMs
List<Cloudlet> cloudletList = createCloudlet(broker.getId(), 10); // Creating 10 Cloudlets
broker.submitVmList(vmList);
broker.submitCloudletList(cloudletList);
CloudSim.startSimulation();
```

## Output
The output will include:
- VM-to-VM data transfer time.
- Network bandwidth utilization.
- Performance metrics like throughput and latency.

## Future Enhancements
- Implement dynamic load balancing for efficient data exchange.
- Integrate advanced VM placement algorithms.
- Add a user interface for better visualization.

## References
- [CloudSim Documentation](https://github.com/Cloudslab/cloudsim)
- Research papers on Inter-VM Communication in Cloud Computing

## Contributors
- **Anshika Saklani** 
- [Team Member]- **Akriti Rawat, Manya Chauhan**

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

