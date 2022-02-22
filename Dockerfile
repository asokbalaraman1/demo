FROM abalara/ubuntujava


WORKDIR /app

ADD ./target/Docker-1.0.jar docker.jar

CMD /opt/bin/java -jar  docker.jar
