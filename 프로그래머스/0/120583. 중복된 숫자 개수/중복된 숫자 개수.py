def solution(array, n):
    a = 0
    for i in array:
        if i == n:
            a += 1
    return a