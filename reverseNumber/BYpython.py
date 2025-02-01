number = int(input("Enter a number: "))

def reverse_number(number):
  reversed_number = 0
  while number > 0:
    reversed_number = reversed_number * 10 + (number % 10)
    number = number // 10
  print(reversed_number)

reverse_number(number)
