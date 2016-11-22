"""
 Exercise 7 from the Python tutorial Part 1 on:
 https://codeandwork.github.io/courses/prep/pythonTutorial1.html
"""

numbers = int(input("Enter number of pronic numbers:"))
for n in range(1, numbers+1):
    print(n*(n+1), end=" ")
