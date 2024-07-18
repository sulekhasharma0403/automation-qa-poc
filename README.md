```markdown
```
# Selenium Test Automation Framework

This is a test automation framework using Selenium, Java, TestNG, and Maven. It supports running tests in multiple environments and reading test data from Excel files.

## Prerequisites

- Java 8 or later
- Maven 3.6.0 or later
- Git (for version control)
- A web browser (e.g., Chrome)

## Configuration

### Environment Configuration

Properties files for different environments are located in the `src/main/resources/config` directory.

- `qa.properties`
- `prod.properties`

### Test Data

Test data is stored in an Excel file located at `src/test/resources/testdata.xlsx`.

## Running Tests

### Using Maven

To build the project without running tests:

```sh
mvn clean install -Pdefault
```

To run tests:

```sh
mvn clean test -Pwith-tests -DsuiteXMLFile=testNG.xml -Denv=qa
```
## Framework Components

### Page Object Model (POM)

Page classes are located in the `src/main/java/com/example/pages` directory. Each page class corresponds to a web page in the application.

- **BasePage.java**: Contains common methods used by all page classes.
- **HomePage.java**: Represents the home page.
- **LoginPage.java**: Represents the login page.

### Utility Classes

Utility classes are located in the `src/main/java/com/example/utils` directory.

- **ConfigReader.java**: Reads configuration properties from environment-specific properties files.
- **ExcelUtils.java**: Reads test data from Excel files.

### Test Classes

Test classes are located in the `src/test/java/com/example` directory.

- **HomePageTest.java**: Contains tests for the home page.
- **LoginPageTest.java**: Contains tests for the login page.

## Dependencies

The project uses the following dependencies:

- **Selenium WebDriver**: `org.seleniumhq.selenium:selenium-java:4.4.0`
- **TestNG**: `org.testng:testng:7.4.0`
- **Apache POI**: `org.apache.poi:poi-ooxml:5.2.2`, `org.apache.poi:poi:5.2.2`

All dependencies are managed through Maven and listed in the `pom.xml` file.

## Adding New Tests

1. Create a new page class in the `src/main/java/com/example/pages` directory.
2. Create a new test class in the `src/test/java/com/example` directory.
3. Add the new test methods to the test class.
4. Update the `testNG.xml` file to include the new test class.

## Running Tests in Headless Mode

To run tests in headless mode, set the `headless` property to `true` in the environment-specific properties file.

```properties
# qa.properties
url=https://example.com
headless=true
```