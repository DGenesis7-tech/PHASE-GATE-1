def car_slots(slots_list):
	empty = 0
	for index in range(1, 21):
		slots_list.append(empty)
	return slots_list
	
def park_car_from_right(slots_list, choice):
	for index in range(19, 1, -1):
		if choice == "right" and slots_list[index] == 0:
			slots_list[index] += 1;
			break 
		if type(choice) != type("a"):
			raise ValueError("Input must be a string")
	return slots_list

def park_car_from_left(slots_list, choice):
	for index in range(0, 20):
		if choice == "left" and slots_list[index] == 0:
			slots_list[index] += 1;
			break 
		if type(choice) != type("a"):
			raise ValueError("Input must be a string")	
	return slots_list
	
def remove_car_from_left_or_right(slots_list, choice):
	for index in range(0, 20):
		if choice == index and slots_list[index] == 1:
			slots_list[choice] -= 1;
			break
		if type(choice) != type(4):
			raise ValueError("Input must be a number")	
	 
	return slots_list
	

	





