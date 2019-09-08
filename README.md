# docker-spring-boot
### Build image
- sudo docker build -f Dockerfile -t docker-spring-boot .

### Run image (8080 application port exposed outside using 8085)
- sudo docker run -p 8085:8080 docker-spring-boot


