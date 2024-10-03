# WakeFit_WebAutomation_practice
This project automates key functionalities of the Wakefit website using Selenium WebDriver and Cucumber BDD. It includes automated tests for searching products, verifying search suggestions, and handling errors when no suggestions are found.

**Project Overview**
Framework: Selenium WebDriver
Behavior-Driven Development: Cucumber with Gherkin syntax
Test Runner: JUnit
Browser Management: WebDriverManager
Dependency Management: Maven

**Key Features:**
Automates product search functionality on Wakefit's website.
Verifies if related products appear in the search suggestions.
Handles error scenarios when no product suggestions are found.
Uses Page Object Model (POM) for better structure and maintainability.

**Prerequisites**
Java 8 or higher installed on your system.
Maven installed for dependency management.
Git installed for version control.

Getting Started
1. Clone the Repository
bash
Copy code
git clone //github.com/sagargit97/WakeFit_WebAutomation_practice.git
cd wakefit-website-automation-practice
2. Set Up Dependencies
Run the following Maven command to install the necessary dependencies:

bash
Copy code
mvn clean install
3. Run Tests
You can execute tests using Maven:

bash
Copy code
mvn test
4. Generate Cucumber Reports
To generate detailed reports after running the tests:

bash
Copy code
mvn verify
Project Structure
src/main/java: Contains the Page Object Model (POM) classes and reusable methods.
src/test/java: Holds the step definitions for Cucumber scenarios.
src/test/resources: Stores feature files written in Gherkin syntax.
Example Feature File (Search Product)
gherkin
Copy code

Feature: Product Search on Wakefit Website

  Scenario: Search for a product and verify suggestion
    Given url set to open website
    When click on the search bar
    And enter "mattress" in search bar
    Then should see a list of products related to "mattress"
    When no products are shown
    Then capture and display the error message
    
**How It Works**
Selenium WebDriver handles browser automation tasks, interacting with the web elements on the Wakefit website.
Cucumber BDD allows you to write tests in plain English using Gherkin syntax for better collaboration.
JUnit is used as the test runner to execute the Cucumber feature files.

**Reporting**
Cucumber test reports are generated after running the tests. These reports are stored in the target/cucumber-reports folder and provide detailed information about test execution.

**Contributions**
Contributions are welcome! Feel free to fork this repository and submit pull requests for any improvements or additional features.

**License**
This project is licensed under the MIT License - see the LICENSE file for details.

**Contact**
For any questions or suggestions, feel free to reach out:

Email: sagar.senapati125@gmail.com
GitHub: sagargit97
