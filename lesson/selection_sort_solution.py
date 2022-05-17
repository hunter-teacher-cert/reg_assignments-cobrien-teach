
class_list = ["Yosuf","Luis", "Rafiki", "Sam", "Saad", "Maddox","Chris"]

def get_earliest(my_list):
    #gets teh index of the earliest element in a list
    earliest = 0
    for index in range(len(my_list)):
        if my_list[index] < my_list[earliest]:
            earliest  = index
    return earliest

print("earliest index: " + str(get_earliest(class_list)))

def selection_sort(my_list):

    if len(my_list) == 1:
        return my_list
    else:
        earl_item = my_list[get_earliest(my_list)]
        my_list.remove(earl_item)
        return [earl_item]+selection_sort(my_list)

print("Unsorted list:" + str(class_list))
print("Selection sort:" + str(selection_sort(class_list)))
