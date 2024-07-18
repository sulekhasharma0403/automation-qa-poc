In order to start execution run following command from terminal:
mvn clean test -Pwith-tests -DsuiteXmlFile=testng.xml -Denv=qa

Based on your '-P'(Profile) value it will skip or not skip tests,
if only dependency installation needed run with -Pdefault (mvn clean install -Pdefault),
if test runs needed to execute run with -Pwith-tests (mvn clean test -Pwith-tests -DsuiteXmlFile=testng.xml -Denv=qa)

Based on your '-DsuiteXmlFile' value it will run that particular testng.xml file

Based on your '-Denv' value it will load that environment specific properties file
