In order to start execution run following command from terminal:
mvn clean test -DsuiteXmlFile=testng.xml -Denv=qa

Based on your 'suiteXmlFile' value it will run that particular testng.xml file
Based on your 'env' value it will load that environment specific properties file
