# 7. Write a program which makes use of function to display all such numbers which are divisible by 7 but are not a multiple of 5, between 1000 and 2000.

def myFunction(n):
    if i%7==0 and i%5!=0:
        print(i)
    return

print("All numbers from 1000 to 2000, which divisible by 7 and not multiply of 5:")
for i in range(1000,2000+1):
    myFunction(i)