def solution(slice, n):
    s1 = 0
    if n % slice == 0:
        s1 = n // slice
    else:
        s1 = n // slice + 1
    return s1