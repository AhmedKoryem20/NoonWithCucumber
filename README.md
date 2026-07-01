<div align="center">

# 🚀 Noon UI Automation Testing Framework

### A Scalable UI Automation Framework for the Noon E-Commerce Platform (Guest User Mode)

<p align="center">

<img src="https://img.shields.io/badge/Java-23-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Selenium-4.39.0-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>
<img src="https://img.shields.io/badge/Cucumber-BDD-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/>
<img src="https://img.shields.io/badge/TestNG-Testing-EA4C89?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/Allure-Reports-FF6B6B?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Log4j2-Logging-F7B500?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Git-Version%20Control-F05032?style=for-the-badge&logo=git&logoColor=white"/>
<img src="https://img.shields.io/badge/GitHub-Repository-181717?style=for-the-badge&logo=github"/>

</p>

---

### **Built with Modern Automation Engineering Practices**

**Java • Selenium WebDriver • Cucumber (BDD) • TestNG • Maven • Page Object Model • Factory Design Pattern • JSON Data-Driven Testing • Allure Reports • Log4j2**

---

> *"Automation is not about clicking buttons faster—it's about building reliable, maintainable, and scalable software that validates business value."*

</div>

---

# 📖 Table of Contents

- [About the Project](#-about-the-project)
- [Project Objectives](#-project-objectives)
- [Why This Project Stands Out](#-why-this-project-stands-out)
- [Technology Stack](#-technology-stack)
- [Framework Highlights](#-framework-highlights)
- [Framework Architecture](#-framework-architecture)
- [Project Structure](#-project-structure)
- [Automation Scenarios](#-automation-scenarios)
- [Framework Components](#-framework-components)
- [Prerequisites](#-prerequisites)
- [Installation Guide](#-installation-guide)
- [Running the Project](#-running-the-project)
- [Reporting & Logging](#-reporting--logging)
- [Engineering Decisions](#-engineering-decisions)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

# 📌 About the Project

## Overview

This project is a **UI Automation Testing Framework** developed to automate essential user journeys on the **Noon E-Commerce Platform** from the perspective of a **Guest User** (non-authenticated customer).

Unlike many automation projects that focus solely on writing Selenium scripts, this framework has been designed with **maintainability**, **reusability**, and **scalability** in mind by applying modern software engineering principles and industry-standard automation practices.

The framework follows a layered architecture that separates business logic, UI interactions, driver management, utilities, and test execution, making it easier to extend, maintain, and debug as the application evolves.

This repository demonstrates how a professional UI automation framework can be structured using **Behavior-Driven Development (BDD)** with **Cucumber**, **Page Object Model (POM)**, and the **Factory Design Pattern**, while generating rich execution reports through **Allure** and detailed runtime logs with **Log4j2**.

---

# 🎯 Project Objectives

The primary objectives of this project are to:

- Design a maintainable and scalable UI automation framework.
- Automate real-world Guest User scenarios on the Noon platform.
- Apply modern automation testing best practices.
- Separate business logic from UI implementation.
- Improve framework readability through the Page Object Model.
- Support multiple browser execution.
- Produce detailed execution reports using Allure.
- Generate structured execution logs using Log4j2.
- Demonstrate clean architecture suitable for enterprise-scale automation projects.

---

# ⭐ Why This Project Stands Out

Many Selenium projects focus only on automating browser interactions.

This project goes a step further by emphasizing **automation framework design** rather than individual test scripts.

### Key Engineering Practices

- ✅ Layered Framework Architecture
- ✅ Behavior-Driven Development (BDD)
- ✅ Page Object Model (POM)
- ✅ Factory Design Pattern
- ✅ Cross-Browser Support
- ✅ JSON Data-Driven Testing
- ✅ Explicit Wait Strategy
- ✅ Reusable Utilities
- ✅ Structured Logging
- ✅ Interactive Allure Reporting
- ✅ Modular Test Design
- ✅ Maintainable Project Structure

The objective was not simply to automate the Noon website, but to build a framework that can be easily extended with new scenarios while maintaining clean, organized, and reusable code.

---

# 🛠 Technology Stack

| Technology | Purpose |
|------------|---------|
| ☕ Java | Core programming language |
| 🌐 Selenium WebDriver | Browser automation engine |
| 🥒 Cucumber BDD | Behavior-Driven Development |
| 🧪 TestNG | Test execution framework |
| 📦 Maven | Dependency & build management |
| 📊 Allure | Interactive execution reporting |
| 📝 Log4j2 | Logging framework |
| 📄 JSON | Test data management |
| 💻 IntelliJ IDEA | Development environment |
| 🐙 Git & GitHub | Version control |

---

# 💼 What This Project Demonstrates

This repository demonstrates practical experience with:

| Skill | Status |
|--------|:------:|
| Java | ✅ |
| Selenium WebDriver | ✅ |
| Cucumber BDD | ✅ |
| TestNG | ✅ |
| Page Object Model | ✅ |
| Factory Pattern | ✅ |
| JSON Data-Driven Testing | ✅ |
| Cross-Browser Automation | ✅ |
| Explicit Waits | ✅ |
| Allure Reporting | ✅ |
| Log4j2 Logging | ✅ |
| Git & GitHub | ✅ |
| Maven | ✅ |
| Automation Framework Design | ✅ |

---

# ✨ Framework Highlights

- Modular Page Object Model architecture.
- Cross-browser execution through a centralized WebDriver Factory.
- Guest User automation scenarios.
- Data-driven testing using JSON files.
- BDD implementation with Cucumber feature files.
- Rich HTML reports using Allure.
- Centralized logging using Log4j2.
- Explicit Wait strategy for synchronization.
- Reusable utilities and helper classes.
- Clean separation between business logic and UI interactions.

---

# 🏗 Framework Architecture

```
                          Feature Files
                               │
                               ▼
                       Runner Classes
                               │
                               ▼
                     Cucumber Step Definitions
                               │
                               ▼
                         Page Object Classes
                               │
                               ▼
                            Base Page
                               │
                               ▼
                     WebDriver Factory
                               │
        ┌──────────────────────┼──────────────────────┐
        ▼                      ▼                      ▼
 Chrome Driver          Firefox Driver          Edge Driver
        │                      │                      │
        └──────────────────────┼──────────────────────┘
                               ▼
                      Noon Web Application
```

### Architecture Overview

The framework follows a layered architecture where each layer has a single responsibility.

This design reduces code duplication, improves maintainability, and allows new test scenarios to be added with minimal modifications to the existing codebase.

---

# 📂 Project Structure

```text
Noon_Cucumber
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── BasePage
│   │   │   ├── Pages
│   │   │   └── ...
│   │   │
│   │   └── resources
│   │       ├── Data.json
│   │       └── log4j2.properties
│   │
│   └── test
│       └── java
│           ├── Drivers
│           ├── Hooks
│           ├── BaseTest
│           ├── Utilities
│           ├── Feature Files
│           ├── Step Definitions
│           └── Runner Classes
│
├── allure-results
├── allure-report
├── logs
├── screenshots
├── pom.xml
└── README.md
```

### Package Responsibilities

| Package | Responsibility |
|----------|----------------|
| **Pages** | Contains all Page Object classes responsible for interacting with the application's UI. |
| **BasePage** | Provides reusable Selenium actions shared across all page classes. |
| **Drivers** | Initializes browser instances using the Factory Design Pattern. |
| **Hooks** | Manages test lifecycle events before and after scenario execution. |
| **Step Definitions** | Connects Gherkin steps to Java implementations. |
| **Feature Files** | Defines business scenarios using Gherkin syntax. |
| **Utilities** | Houses reusable helper classes such as JSON readers, screenshots, waits, and logging utilities. |
| **Runner Classes** | Configures and executes Cucumber scenarios using TestNG. |

---
# 🧪 Automated Test Scenarios

The automation suite focuses on validating critical business workflows performed by **Guest Users** on the Noon E-Commerce platform. Each scenario has been designed based on the project's Software Requirements Specification (SRS) and follows the principles of Behavior-Driven Development (BDD).

---

## 📱 Scenario 1 — Browse Samsung Products & Apply Filters

### 🎯 Business Objective

Validate that a guest user can browse Samsung products, apply price filters, and sort the results using Noon’s filtering capabilities.

### Automation Flow

- Launch Noon website
- Navigate to Samsung products
- Apply price range filter
- Sort products by recommendation
- Verify that the applied filters are reflected correctly

### Expected Result

- Samsung products are displayed successfully.
- Price filter is applied correctly.
- Products are sorted according to the selected option.

---

## 🎧 Scenario 2 — Search & Add Multiple Products to Cart

### 🎯 Business Objective

Ensure that a guest user can search for products, add multiple items to the shopping cart, and verify the cart contents.

### Automation Flow

- Open Noon homepage
- Search for the desired product
- Select products from the search results
- Add multiple products to the cart
- Navigate to the Cart page
- Verify cart contents

### Expected Result

- Selected products appear in the shopping cart.
- Product names, quantities, and prices are displayed correctly.

---

## 🛒 Scenario 3 — Verify Guest Checkout Summary

### 🎯 Business Objective

Validate that a guest user can proceed through the checkout process until the order summary page without authentication.

### Automation Flow

- Navigate to the shopping cart
- Proceed to checkout
- Continue as Guest
- Fill required information
- Verify order summary

### Expected Result

- Checkout page loads successfully.
- Order details match the selected products.
- Prices and totals are calculated correctly.

---

## ❌ Scenario 4 — Invalid Product Search Validation

### 🎯 Business Objective

Verify the application's behavior when a guest user searches for a product that does not exist.

### Automation Flow

- Open Noon website
- Search using an invalid keyword
- Verify the application's response

### Expected Result

- Appropriate "No Results Found" message is displayed.
- Application remains stable without unexpected behavior.

---

# 🏛 Framework Components

The project follows a layered automation architecture that separates responsibilities across independent components. This design improves readability, maintainability, and scalability.

---

## 📄 Feature Files

Feature files contain business-readable scenarios written using **Gherkin syntax**.

Example:

```gherkin
Feature: Add Products To Cart

Scenario: Guest user adds multiple products
```

Feature files describe **what** should happen without exposing implementation details.

---

## 🥒 Step Definitions

Step Definitions connect Gherkin statements to Java code.

Responsibilities:

- Implement business logic
- Call Page Objects
- Perform validations
- Keep scenarios readable

---

## 🖥 Page Object Model (POM)

Each page within the Noon application is represented by a dedicated Java class.

Responsibilities:

- Store page locators
- Encapsulate UI interactions
- Hide Selenium implementation details
- Improve code reusability

This approach minimizes duplication and simplifies maintenance when the application's UI changes.

---

## 🏗 BasePage

The `BasePage` acts as the foundation for all Page Object classes.

It centralizes reusable Selenium actions such as:

- Click
- Send Keys
- Explicit Waits
- Scroll
- JavaScript Executor
- Mouse Actions
- Element Visibility
- Browser Navigation

By consolidating these operations, the framework avoids code duplication and promotes consistency across all pages.

---

## 🏭 WebDriver Factory

The WebDriver Factory is responsible for creating browser instances dynamically.

Supported browsers include:

- Google Chrome
- Mozilla Firefox
- Microsoft Edge

Using the Factory Design Pattern allows browser initialization to remain centralized, making it easier to extend support for additional browsers in the future.

---

## 🪝 Hooks

Hooks manage the test lifecycle.

Responsibilities include:

- Browser initialization
- Browser termination
- Scenario setup
- Scenario cleanup
- Report preparation

This ensures that every scenario executes within a clean and isolated environment.

---

## 📂 Utilities

The Utilities package contains reusable helper classes shared across the framework.

Examples include:

- JSON file management
- Screenshot capture
- Logging utilities
- Common helper methods

Keeping these functionalities centralized improves maintainability and prevents duplicated code.

---

# 🏗 Design Patterns & Best Practices

The framework follows several software engineering principles to ensure long-term maintainability.

| Practice | Purpose |
|----------|---------|
| 🏛 Page Object Model | Separate UI interactions from test logic |
| 🏭 Factory Pattern | Centralize browser creation |
| 🥒 BDD | Improve readability through business scenarios |
| 📄 JSON Test Data | Separate test data from implementation |
| ⏳ Explicit Waits | Improve test stability |
| 📊 Allure Reports | Rich execution reporting |
| 📝 Log4j2 | Structured runtime logging |
| ♻ Reusable Components | Reduce duplicated code |
| 📦 Maven | Manage dependencies and project lifecycle |

---

# 💻 Prerequisites

Before running the project, ensure the following software is installed:

| Software | Recommended Version |
|-----------|---------------------|
| Java JDK | 23 or later |
| Apache Maven | Latest Stable |
| IntelliJ IDEA Community / Ultimate | Latest |
| Git | Latest |
| Google Chrome | Latest |
| Allure Commandline | Latest |

---

# ⚙ Installation Guide

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/AhmedKoryem20/NoonWithCucumber/tree/main.git
```

Navigate to the project directory:

```bash
cd Noon_Cucumber
```

---

## 2️⃣ Open the Project

Open **IntelliJ IDEA**.

Select:

```
Open → Noon_Cucumber
```

Wait for Maven to import all dependencies automatically.

---

## 3️⃣ Install Required IntelliJ Plugins

Install the following plugins:

- ✅ Cucumber for Java
- ✅ Gherkin
- ✅ Maven
- ✅ TestNG

Restart IntelliJ after installation.

---

## 4️⃣ Verify Maven Dependencies

Open the Maven panel and click:

```
Reload All Maven Projects
```

This downloads all required libraries defined in `pom.xml`.

---

## 5️⃣ Verify Allure Installation

Execute:

```bash
allure --version
```

If the version number is displayed, Allure is installed successfully.

Otherwise, install Allure and ensure its `bin` directory is added to the system PATH.

---

## 6️⃣ Verify Java Installation

```bash
java -version
```

Expected output:

```text
Java 23
```

---

## 7️⃣ Verify Maven Installation

```bash
mvn -version
```

If Maven and Java information appear successfully, the environment is ready.

---

# ▶ Running the Project

The framework supports multiple execution methods to accommodate different development and testing workflows.

---

# 🖥 Method 1 — Execute from IntelliJ IDEA

This is the recommended approach during development.

### Steps

1. Open the project in IntelliJ IDEA.
2. Allow Maven to finish downloading all dependencies.
3. Navigate to the desired Runner class.
4. Right-click the Runner class.
5. Select **Run**.

The framework will automatically:

- Launch the selected browser.
- Execute the Cucumber scenarios.
- Generate execution logs.
- Store Allure results.
- Close the browser after execution.

---

# 🧪 Method 2 — Execute Using testng.xml

The project also supports execution through **TestNG Suite Configuration**.

Locate:

```
testng.xml
```

Right-click

```
Run 'testng.xml'
```

This approach is useful for executing the complete automation suite using a predefined TestNG configuration.

---

# 💻 Method 3 — Execute Using Maven

Open a terminal in the project root directory and execute:

```bash
mvn clean test
```

This command performs the following actions:

- Cleans previous build artifacts.
- Compiles the project.
- Executes all configured Cucumber scenarios.
- Generates Allure result files.
- Produces execution logs.

---

# 📊 Generate the Allure Report

Once the execution has completed successfully, generate the report using:

```bash
allure serve
```

Allure will:

- Generate a temporary HTML report.
- Launch a local web server.
- Automatically open the report in your browser.

---

# ⚡ Complete Execution Workflow

To execute the test suite and immediately open the Allure report:

```bash
mvn clean test && allure serve -h localhost
```

This command provides the fastest execution workflow during development.

---

# 🔄 Framework Execution Lifecycle

The following diagram illustrates the complete execution flow inside the framework.

```
                           User
                             │
                             ▼
                     Execute Test Suite
                             │
                             ▼
                        testng.xml
                             │
                             ▼
                      Runner Classes
                             │
                             ▼
                    Cucumber Feature Files
                             │
                             ▼
                     Step Definitions
                             │
                             ▼
                      Page Object Classes
                             │
                             ▼
                         BasePage
                             │
                             ▼
                    WebDriver Factory
                             │
         ┌───────────────────┼────────────────────┐
         ▼                   ▼                    ▼
      Chrome             Firefox               Edge
         │                   │                    │
         └───────────────────┼────────────────────┘
                             ▼
                     Noon Web Application
                             │
                             ▼
                       Assertions
                             │
                             ▼
                  Logs + Allure Reports
```

---

# 📊 Test Reporting

The framework integrates **Allure Reports** to provide detailed execution insights.

The generated reports include:

- Test execution summary
- Passed tests
- Failed tests
- Execution duration
- Failure details
- Step-by-step execution
- Exception stack traces

The report provides a clear overview of the framework's execution status and simplifies debugging.

---

# 📝 Logging

Logging is implemented using **Apache Log4j2**.

Execution logs include:

- Browser initialization
- Page navigation
- User interactions
- Test execution status
- Exception details
- Framework events

Logs are generated automatically and stored inside the project's `logs` directory.

Structured logging improves traceability and significantly reduces debugging time.

---

# 📸 Screenshot Capture

The framework includes screenshot capabilities to simplify issue investigation.

Screenshots can be captured:

- During execution
- On validation failures
- For debugging purposes

These screenshots provide additional context when analyzing failed scenarios.

---

# 📦 Dependency Management

Project dependencies are managed through **Apache Maven**.

The `pom.xml` file centralizes all required libraries, ensuring consistent project configuration across different environments.

Key dependencies include:

| Dependency | Purpose |
|------------|---------|
| Selenium WebDriver | Browser automation |
| Cucumber Java | BDD implementation |
| Cucumber TestNG | Test execution |
| TestNG | Test framework |
| Maven Compiler | Project compilation |
| Gson | JSON processing |
| Log4j2 | Logging |
| Allure | Reporting |
| Apache POI | File handling |

---

# 💡 Engineering Decisions

One of the primary goals of this project was to demonstrate not only browser automation, but also sound software engineering principles.

The following architectural decisions were made intentionally.

---

## 🏛 Why Page Object Model?

The Page Object Model separates UI interactions from test logic.

Benefits include:

- Improved readability
- Reduced code duplication
- Easier maintenance
- Better scalability

When the application's UI changes, updates are typically limited to the corresponding Page Object instead of multiple test classes.

---

## 🏭 Why Factory Design Pattern?

Different browsers require different driver implementations.

Instead of creating browser instances throughout the project, a centralized Factory is responsible for browser creation.

Benefits include:

- Centralized browser management
- Easier browser switching
- Better extensibility
- Cleaner architecture

---

## 🥒 Why Cucumber?

Cucumber enables Behavior-Driven Development (BDD), allowing test scenarios to be written in business-readable language.

This improves collaboration between:

- QA Engineers
- Developers
- Business Analysts
- Product Owners

---

## 🧪 Why TestNG?

TestNG provides a robust execution engine responsible for:

- Test lifecycle management
- Suite execution
- Runner integration
- Reporting compatibility

Combined with Cucumber, it delivers both readable scenarios and flexible execution.

---

## 📄 Why JSON?

Separating test data from test logic improves maintainability.

Instead of hardcoding values inside the codebase, test data is stored externally and can be updated independently.

---

## 📊 Why Allure?

Allure provides rich and interactive execution reports.

Compared to standard console output, Allure offers:

- Better visualization
- Detailed execution history
- Step tracking
- Improved debugging experience

---

## 📝 Why Log4j2?

Logging provides visibility into framework execution.

Rather than relying solely on console output, Log4j2 records important runtime events that help diagnose failures efficiently.

---

## ⏳ Why Explicit Waits?

Modern web applications are dynamic.

Explicit waits improve stability by synchronizing test execution with the application's state, reducing flaky tests caused by timing issues.

---

# ✅ Best Practices Implemented

The framework follows several software engineering and automation testing best practices.

✔ Page Object Model (POM)

✔ Factory Design Pattern

✔ Behavior-Driven Development (BDD)

✔ Cross-Browser Support

✔ Modular Framework Architecture

✔ JSON Data-Driven Testing

✔ Explicit Wait Strategy

✔ Centralized Logging

✔ Rich HTML Reporting

✔ Reusable Utility Classes

✔ Separation of Concerns

✔ Maven Dependency Management

✔ Clean and Readable Code

---

# 🚀 Future Enhancements

Although the framework already follows modern automation engineering practices, there are several opportunities for future expansion.

Planned improvements include:

- 🔄 Parallel test execution using TestNG.
- ☁️ Selenium Grid integration for distributed execution.
- 🐳 Docker support for consistent test environments.
- ⚙️ CI/CD integration using GitHub Actions or Jenkins.
- 📱 Mobile web automation using Appium.
- 📊 Test analytics dashboard.
- 📈 Historical Allure trend reports.
- 🌐 Cloud execution using BrowserStack or Sauce Labs.
- 📂 External configuration using `config.properties`.
- 📄 Excel-based Data-Driven Testing.
- 🔐 Authentication scenarios for registered users.
- 🛍 Complete end-to-end checkout automation including payment simulation.

---

# 🤝 Contributing

Contributions, suggestions, and improvements are always welcome.

If you would like to improve this project:

1. Fork the repository.
2. Create a new feature branch.
3. Commit your changes.
4. Push the branch.
5. Open a Pull Request.

Constructive feedback is highly appreciated.

---

# 🐞 Troubleshooting

Below are common issues and their solutions.

| Issue | Solution |
|--------|----------|
| Maven dependencies are not downloaded | Reload the Maven project from IntelliJ or execute `mvn clean install`. |
| Browser does not start | Ensure the installed browser version matches the supported WebDriver version. |
| Allure command is not recognized | Verify that Allure Commandline is installed and added to the system PATH. |
| Feature files are not detected | Confirm that the Runner class points to the correct feature directory and glue package. |
| Plugins are missing | Install the required IntelliJ plugins (Cucumber, Gherkin, TestNG, Maven). |
| Tests fail due to synchronization | Review explicit waits and ensure elements are fully loaded before interaction. |

---

# 📚 Learning Outcomes

This project was an opportunity to strengthen practical experience in designing and implementing a maintainable UI automation framework rather than focusing solely on browser automation.

Key areas of learning include:

- Framework architecture design.
- Behavior-Driven Development (BDD).
- Page Object Model implementation.
- Factory Design Pattern.
- Cross-browser execution.
- Automation reporting with Allure.
- Structured logging using Log4j2.
- JSON Data-Driven Testing.
- Framework scalability and maintainability.
- Clean project organization.
- Git & GitHub collaboration.

The experience reinforced the importance of writing automation that is not only functional but also maintainable, reusable, and easy to extend.

---

# 🏆 Project Summary

This project demonstrates the implementation of a professional UI automation framework that validates essential Guest User journeys on the Noon E-Commerce platform.

Throughout the development process, the primary focus was placed on:

- Clean architecture.
- Maintainable design.
- Readable automation code.
- Reusable components.
- Reliable browser automation.
- Industry-standard reporting.
- Scalable framework structure.

Rather than treating automation as a collection of Selenium scripts, this framework approaches testing as a software engineering discipline by applying established design patterns and best practices.

---

# 📸 Project Preview

> **The following assets will be added to this repository:**

- 📷 Framework Structure
- 📷 Project Execution
- 📷 Allure Dashboard
- 📷 Test Results
- 📷 Browser Execution
- 🎥 Project Demonstration Video

---

# ⭐ Repository Highlights

### Framework Features

- ✅ Guest User Automation
- ✅ Java
- ✅ Selenium WebDriver
- ✅ Cucumber BDD
- ✅ TestNG
- ✅ Page Object Model
- ✅ Factory Design Pattern
- ✅ JSON Data-Driven Testing
- ✅ Cross-Browser Support
- ✅ Explicit Wait Strategy
- ✅ Log4j2 Logging
- ✅ Allure Reporting
- ✅ Maven Project
- ✅ Modular Framework Architecture

---

# 👨‍💻 Author

## Ahmed Koryem

**Software QA & Automation Engineer**

Passionate about designing scalable automation frameworks, improving software quality, and applying software engineering principles to automated testing.

### Connect with me

- 💼 LinkedIn: *(www.linkedin.com/in/ahmedkoryem20)*
- 🐙 GitHub: *(https://github.com/AhmedKoryem20)*
- 📧 Email: *(ahmedkoryem20@gmail.com)*

---

# 🙏 Acknowledgments

Special thanks to everyone who contributes to the open-source ecosystem.

This project leverages several outstanding technologies, including:

- Oracle Java
- Selenium WebDriver
- Apache Maven
- Cucumber
- TestNG
- Allure Framework
- Apache Log4j2
- Google Gson

Their continuous development makes projects like this possible.

---

<div align="center">

# ⭐ If you found this project helpful, consider giving it a Star!

### Thank you for taking the time to review this project.

**Happy Testing! 🚀**

</div>