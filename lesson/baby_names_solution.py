baby_names_data = open("2021_baby_names.txt", "r")
baby_names = baby_names_data.readlines()


def get_earliest(my_list):
    #gets teh index of the earliest element in a list
    earliest = 0
    for index in range(len(my_list)):
        if my_list[index] < my_list[earliest]:
            earliest  = index
    return earliest


def selection_sort(copy_list):
    #copy_list = copy.deepcopy(my_list)
    if len(copy_list) == 1:
        return copy_list
    else:
        earl_item = copy_list[get_earliest(copy_list)]
        copy_list.remove(earl_item)
        return [earl_item]+selection_sort(copy_list)

def names_starting_with(names, letter):
    index = 0
    letter_list = []
    while not(names[index].startswith(letter.upper())):
        index+=1
        if index >= len(names):
            break
    while names[index].startswith(letter.upper()):
        letter_list.append(names[index][:-1])
        index+=1
        if index >= len(names):
            break
    return letter_list

baby_names = selection_sort(baby_names)
letter = input("Enter a letter: ")
letter_names = names_starting_with(baby_names,letter)
print(letter_names)
