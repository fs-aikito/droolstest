Works:
```
$ mvn clean install
[..]
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] droolstest ......................................... SUCCESS [  0.225 s]
[INFO] droolstest-common .................................. SUCCESS [  4.471 s]
[INFO] droolstest-mod1 .................................... SUCCESS [  0.955 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[..]
```

Works:
```
$ mvn verify
[..]
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.Mod1Test
testMod1()
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[..]
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] droolstest ......................................... SUCCESS [  0.006 s]
[INFO] droolstest-common .................................. SUCCESS [  3.915 s]
[INFO] droolstest-mod1 .................................... SUCCESS [  0.815 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[..]
```

**Does not work:**
```
$ mvn test
[..]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ droolstest-common ---
[INFO] Surefire report directory: C:\Users\aikito\Documents\repos\droolstest\droolstest-common\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.CommonTest
testCommon()
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building droolstest-mod1 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ droolstest-mod1 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ droolstest-mod1 ---
[INFO] No sources to compile
[INFO]
[INFO] --- kie-maven-plugin:7.6.0.Final:build (default) @ droolstest-mod1 ---
[INFO] Adding KieModule from resource: FileResource[file=C:\Users\aikito\Documents\repos\droolstest\droolstest-mod1\src\main\resources]
[WARNING] Unable to find pom.properties in /C:/Users/aikito/Documents/repos/droolstest/droolstest-mod1/src/main/resources
[INFO] Recursed up folders, found and used pom.xml C:\Users\aikito\Documents\repos\droolstest\droolstest-mod1\pom.xml
[INFO] KieModule was added: FileKieModule[releaseId=com.example:droolstest-mod1:1.0-SNAPSHOT,file=C:\Users\aikito\Documents\repos\droolstest\droolstest-mod1\src\main\resources]
[ERROR] Unable to build KieBase, could not find include: common_base
[ERROR] Message [id=1, kieBase=mod1_base, level=ERROR, path=src/main/resources/META-INF/kmodule.xml, line=0, column=0
   text=Unable to build KieBase, could not find include: common_base]
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] droolstest ......................................... SUCCESS [  0.006 s]
[INFO] droolstest-common .................................. SUCCESS [  3.866 s]
[INFO] droolstest-mod1 .................................... FAILURE [  0.312 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.338 s
[INFO] Finished at: 2018-02-23T16:26:52+02:00
[INFO] Final Memory: 44M/510M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.kie:kie-maven-plugin:7.6.0.Final:build (default) on project droolstest-mod1: Build failed! -> [Help 1]
[..]
```

Works:
```
$ mvn -pl droolstest-mod1 test
[..]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ droolstest-mod1 ---
[INFO] Surefire report directory: C:\Users\aikito\Documents\repos\droolstest\droolstest-mod1\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.Mod1Test
testMod1()
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[..]
```