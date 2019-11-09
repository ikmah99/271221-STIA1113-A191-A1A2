# Student Info
Matric: 271221

Name: Wong Fang Man

# Introduction
In this assignment, I learned to create a car loan calculator by writing a pseudocode, drawing a flow chart and writing a java code. I also learned the formula to calculate and apply in java program. Beside that, the car loan calculator used to calculate the monthly repayment of car, loan of car, principal of car, interest of car and balance payment of car.

# Pseudocode
START

Output "Enter car price (RM)"

Input car price

Loop the input car price while the car price less than RM30000

Output "Enter down payment (RM)"

Input down payment

Loop the input down payment while the down payment less than RM0

Output "Enter loan period (year)"

Input loan period

Loop the input loan period while the loan period less than 5 years or more than 9 years

Output "Enter interest rate (%)"

Input interest rate

Loop the input interest rate while the interest rate less than 3 or more than 7

Calculate monthly repayment (RM)

Total Interest = (car price-down payment) * (interest rate/100) * loan period

Total Payment = (car price-down payment) + total interest

Monthly Payment = total payment / (loan period*12)

Output monthly repayment

Calculate principal = (total payment/loan period)

Calculate interest = (total interest/loan period)

Calculate balance = total payment-(total payment/loan period)

Output years, principal, interest, balance

Loop years, principal, interest, balance depend on the loan period

END

# Flow Chart
![CarLoanCalculator](https://user-images.githubusercontent.com/55380522/68533419-b154ed00-0363-11ea-9b35-76273264b8ed.png)

# Screenshot of Output
<img width="960" alt="Screenshot of Output" src="https://user-images.githubusercontent.com/55380522/68533427-c9c50780-0363-11ea-858c-0b535940af66.png">
