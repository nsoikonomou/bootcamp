num50e = int(input("Enter number of 50 euro banknotes:"))
num20e = int(input("Enter number of 20 euro banknotes:"))
num10e = int(input("Enter number of 10 euro banknotes:"))
num5e = int(input("Enter number of 5 euro banknotes:"))
num2e = int(input("Enter number of 2 euro coins:"))
num1e = int(input("Enter number of 1 euro coins:"))

sum = num50e*50 + num20e*20 + num10e*10 + num5e*5 + num2e*2 + num1e*1
print("You have",sum,"euros.")
