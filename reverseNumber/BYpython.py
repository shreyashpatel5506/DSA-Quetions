number = int(input("Enter a number: "))
sign = '-' if number < 0 else ''
abs_number = abs(number)

def reverse_number(abs_number):
  reversed_number = 0
  while abs_number > 0:
    reversed_number = reversed_number * 10 + (abs_number % 10)
    abs_number = abs_number // 10
  return reversed_number

reversed_number = reverse_number(abs_number)
if sign:
  reversed_number = int(sign + str(reversed_number))
print(reversed_number)
