array = [1,2,2,2,8,2,2,2,2]
count = 1
max_length = 1
for i in range(len(array)):
    for j in range(i, len(array) - 1):
        if array[j + 1] == array[j]:
            count += 1
            if count > max_length:
                max_length = count
        else:
            break
    count = 1
print(max_length)