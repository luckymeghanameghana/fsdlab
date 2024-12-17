factorial.jsp
<!DOCTYPE html>
<html>
    <head>
        <title>Factorial Result</title>
        
    </head>
    <body>
        <h1>Factorial Result</h1>
        <% String nu=request.getParameter("num");%>
        <!-- Use the FactorialBean JavaBean -->
        <jsp:useBean id="factorialBean" class="com.example.beans.FactorialBean" scope="request" />
       
        <!-- Set the value of 'number' from the request parameter (from the form in index.jsp) -->
        <jsp:setProperty name="factorialBean" property="number" param="num" />
       
        <div class="result-container">
            <!-- Display the result -->
            <p>The factorial of <%= nu %> is:<jsp:getProperty name="factorialBean" property="factorial"/>
        </div>
       
        <br>
        <a href="index.html">Calculate another factorial</a>
    </body>
</html>
FcatorialBean.java
package com.example.beans;

public class FactorialBean {
    private int number;
    private long factorial;

    // Getter and Setter for number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        calculateFactorial(); // Recalculate factorial when the number is set
    }

    // Getter for factorial
    public long getFactorial() {
        return factorial;
    }
   
    // Method to calculate the factorial
    private void calculateFactorial() {
        factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }
}
index.html
    <html>
    <head>
        <title>Factorial Calculator</title>
    </head>
    <body>
        <h1>Factorial Calculator</h1>
        <form action="factorial.jsp" method="get">
            Enter a number:
            <input type="number" name="num" required>
            <br><br>
            <input type="submit" value="Calculate">
        </form>
    </body>
</html>
