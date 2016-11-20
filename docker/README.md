# Dockerized championship


## Setup

  1. Install docker
  2. Pull the image from the Hub (it might take some times as it relies on Ubuntu 16.04)

```
azrael:tmp mosser$ docker pull petitroll/island
```
The image contains:

  * Java 8 (Oracle version)
  * Maven 3.3.9
  * Git 2.7.4
    
## Starting a championship session

```
azrael:~ mosser$ docker run -it petitroll/island
```

This command starts the image previously created, and clone a fresh version of the 16-17 championship. It then set the workspace to the `deliveries` directory

**Warning**: the container is voluntarily volatile, no data will be saved until each start.

## Optional: building you own image

If you want to build your very own image instead of using the one pushed in the hub, simply build it using this dockerfile.

```
azrael:docker~ mosser$ docker build -t USERNAME/island .
```