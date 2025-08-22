def display_menu(select):
	if select.isdigit():
		return int(select)
	else:
		raise ValueError("Input must be a number")
		return 	
					
		
def add_to_list(my_list, item):
	if isinstance(item, str):
		my_list.append(item)	
		print(f'item "{item}" was added to your list')
		return my_list
	else:
		raise ValueError("Input must be a string")
		
def remove_from_list(my_list, item):
	if item in my_list: 
		my_list.remove(item)	
		print(f'item "{item}" was removed from your list')
	else:
		print(f'item "{item}" was not found on your list')
	return my_list

def show_items_on_the_list(my_list, item):
	if len(my_list) > 0:
		print("Items on your list are:")
		for count_item, item in enumerate(my_list, 1): 
			print(f"{count_item}. {item}")
	else :
		print("You have an empty list")
	return my_list


	
	
		