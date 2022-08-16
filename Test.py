# -*- coding: utf-8 -*-
"""
Created on Tue Aug 16 08:03:14 2022

@author: sergi
"""
import random

# Write your code here.
# Make sure to use `random.randint` to pick your random number.

rng1=input("Enter the start of the range: ")
rng2=input("Enter the end of the range: ")
rng3=random.randint(rng1,rng2)
if rng2 <= rng1:
    print("Please enter a valid number.") 
    rng2=input("Enter the end of the range: ")
