"""
 Exercise 5 from the Python tutorial Part 1 on:
 https://codeandwork.github.io/courses/prep/pythonTutorial1.html
"""

sum = 1
for n in range(1, 6):
    if n == 1:
        print(sum)
    if n > 1:
        step = 1/n
        sum += step
        print(sum)
