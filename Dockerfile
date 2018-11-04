FROM cubeearth/oracle-java8

RUN mkdir -p /opt/eureka && \
	cd /opt/eureka && \
	wget https://github.com/Cube-Earth/spring-eureka/releases/download/1.0.0/eureka-1.0.0.jar
	
ENTRYPOINT [ "/usr/local/bin/java", "-jar", "/opt/eureka/eureka-1.0.0.jar" ]