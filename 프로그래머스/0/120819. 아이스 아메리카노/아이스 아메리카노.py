def solution(money):
    # 아메리카노 한 잔의 가격
    ame = 5500
    # 최대 구매할 수 있는 잔 수
    num_americanos = money // ame
    # 남는 돈
    remaining_money = money % ame
    
    return [num_americanos, remaining_money]
