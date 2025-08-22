#1. define function to take in a list as argument and return a list of size 20, with all index having value of 0.
#2. value 0 representing empty slots available.
#3. value 1 representing filled slots in Park.
#4. define function that allows car to fill in empty slots from the right when string "right" is called as an argument.
#5. define function that allows car to fill in empty slots from the left when string "left" is called as an argument.
#5. define function that rmoves car from any designated position left or right if slot is empty by passing a number from 0 - 19 as an argument.

from ParkingSystemFunction import car_slots, park_car_from_right, park_car_from_left, remove_car_from_left_or_right

my_array = [];
my_array = car_slots(my_array)
print("Total parking slots available (0) for available spaces (1) for the opposite: ", my_array)

my_array = park_car_from_right(my_array, "right")
print("Parking(1) car from the right : ", my_array)

my_array = park_car_from_left(my_array, "left")
print("Parking(1) car from the left : ", my_array)


my_array = remove_car_from_left_or_right(my_array, 0)
print("Removing(0) car from the left or right : ", my_array)
