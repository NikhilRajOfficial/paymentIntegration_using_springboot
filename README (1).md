
#  Payment_integration_using_springboot(Paytm)

# ⁛ Project Overview 
This project is a Spring Boot application that integrates with Paytm's payment gateway to handle online payments. It provides a simple interface for users to enter their payment details, and upon submission, it redirects them to the Paytm payment page for processing the transaction.





## ⁕ Documentation 



**How It Works:**

• Users visit the home page and fill out the payment form with their details.

• Upon submission, the application generates a checksum and redirects the user to the  Paytm payment page.

• After completing the payment, Paytm sends a response back to the application, which validates the response and displays the payment status to the user.

**Key Features:**

**User-Friendly Interface:** A simple and intuitive web form for users to input their payment information, including Customer ID, Transaction Amount, and Order ID.

**Secure Payment Processing:** Utilizes Paytm's secure payment gateway for handling transactions, ensuring data integrity and security through checksum validation.

**Real-Time Payment Status:** Displays the result of the payment transaction, indicating whether it was successful or failed, along with relevant transaction details.

**Spring Boot Framework:** Built using Spring Boot, leveraging its powerful features for web applications, dependency injection, and configuration management.


## ⁂ Tech Stack

**Java:** Programming language used for backend development.

**Spring Boot:** Framework for building the application.

**Thymeleaf:** Templating engine for rendering HTML views.

**Paytm Payment Gateway API:**  For processing payments(You can you any payments Gateway , here i am using paytm ).

**HTML/CSS:** For frontend design


## » Installation

**1) Create a New Spring Boot Project**

**2) Open Spring Initializr on google.**

**3) Go to Spring Initializr.**

**4) Add data according to you** 

**5) Add Dependencies:**
   
   `Spring Web`
`Spring DevTools`
    
`Thymeleaf`


**6) Open the Project in Your IDE
Open your IDE (e.g., IntelliJ IDEA, Eclipse , Vs code).**

Import the project:

`For IntelliJ IDEA: Choose File > Open, then select the extracted project folder.`

`For Eclipse: Choose File > Import, then select Maven > Existing Maven Projects and select the extracted project folder.`

**7)  Modify the pom.xml File**



`Open the pom.xml file located in the root of your project directory.`



i) Add the Paytm Maven Repository:

`Add the following <repositories> section just before the closing </project> tag in your pom.xml file:`

`<repositories>
    <repository>
        <id>my-repo1</id>
        <url>http://artifactorypg.paytm.in/artifactory/libs-release</url>
    </repository>
</repositories>`




ii)Add the Paytm Checksum Dependency:
Add the following dependency inside the <dependencies> section:

    
    `<dependency>
    <groupId>com.paytm</groupId>
    <artifactId>paytm-checksum</artifactId>
    <version>1.2.0</version>
`


## ⬇️ Configuration

- Before running the application, you need to configure your Paytm credentials. Apply this in  **application.properties file** in the src/main/resources directory with the following properties:

`paytm.payment.sandbox.merchantId=YOUR_MERCHANT_ID`
`paytm.payment.sandbox.merchantKey=YOUR_MERCHANT_KEY`
`paytm.payment.sandbox.channelId=YOUR_CHANNEL_ID`
`paytm.payment.sandbox.website=YOUR_WEBSITE`
`paytm.payment.sandbox.industryTypeId=YOUR_INDUSTRY_TYPE_ID`
`paytm.payment.sandbox.paytmUrl=YOUR_PAYTM_URL
paytm.mobile=YOUR_MOBILE_NUMBER`
`paytm.email=YOUR_EMAIL_ADDRESS`
## Acknowledgements

This structured documentation provides a comprehensive overview of your Paytm Payment Integration project, covering everything from setup to usage and contributing guidelines. Feel free to modify any sections to better fit your project's specifics or your personal style!


## Screenshots

![App Screenshot]![Screenshot 2024-08-25 165344](https://github.com/user-attachments/assets/35caad37-a191-4147-8890-224b25589963)


## Optimizations

Contributions are welcome! If you would like to contribute to this project, please follow these steps:
Fork the repository.
Create a new branch for your feature or bug fix.
Commit your changes.
Push to your branch.
Submit a pull request.


## Support

For support, email njha7548@gmail.com.

