"""260000
4
20000 5
30000 2
10000 6
5000 8"""

total = int(input())
count = int(input())
all = 0
for i in range(count):
    a = input().split()
    all += int(a[0])*int(a[1])
print("Yes") if total==all else print("No")