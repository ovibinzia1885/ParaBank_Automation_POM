# ParaBank_Automation_POM

## Technology:
- Tool: selenium
- IDE: IntelIJ
- Build tool: Gradle
- Language: Java
- Framework: TestNG
## Requirement:
-Multiple User Registration
- Randomly two Userlogin
- Transfer amount
- Find Transaction
- Update Phone Number
- Logout
## Prerequisite:
1. Need to install jdk 1.8
2. Need good internet connectivity
3. If sever is down script will not work in allure report
4. If server is down you must run individully class 
## Run the automation script:
1. Open cmd to the project folder
2. Type this command:

```sh
gradle clean test
```
3. Selenium will open the browser and start automation.
4. To view report, type this command:
```sh
allure generate allure-results --clean -o allure-report
allure serve allure-results
```
