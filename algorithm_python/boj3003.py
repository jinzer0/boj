# 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개

a = [1, 1, 2, 2, 2, 8]
b = [int(i) for i in input().split()]
[print(f"{a[i]-b[i]}", end=" ") for i in range(6)]