# Kubernetes (K8s) Project

This project demonstrates the setup and usage of Kubernetes (K8s) for automating the deployment, scaling, and management of containerized applications. Kubernetes ensures high availability and fault tolerance, making it an essential tool for modern DevOps practices.
<br>
<br>

## What is Kubernetes (K8s)?

Kubernetes (K8s) is an open-source system for automating the deployment, scaling, and management of containerized applications. It manages the lifecycle of containers across a cluster of servers, ensuring that the desired state of your applications is maintained.

### Key Benefits of Kubernetes

- **Scalability:** Automatically scale applications up or down based on demand.
- **Reliability:** Ensures applications remain available by distributing containers across multiple nodes.
- **Automation:** Automates the creation, deletion, and management of containers.

### Downsides of Kubernetes

- **Complexity:** Requires significant setup and management effort.
- **Resource-Intensive:** Needs considerable computational resources for clusters and nodes.  
### What is a Cluster and Why is it Needed?
Cluster in the context of Kubernetes is a group of computers (nodes) working together as a single system to ensure high availability and scalability of applications. Kubernetes clusters consist of:

- **Master Nodes** Manage the cluster's state and orchestrate tasks.
- **Worker Nodes** Run the application containers.


### Main Components of a Kubernetes Cluster:

- **Master Nodes**: Manage the cluster's state and handle scheduling, state management, and tasks.
- **Worker Nodes**: Run the application containers and have components like kubelet, container runtime, and kube-proxy.  
- **Pod**: The basic unit of deployment in Kubernetes. It represents one or more containers that share network resources and a filesystem. Pods are created, managed, and scaled by controllers (e.g., Deployment, StatefulSet).  



![K8S as a picture](https://cdn.thenewstack.io/media/2023/10/579e1d5e-image3.png)  


<br>
<br>
<br>


### Why Kubernetes?
- **Scalability**: Kubernetes allows automatic scaling of applications based on load, meaning your application can handle more users and requests without manual intervention.  
- **High Availability and Fault Tolerance**: Kubernetes distributes containers across multiple nodes, ensuring the application remains available even if some nodes fail.  


## Project Files
- **Dockerfile**: A text file with instructions for creating a Docker image. It defines how the application and its dependencies should be packaged in an image that can run in a Docker container.


- **deployment.yaml**: Describes a Kubernetes Deployment object. It manages application deployments, ensuring their scalability.


- **service.yaml**: Describes a Kubernetes Service object. It provides access to one or more pods, acting as a load balancer. The Service provides a stable IP address and DNS name for a set of pods, simplifying interaction with them and ensuring load balancing.



## Getting Started

### Prerequisites

1. **kubectl:** A command-line tool for interacting with Kubernetes clusters.
    - Installation guide: [Install kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

2. **minikube:** A tool to run Kubernetes locally.
    - Installation guide: [Install minikube](https://kubernetes.io/docs/tasks/tools/install-minikube/)

### Setting Up Kubernetes

1. **Set Docker as the default driver for minikube:**
   ```sh
   minikube config set driver docker



Start the local Kubernetes cluster:

sh
minikube start
Check the status of the local cluster:

sh
minikube status
Delete the existing Minikube cluster:

sh
minikube delete
Verify running Docker containers:

sh
docker ps
Check the versions of kubectl client and server:

sh
kubectl version
Get cluster information:

sh
kubectl cluster-info
Check kubectl version through minikube:

sh
minikube kubectl version
Using kubectl Commands
To simplify kubectl commands, you can create an alias (temporary until the console is closed):

sh
alias k=kubectl
Get node information:

sh
k get nodes
Get pod information:

sh
k get pods
Get namespace information:

sh
k get namespaces
Get pods in the kube-system namespace:

sh
k get pods --namespace=kube-system
Get the IP address of the minikube node:

sh
minikube ip
SSH into the minikube node:

sh
minikube ssh
docker ps  # View all containers running inside the Docker container
exit  # Exit SSH session
Creating and Managing Resources
Create a pod:

sh
k run my-nginx-pod --image=nginx
k get pods  # Get pod information
Get detailed pod information:

sh
k describe pod my-nginx-pod
Delete a pod:

sh
k delete pod my-nginx-pod
Create a deployment:

sh
k create deployment my-nginx-pod --image=nginx
Get detailed deployment information:

sh
k describe deploy my-nginx-pod
Minikube Commands
Start a local Kubernetes cluster:

sh
minikube start
Get the status of a local Kubernetes cluster:

sh
minikube status
Stop a running local Kubernetes cluster:

sh
minikube stop
Delete a local Kubernetes cluster:

sh
minikube delete
Access the Kubernetes dashboard within the minikube cluster:

sh
minikube dashboard
Pause Kubernetes:

sh
minikube pause
Unpause Kubernetes:

sh
minikube unpause
### What is a Cluster and Why is it Needed?
Cluster in the context of Kubernetes is a group of computers (nodes) working together as a single system to ensure high availability and scalability of applications. Kubernetes clusters consist of:

- **Master Nodes** Manage the cluster's state and orchestrate tasks.
- **Worker Nodes** Run the application containers.\


Main Components of a Kubernetes Cluster:
Nodes (Узлы):

Master Nodes: Manage the cluster's state and handle scheduling, state management, and tasks.
Worker Nodes: Run the application containers and have components like kubelet, container runtime, and kube-proxy.
Pod:

The basic unit of deployment in Kubernetes. It represents one or more containers that share network resources and a filesystem. Pods are created, managed, and scaled by controllers (e.g., Deployment, StatefulSet).
Why Use Kubernetes?
Scalability: Kubernetes allows automatic scaling of applications based on load, meaning your application can handle more users and requests without manual intervention.
High Availability and Fault Tolerance: Kubernetes distributes containers across multiple nodes, ensuring the application remains available even if some nodes fail.
Project Files
Dockerfile: A text file with instructions for creating a Docker image. It defines how the application and its dependencies should be packaged in an image that can run in a Docker container.

deployment.yaml: Describes a Kubernetes Deployment object. It manages application deployments, ensuring their scalability.

service.yaml: Describes a Kubernetes Service object. It provides access to one or more pods, acting as a load balancer. The Service provides a stable IP address and DNS name for a set of pods, simplifying interaction with them and ensuring load balancing.
