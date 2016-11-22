"""
 Exercise 6 from the Python tutorial Part 1 on:
 https://codeandwork.github.io/courses/prep/pythonTutorial1.html
"""

numbers = int(input("Enter number of triangle numbers:"))
for n in range(1, numbers+1):
    print(int(n*(n+1)/2), end=" ")
