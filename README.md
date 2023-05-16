# SpigotAPI
Official Universal API for Vortex Development spigots.

# VortexSpigot: https://www.mc-market.org/resources/20988/
# RocketSpigot: https://www.mc-market.org/resources/22238/

# How to use?
- Clone the repository to any folder
- Run "mvn clean install" to publish it to your Local Maven Repo
- Add dependency to your project before your spigot dependency

Example:
```xml
  <dependencies>
        <dependency>
            <groupId>eu.vortexdev</groupId>
            <artifactId>spigot-api</artifactId>
            <version>dev</version>
            <scope>provided</scope>
        </dependency>
    
        <dependency>
            <groupId>org.papermc</groupId>
            <artifactId>paperspigot</artifactId>
            <version>1.8.8</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/libs/spigot.jar</systemPath>
        </dependency>
  </dependencies>
```
