# Kubernetes (K8s) Project

This project demonstrates the setup and usage of Kubernetes (K8s) for automating the deployment, scaling, and management of containerized applications.
<br>
<br>

## What is Kubernetes (K8s)?

Kubernetes (K8s) is an open-source system for automating the deployment, scaling, and management of containerized applications. It manages the lifecycle of containers across a cluster of servers, ensuring that the desired state of your applications is maintained.

### Key Benefits of Kubernetes

- **Scalability:** Automatically scale applications up or down based on demand.
- **Reliability:** Ensures applications remain available by distributing containers across multiple nodes.
- **Automation:** Automates the creation, deletion, and management of containers.
- **High Availability and Fault Tolerance**: Kubernetes distributes containers across multiple nodes, ensuring the application remains available even if some nodes fail.

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

1. **Build a Docker image of your application:**
   ```sh
   docker build -t <docker-registry>/k8s:latest .
   ```

2. **Push your Docker image to your Docker registry:**
   ```sh
   docker push <docker-registry>/k8s:latest
   ```  

3. **Start a Kubernetes cluster using Minikube:**
   ```sh
   minikube start
   ```  

4. **Apply the Kubernetes deployment and service files:**
   ```sh
   kubectl apply -f kubernetes/deployment.yaml
   ```  
   ```sh
   kubectl apply -f kubernetes/service.yaml
   ```

<br>

## General K8S commands  

**Restart all service:**
   ```sh
   kubectl rollout restart deployment k8s-deployment
   ``` 
   ```sh
   kubectl apply -f kubernetes/service.yaml
   ```  
<br>


## Cluster commands
**Check cluster status:**
   ```sh
   minikube status
   ```

**Delete the existing Minikube cluster:**
   ```sh
   minikube delete 
   ``` 

**Get cluster info**
   ```sh
   kubectl cluster-info
   ``` 

<br>
<br>

## Pods commands

**Create pod:**
   ```sh
   kubectl run <pod-name> --image=nginx
   ``` 

**Check Pods status:**
   ```sh
   kubectl get pods
   ``` 

**Get Pod information:**
   ```sh
   kubectl describe pod <pod-name>
   ``` 

**Get Pod logs:**
   ```sh
   kubectl logs <pod-name>
   ``` 

**Delete Pod by name:**
   ```sh
   kubectl delete pod <pod-name>
   ``` 

<br>
<br>

## Nods commands
**Get Node info**
   ```sh
   kubectl get nodes
   ``` 

**Explore node IP:**
   ```sh
   minikube ip
   ``` 