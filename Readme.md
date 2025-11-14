📌 REST Assured API Automation Framework

This project is a REST Assured API Automation Framework built using Java and TestNG.
It follows a modular, scalable, and maintainable structure suitable for real-world API testing, CI/CD pipelines, and reporting.

🚀 Tech Stack

Java 8+

REST Assured

TestNG

Maven

Allure Reporting

Log4j2

Apache POI

Jenkins (for CI/CD)

📁 Project Structure
src
├─ main
│   ├─ java
│   └─ resources
└─ test
├─ java
│   ├─ base
│   ├─ httpmethods
│   ├─ payload_management
│   ├─ testcases
│   ├─ utils (Excel, Config, Logs)
│   └─ pojos
└─ resources
├─ log4j2.xml
├─ config.properties
└─ testdata.xlsx

🔧 Features

✔ Framework based on REST Assured
✔ End-to-end API automation
✔ Maven-driven test execution
✔ TestNG for test management, grouping & parallel execution
✔ Allure Reporting
✔ Log4j2 logging (console + file logs)
✔ Apache POI for Excel-driven test data
✔ Reusable utilities (payloads, config reader, Excel reader)
✔ Integrated with Jenkins CI/CD

📦 How to Run Tests
▶️ 1. Run using Maven
mvn test

▶️ 2. Run specific TestNG group
mvn test -Dgroups=smoke

▶️ 3. Run with specific TestNG XML
mvn test -DsuiteXmlFile=testng.xml

🧪 Allure Report
Generate report:
allure generate allure-results --clean -o allure-report

Open report:
allure serve allure-results

📝 Logging (Log4j2)

Logs are printed in:

/logs/application.log


Log4j2 is configured in log4j2.xml.

📊 Test Data (Apache POI)

Test data is read from:

/src/test/resources/testdata.xlsx


A dedicated ExcelUtility handles:

reading multiple sheets

fetching row/column values

data-driven testing

🤖 Jenkins Setup (CI/CD)
Add a Jenkins job:

Create Freestyle or Pipeline job

Pull code from GitHub

Add Maven build step:

mvn clean test


Post-build: Publish Allure Report

(Optional) Add scheduled job using CRON

(Optional) Add email notifications for failed builds

🛠 How to Customize

Add new endpoints under httpmethods

Store request payloads under payload_management

Add POJO classes for serialization/deserialization

Add Excel test data for data-driven scenarios

Create TestNG groups (smoke, regression, sanity)

📄 Pre-requisites

Ensure the following are installed:

Java JDK 8+

Maven 3.6+

Allure command-line

Git

