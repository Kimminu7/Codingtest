def solution(a, b, c):
    answer = 0
    if (a!=b and b!=c and c!=a):
        answer = a+b+c
    elif (a==b and b==c and c==a):
        answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
    elif (a==b or a==c or b==c):
        answer = (a+b+c)*(a*a+b*b+c*c)
    
        
    return answer