# Collaborative Prose

## Components Used

- **Prose Builder**  
  Repository: [https://github.com/judusan/prose-builder](https://github.com/judusan/prose-builder)  
  Maven Dependency:  
  ```xml
  <dependency>
    <groupId>de.htw_berlin.fb4.ossd</groupId>
    <artifactId>prose_builder</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
  ```
    
- **Prose App** by Shamanina

    Repository: https://github.com/sha-ma-ni/prose-app-deploy

    Maven Dependency:

  ```xml
  <dependency>
    <groupId>de.htw_berlin.fb4.proseapp_Shamanina</groupId>
    <artifactId>prose-app</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
  ```

- **My Prose App** by Elise

  Repository: https://maven.pkg.github.com/eliseHtw/my-prose-app

  Maven Dependency:

  ```xml
  <repository>
      <id>eliseHtw</id>
      <url>https://maven.pkg.github.com/eliseHtw/my-prose-app</url>
    </repository>
  </repositories>
  ```

## Maven Dependencies Configuration
The Maven dependencies were added in the pom.xml under the <dependencies> section to include the external prose components. Also, necessary GitHub package repositories were configured under <repositories> to fetch the SNAPSHOT versions of these components.

## Example Output
```xml
Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung.
Manchmal führt der Umweg zum schönsten Ziel.
In jedem Irrtum steckt oft mehr Erkenntnis als in mancher Wahrheit.
```
