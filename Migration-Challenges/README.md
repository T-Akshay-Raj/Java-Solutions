## Migration Challenges

### 1. Deprecated annotation
eg: @Deprecated(forRemoval=true, since="1.7")

### 2. API Changes:
issues due to removal of class or methods
Removed modules:
Issues due to removal of entire module
Impacted Libraries:
Third party libraries impacted by api or module changes

### 3. JDK internal libraries:
We may enable it by setting vm arg at runtime using --illegal-access JVM option
--illegal-access=permit(current default)
--illegal-access=deny(future default probably from 17)

## Migration module:
### 1. Using jdpes: 
- Step 1: In pom.xml add project build name tag and save
<finalName> appname</finalName> under build tag
- Step 2: Build project
mvn clean package
- Step 3: use jdeps to scan on generated target jar of application
from cmd:
cd target
jdeps -v .Appjarname.jar
- Step 4: for jdk internal
jdeps --jdk-internals .appjarname.jar
- Step 5: For getting dependency jar analysed
add maven dependency plugin under build->plugins tag
add new plugin
``` xml
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-dependency-plugin</artifactId>
<version>3.1.2</version>
<executions>
<execution>
<id>copy-dependencies></id>
<phase>package</phase>
<goals>
<goal>copy-dependencies</goal>
</goals>
</executions>
</execution>

</plugin>
```
- Step 6: Rebuild project and scan dependencies using jdeps
jdeps --class-path 'dependency/*' --jdk-internals --recursive .appjarname.jar


### 2. Using Migration toolkit for application business by IBM
used to scan application binaries
- a. download,extract and setup from ibm website
- b. run javabinaryscanner on our app.
	from cmd:
	java -jar .\binaryAppScanner.jar 'pathto/appjarname.jar'  --analyzeJavaSE --sourceJava=oracle8  
--targetJava=java11
- c. On Scan completion, AnaysisReport is open on browser with all details

### 3. IBM Websphere application server migration toolkit eclipse plugin
- a. add plugin from market place
- b. After setup, run analyzer on project by right click on project->software analyzer->configuration->new configuration->migrationname->select project for analyse under "select project for analyze"
ruleset->ibmwebsphere->set source and target java version->apply and run

### 4. Resolving code migration issues:
- a. after using tools to identify issues, correct them and compile the project with latest target java version
- b. rightclick project->build>buildpath->under libaries menu->add or select jdk version and click apply
note:remove old jdk or double click on jdk to change it
- c. remove the activeBydefault tag set on previous set of migration stragtegy in pom.xml and add the tag to java11 profile

### 5. Resolving dependency migration issues:
- update dependencies
- add required dependencies

## Gitbook
[Migration Challenges and tools Gitbook](https://akshay-gitbook.gitbook.io/migration-strategy/)
