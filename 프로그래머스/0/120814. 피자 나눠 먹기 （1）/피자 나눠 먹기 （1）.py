def solution(n):
    s1 = 7
    s2 = 0
    if n % s1 == 0:
        s2 = n // s1
    else:
        s2 = n // s1 + 1
    return s2