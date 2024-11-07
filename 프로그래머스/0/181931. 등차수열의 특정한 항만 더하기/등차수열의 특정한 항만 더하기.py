def solution(a, d, included):
    arr = [a]
    
    for i in range(len(included)-1):
        
        a = a+d
        arr.append(a)
    sum = 0    
    for i in range(len(included)):
        if included[i] == True:
            sum += arr[i]
    
    return sum