def solution(a, b):
    x = int(str(a)+str(b))
    y = 2*a*b
    
    if x > y :
        return x
    elif x < y :
        return y