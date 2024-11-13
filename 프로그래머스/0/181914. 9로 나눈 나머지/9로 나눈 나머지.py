def solution(number):
    
    sum = 0
    for i in number:
        sum += int(i)
     
    answer = sum % 9
    return answer