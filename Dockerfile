FROM openjdk:11.0
COPY target/AreasOfmaths.jar AreasOfmaths.jar
CMD java -jar AreasOfmaths.jar