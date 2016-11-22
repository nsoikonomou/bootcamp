"""
 Exercise 4 from the Python tutorial Part 1 on:
 https://codeandwork.github.io/courses/prep/pythonTutorial1.html
"""

import math

print("Give the length of each side in order to compute the area of a triangle.")
lenA = float(input("Give the length of side A:"))
lenB = float(input("Give the length of side B:"))
lenC = float(input("Give the length of side C:"))

triangleArea = (1/4) * math.sqrt((lenA+lenB+lenC) * (-lenA+lenB+lenC) * (lenA-lenB+lenC) * (lenA+lenB-lenC))

print("The triangle area is:", triangleArea)
