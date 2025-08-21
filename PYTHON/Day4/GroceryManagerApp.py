def displayMenu():
	select = int(input( """
	::> WELCOME TO YOUR GROCERY APP <:::::::::::
	1. ADD ITEM TO YOUR GROCERY LIST.
	2. REMOVE ITEM FROM YOUR GROCERY LIST.
	3. DISPLAY ALL ITEMS CURRENTLY IN YOUR LIST.
	4. EXIT APP.
	::::::::::::::::::::::::::::::::::::::::::::
	NOTE!!!!!>
	*YOU CAN ONLY ADD ONE ITEM PER ENTRY!	
	*YOU CAN ONLY REMOVE ONE ITEM PER ENTRY!
	::::::::::::::::::::::::::::::::::::::::::::
	:> PLEASE SELECT AN OPTION FROM THE GIVEN LIST OF OPTIONS (1 - 4) <:
	"""))	
	return select
					
		
def add_to_list(my_list):
	item = input("Enter item to add to your list : ").strip().lower() 
	my_list.append(item)	
	print(f'item "{item}" was added to your list')
	return my_list

def remove_from_list(my_list):
	item = input("Enter item to remove from your list : ").strip().lower()
	if item in my_list: 
		my_list.remove(item)	
		print(f'item "{item}" was removed from your list')
	else:
		print(f'item "{item}" was not found on your list')
	return my_list

def show_items_on_the_list(my_list):
	if len(my_list) > 0:
		print("Items on your list are:")
		for count_item, item in enumerate(my_list, 1): 
			print(f"{count_item}. {item}")
	else :
		print("You have an empty list")
	return my_list

my_list = []
select = displayMenu()
while True:
	select = displayMenu()	
	if type(select) != type(7):
		print("Invalid input")
	else:
		break
	
					
while select != 4:
	
	if select == 1:
		add_to_list(my_list)
	elif select == 2:
		remove_from_list(my_list)
	elif select == 3	:
		show_items_on_the_list(my_list)
	elif select == 4:
		print("Bye!!!, Come again!")
		break
	else :
		print("Invalid input")		
	
	select = displayMenu()

	
	
		