def solution(numbers):
    sum = 0
    for i in numbers:
        sum += i
    
    avg = sum / len(numbers)
    return avg